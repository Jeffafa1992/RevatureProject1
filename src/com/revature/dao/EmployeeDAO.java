package com.revature.dao;

public interface EmployeeDAO {	
	//An Employee can submit a reimbursement request
	void submitRequest(int empid, int reqamt);
	
	//An Employee can view their pending reimbursement requests
	//List<Request> viewPending(String n, String p);
	
	//An Employee can view their resolved reimbursement requests
	//List<Request> viewResolved(int id);
	
	//An Employee can view their information
	//void viewInformation(int id);
	
	//An Employee can up date their information
	void updateInformation(String firstname, String lastname, String email, int id);

	
}
