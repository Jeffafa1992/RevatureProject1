package com.revature.dao;

import java.util.List;

import com.revature.entity.Employee;
import com.revature.entity.Request;

public interface EmployeeDAO {	
	//An Employee can submit a reimbursement request
	void submitRequest(int empid, int manid, int reqamt);
	
	//An Employee can view their pending reimbursement requests
	//List<Request> viewPending(int id);
	
	//An Employee can view their resolved reimbursement requests
	//List<Request> viewResolved(int id);
	
	//An Employee can view their information
    Employee viewInformation(int id);
	
	//An Employee can up date their information
	void updateInformation(String firstname, String lastname, String email, int id);

	
}
