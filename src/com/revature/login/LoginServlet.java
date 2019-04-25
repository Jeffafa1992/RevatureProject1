package com.revature.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.dao.EmployeeDAOImpl;
import com.revature.dao.ManagerDAOImpl;
import com.revature.entity.Employee;
import com.revature.entity.Manager;

//edit for new branch
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		  
		    response.setContentType("text/html");  
		    PrintWriter out = response.getWriter();  
		          
		    String n = request.getParameter("username");  
		    String p = request.getParameter("password");  
		          
		    if(EmployeeDAOImpl.validate(n, p)){  
		    	Employee emp = EmployeeDAOImpl.createUser(n, p);	    	
		    	request.getSession().setAttribute("emp", emp);	
		        RequestDispatcher rd = request.getRequestDispatcher("EmployeeHomePage");  	       
		        rd.forward(request,response);  
		    }  
		    else if(ManagerDAOImpl.validate(n, p)){
		    	Manager man = ManagerDAOImpl.createUser(n, p);
		    	request.getSession().setAttribute("man", man);
		    	RequestDispatcher rd = request.getRequestDispatcher("ManagerHomePage");  
		        rd.forward(request,response);  
		    }
		    else{         
		        RequestDispatcher rd = request.getRequestDispatcher("index.html");  
		        rd.include(request,response);  
		        out.print("This username or password is not recognized");  
		    }  	          
		    out.close();  		    
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
