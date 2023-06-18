package applications;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.AbstractBorder;
import javax.swing.border.EmptyBorder;

import arrays.UserData;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.EtchedBorder;

public class Rental extends JFrame {

	private JPanel contentPane;
	private JTextField userid;
	private JPasswordField pass;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rental frame = new Rental();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	UserData ud=new UserData();
	
	public Rental() {
		setTitle("Background Color for JFrame");
		setBounds(100,100,850,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		panel.setBounds(100, 79, 294, 234);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("User ID:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(27, 35, 79, 30);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(27, 83, 93, 30);
		panel.add(lblNewLabel_1_1);
		
		userid = new JTextField();
		userid.setBounds(122, 39, 142, 27);
		panel.add(userid);
		userid.setColumns(10);
		
		pass = new JPasswordField();
		pass.setBounds(122, 87, 142, 27);
		panel.add(pass);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String uid1=userid.getText();
				String upin1=new String(pass.getPassword());
				int f=0;
				
				for(int i=0;i<ud.id.length;i++) 
				{
					if(uid1.equals(ud.id[i]) && upin1.equals(ud.password[i]))
					{
						JOptionPane.showMessageDialog(getParent(), "Login Successful");
						f=1;
						Home home=new Home();
						home.setVisible(true);
						dispose();
					}
				}
				if(f==0)
				{
					JOptionPane.showMessageDialog(getParent(), "Invalid user ID OR Password");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(49, 156, 93, 30);
		panel.add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReset.setBounds(171, 156, 93, 30);
		panel.add(btnReset);
		
		JLabel lblNewLabel = new JLabel("Rental Management System");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(100, 11, 329, 46);
		getContentPane().add(lblNewLabel);
		
		JLabel background=new JLabel(new ImageIcon("C:\\Users\\ManuDhiman\\Pictures\\wallpaper\\rental.jfif"));
		background.setBounds(0, 0, 1000, 751);
		getContentPane().add(background);
		background.setVerticalAlignment(SwingConstants.TOP);
		background.setFont(new Font("Tahoma", Font.PLAIN, 6));
		background.setLayout(null);
		
		
		
	}
}
