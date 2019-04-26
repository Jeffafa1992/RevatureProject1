package com.revature.empcontrol;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.dao.EmployeeDAO;
import com.revature.dao.EmployeeDAOImpl;
import com.revature.entity.Employee;

public class EmpPerformUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	EmployeeDAO empDAO = null;
    public EmpPerformUpdate() {
    	empDAO = new EmployeeDAOImpl();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Employee myEmp = (Employee) request.getSession().getAttribute("emp");
		int id = myEmp.getId();
		String username = myEmp.getUsername();
		String password = myEmp.getPassword();
		
		String first = request.getParameter("fname");
		String last = request.getParameter("lname");
		String email = request.getParameter("email");
		
		empDAO.updateInformation(first, last, email, id);
		Employee emp = empDAO.createUser(username,password);
		request.getSession().setAttribute("emp",emp);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/EmpHome.jsp");
		dispatcher.forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
