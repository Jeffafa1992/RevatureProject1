package com.revature.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.dao.ManagerDAO;
import com.revature.dao.ManagerDAOImpl;

public class MgrFinalDecision extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ManagerDAO myDao = null;
    public MgrFinalDecision() {
        myDao = new ManagerDAOImpl(); 		
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("requestId"));
		String decision = request.getParameter("mydecision");
		myDao.makeDecision(id, decision);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/MgrHome.jsp");
		dispatcher.forward(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
