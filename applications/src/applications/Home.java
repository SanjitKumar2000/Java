package applications;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import javax.swing.table.DefaultTableModel;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JScrollBar;
import java.awt.ScrollPane;
import java.awt.List;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JTextField;

public class Home extends JFrame {

	private JPanel contentPane;
	JScrollPane jsp;
	JTable jt;

	String data[][]=
		{
				{"101","aaaa","90000"},
				{"102","bbbb","75000"},
				{"103","cccc","68000"},
				{"104","dddd","45000"}
		};
	
	String head[]= {"Employee ID","Name","Salary"};
	private JTextField textField;
	private JTextField textField_1;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String Type[]= {"--Select Types--","1BHK","2BHK","3BHK","4BHK","5BHK"};
		
		String Furnish[]= {"--Furnishing Types--","Not Furnished","Semi Furnished","Fully Furnished"};
		
		String Rental[]= {"--Time Period--","Weekly","Monthly","Quaterly","Half Yearly","Yearly"};
		
		jt=new JTable(data,head);
		jt.setRowHeight(30);
		jt.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		jt.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Appartment ID", "Appartment Type", "Furnishing", "Rental Type", "Amenities", "Rent", "Area", "Flore"
			}
		));
		jt.getColumnModel().getColumn(0).setPreferredWidth(81);
		jt.getColumnModel().getColumn(1).setPreferredWidth(95);
		jt.getColumnModel().getColumn(2).setPreferredWidth(69);
		jsp=new JScrollPane(jt,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jsp.setFont(new Font("Tahoma", Font.BOLD, 10));
		jsp.setBounds(321, 11, 503, 539);
		
		contentPane.add(jsp);
		
		JComboBox aptype = new JComboBox(Type);
		aptype.setForeground(new Color(192, 192, 192));
		aptype.setBounds(152, 39, 159, 36);
		contentPane.add(aptype);
		
		JLabel lblNewLabel = new JLabel("Appartment Type");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 39, 132, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Amesnities");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 86, 132, 36);
		contentPane.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(152, 86, 159, 59);
		contentPane.add(scrollPane);
		
		JList list = new JList();
		list.setForeground(new Color(192, 192, 192));
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"None ", "Gym", "Pool", "Library", "Play area", "Club house"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(list);
		
		JLabel lblNewLabel_1_1 = new JLabel("Furnishing");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(10, 154, 132, 36);
		contentPane.add(lblNewLabel_1_1);
		
		JComboBox aptype_1 = new JComboBox(Furnish);
		aptype_1.setForeground(Color.LIGHT_GRAY);
		aptype_1.setBounds(152, 156, 159, 36);
		contentPane.add(aptype_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Rental Type");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBounds(10, 201, 132, 36);
		contentPane.add(lblNewLabel_1_1_1);
		
		JComboBox aptype_1_1 = new JComboBox(Rental);
		aptype_1_1.setForeground(Color.LIGHT_GRAY);
		aptype_1_1.setBounds(152, 203, 159, 36);
		contentPane.add(aptype_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Minumum Price");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1_1.setBounds(10, 248, 132, 36);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Maximum Price");
		lblNewLabel_1_1_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1_2.setBounds(10, 295, 132, 36);
		contentPane.add(lblNewLabel_1_1_1_2);
		
		textField = new JTextField();
		textField.setBounds(152, 250, 159, 36);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(152, 295, 159, 36);
		contentPane.add(textField_1);
		
		
		
	}
}
