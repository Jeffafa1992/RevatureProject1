package com.revature.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.dao.ManagerDAO;
import com.revature.dao.ManagerDAOImpl;
import com.revature.entity.MgrRequest;

public class MgrViewResolved extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ManagerDAO viewDao = null;
    public MgrViewResolved() {
        viewDao = new ManagerDAOImpl();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<MgrRequest> list = viewDao.viewResolved();
		request.setAttribute("list", list);
		RequestDispatcher rd = request.getRequestDispatcher("/views/MgrViewResolved.jsp");
	    rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
