package com.revature.empcontrol;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.dao.EmployeeDAOImpl;
import com.revature.entity.Employee;

public class EmpPerformSubmit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	EmployeeDAOImpl empDao = null;
    public EmpPerformSubmit() {
        empDao = new EmployeeDAOImpl();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Employee myEmp = (Employee) request.getSession().getAttribute("emp");
		
		int empid = myEmp.getId();		
		int managerid = Integer.parseInt(request.getParameter("manID"));
		int reqamt = Integer.parseInt(request.getParameter("amount"));
		
		empDao.submitRequest(empid,managerid,reqamt);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/EmpHome.jsp");
		dispatcher.forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
