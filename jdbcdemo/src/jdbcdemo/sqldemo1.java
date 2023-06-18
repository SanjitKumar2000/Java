package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class sqldemo1
{
	Connection con;
	Statement st;
	ResultSet rs;
	
	public sqldemo1()
	{
		try {
			Class.forName(" com.mysql.cj.jdbc.Driver.");
			System.out.println("driver found");
			
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","12345");
			System.out.println("Connection created");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void getRecords()
	{
		try {
			st=con.createStatement();
			rs=st.executeQuery("select * from employee");
			System.out.println("Record found");
			
			
			while(rs.next())
			{
				System.out.println("------------------------");
				System.out.println("ID: "+rs.getString(1));
				System.out.println("Name: "+rs.getString(2));
				System.out.println("Phone: "+rs.getInt(3));
				System.out.println("------------------------");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		sqldemo sd=new sqldemo();
		sd.getRecords();
	}
	
}
