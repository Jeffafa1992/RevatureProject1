package com.revature.dao;

import java.util.List;

import com.revature.entity.Employee;
import com.revature.entity.Manager;
import com.revature.entity.MgrRequest;
import com.revature.entity.Request;

public interface ManagerDAO {
	Manager createUser(String name,String pass);
	
	//A Manager can approve/deny pending reimbursement requests
	void makeDecision(int id,String decision);
	
	List<Request> viewPending(int id);
	//A Manager can view all pending requests from all employees
	List<Request> viewPending();
	
	//A Manager can view all resolved requests from all employees and see which manager resolved it
	List<MgrRequest> viewResolved();
	
	//A Manager can view all Employees
	List<Employee> viewAllEmployees();
	
	//A Manager can view reimbursement requests from a single Employee
	List<Request> viewRequests(int id);

}
