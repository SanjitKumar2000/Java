package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Model.Employee;
import com.Model.EmployeeDao;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public LoginServlet() 
    {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String userid=request.getParameter("userid");
		String pass=request.getParameter("pass");
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		Employee emp=new Employee();
		emp.setUserid(userid);
		emp.setPassword(pass);
		
		emp=EmployeeDao.checklogin(emp);
		
		if(emp.getName().equals("")|| emp.getName().equals(null)) 
		{
			out.print("<h1>Login Successfull!</h1>");
			out.print("<h1>Welcome"+emp.getName()+" </h1>");
		}
		else
		{
			out.print("<h1>Eiher id or pass is incorrect</h1>");
			request.getRequestDispatcher("Login.jsp").include(request, response);
		}
	}

}
