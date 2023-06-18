package applications;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Textfield extends JFrame {

	private JPanel contentPane;
	JTextArea text;
	JScrollPane jsp;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Textfield frame = new Textfield();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Textfield() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		text= new JTextArea();
		
		jsp=new JScrollPane(text,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jsp.setBounds(10, 10, 503, 540);
		contentPane.add(jsp);
		
		JLabel chars = new JLabel("char:");
		chars.setBounds(647, 37, 83, 19);
		contentPane.add(chars);
		
		JLabel words = new JLabel("words:");
		words.setBounds(647, 81, 83, 19);
		contentPane.add(words);
		
		JLabel file = new JLabel("Path:");
		file.setBounds(647, 126, 83, 19);
		contentPane.add(file);
		
		JLabel save = new JLabel("path:");
		save.setBounds(647, 172, 83, 19);
		contentPane.add(save);
		
		JButton btnNewButton = new JButton("char count");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String data=text.getText();
				int length=data.length();
				chars.setText("chars: "+length);
			}
		});
		btnNewButton.setBounds(523, 31, 100, 30);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("count words");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String data=text.getText();
				String d[]=data.split(" ");
				words.setText("words: "+d.length);
			}
		});
		btnNewButton_1.setBounds(523, 75, 100, 30);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Open File");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				JFileChooser jfc=new JFileChooser();
				int b1=jfc.showOpenDialog(getParent());
				if(b1==JFileChooser.OPEN_DIALOG)
				{
					File file=jfc.getSelectedFile();
					String path=file.getAbsolutePath();
					System.out.println("Filepath: "+path);
					
					try {
						FileInputStream input=new FileInputStream(file);
						int i=0;
						String filedata="";
						try {
							while((i=input.read())!=1); 
							{
								System.out.println((char)i);
								filedata=filedata+(char)i;
							}
							System.out.println("data: "+filedata);
							input.close();
							text.setText(text.getText()+""+filedata);
							
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		btnNewButton_2.setBounds(523, 120, 100, 30);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Save file");
		btnNewButton_3.setBounds(523, 166, 100, 30);
		contentPane.add(btnNewButton_3);
		
		
	}

}
