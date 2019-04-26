package com.revature.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.dao.EmployeeDAO;
import com.revature.dao.EmployeeDAOImpl;
import com.revature.dao.ManagerDAO;
import com.revature.dao.ManagerDAOImpl;
import com.revature.entity.Employee;
import com.revature.entity.Manager;
import com.revature.entity.Request;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	EmployeeDAO empDao = new EmployeeDAOImpl();
	ManagerDAO manDao = new ManagerDAOImpl();
    public LoginServlet() {
        super();
    }
    public static void clearCache(HttpServletResponse response) {  	
		response.setHeader("Cache-Control","no-cache");
		response.setHeader("Cache-Control","no-store");
		response.setHeader("Pragma","no-cache");
		response.setDateHeader ("Expires", 0);
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		  
		    response.setContentType("text/html");  
		    PrintWriter out = response.getWriter();  
		          
		    String n = request.getParameter("username");  
		    String p = request.getParameter("password");  
		          
		    if(EmployeeDAOImpl.validate(n, p)){  
		    	clearCache(response);
		    	Employee emp = empDao.createUser(n, p);	    	
		    	request.getSession().setAttribute("emp", emp);	
		        RequestDispatcher rd = request.getRequestDispatcher("EmployeeHomePage");  	       
		        rd.forward(request,response);  
		    }  
		    else if(ManagerDAOImpl.validate(n, p)){
		    	clearCache(response);
		    	Manager man = manDao.createUser(n, p);
		    	request.getSession().setAttribute("man", man);
		    	RequestDispatcher rd = request.getRequestDispatcher("ManagerHomePage");  
		        rd.forward(request,response);  
		    }
		    else{     
		    	clearCache(response);
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
