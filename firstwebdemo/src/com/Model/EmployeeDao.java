package com.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDao 
{
	static Connection con;
	static PreparedStatement ps;
	static ResultSet rs;
	
	public static Connection createConnection() 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:msql://localhost:3306/webproject","root","12345");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	public static Employee checklogin(Employee emp)
	{
		con=createConnection();
		try 
		{
			ps=con.prepareStatement("select * from employee1 where id=? and pass=?");
			ps.setString(1, emp.getUserid());
			ps.setString(2, emp.getPassword());
			
			rs=ps.executeQuery();
			if(rs.next()) 
			{
				emp.setName(rs.getString(3));
			}
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return emp;
	}
	
}
