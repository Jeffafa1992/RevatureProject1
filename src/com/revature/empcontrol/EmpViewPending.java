package com.revature.empcontrol;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.dao.EmployeeDAO;
import com.revature.dao.EmployeeDAOImpl;
import com.revature.entity.Employee;
import com.revature.entity.Request;

public class EmpViewPending extends HttpServlet {
	private static final long serialVersionUID = 1L;

	EmployeeDAO viewDao = null;
    public EmpViewPending() {
        viewDao = new EmployeeDAOImpl();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Employee myEmp = (Employee) request.getSession().getAttribute("emp");
		int id = myEmp.getId();
		
		List<Request> list = viewDao.viewPending(id);
		request.getSession().setAttribute("list", list);
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/views/EmpViewPending.jsp");
		dispatcher.forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
