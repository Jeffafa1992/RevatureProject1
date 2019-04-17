package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.entity.Employee;
import com.revature.entity.Manager;
import com.revature.entity.MgrRequest;
import com.revature.entity.Request;
import com.revature.util.DBConnectionUtil;

public class ManagerDAOImpl implements ManagerDAO {
	
	Connection connection = null;
	Statement statement = null;
	ResultSet resultSet = null;
	
	public static Manager createUser(String name,String pass){  
		Manager manager = new Manager();  
		try{  

			String sql = "select * from managers where username = '"+name+"' and password = '"+pass+"'";  
			Connection connection = DBConnectionUtil.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);

			resultSet.next();
			manager.setId(resultSet.getInt("manager_id"));
			manager.setUsername(resultSet.getString("username"));
			manager.setPassword(resultSet.getString("password"));
			manager.setFirstName(resultSet.getString("first_name"));
			manager.setLastName(resultSet.getString("last_name"));
			manager.setEmail(resultSet.getString("email"));
			
			return manager;
			          
		}catch(Exception e){System.out.println(e);}  
		return null;  
	} 
	
	public static boolean validate(String name,String pass){  
		boolean status=false;  
		try{  
		
			Connection con = DBConnectionUtil.getConnection();  
	      
			PreparedStatement ps=con.prepareStatement(  
			"select * from managers where username=? and password=?");  
			ps.setString(1,name);  
			ps.setString(2,pass);  
	      
			ResultSet rs=ps.executeQuery();  
			status=rs.next();  
	          
		}catch(Exception e){System.out.println(e);}  
		return status;  
	} 
	
	//A Manager can approve/deny pending reimbursement requests
	@Override
	public void makeDecision() {

	}
	
	//A Manager can view all pending requests from all employees
	public List<Request> viewPending(){
		List<Request> list = null;
		Request request = null;
				
		try {
			list = new ArrayList<Request>();

			String sql = "select * from requests where status = 'pending'";
			connection = DBConnectionUtil.getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);

			while(resultSet.next()) {
				request = new Request();
				request.setId(resultSet.getInt("request_id"));						
				request.setEmpId(resultSet.getInt("employee_id"));
				request.setMgrId(resultSet.getInt("manager_id"));
				request.setRequestAmount(resultSet.getInt("request_amount"));
				request.setExpenseDate(resultSet.getString("expense_date"));
				request.setStatus(resultSet.getString("status"));
				request.setDecision(resultSet.getString("decision"));
				list.add(request);
			}
				return list;
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		return null;
	}
	
	//A Manager can view all resolved requests from all employees and see which manager resolved it
	@Override
	public List<MgrRequest> viewResolved() {
		List<MgrRequest> list = null;
		MgrRequest request = null;
				
		try {
			list = new ArrayList<MgrRequest>();
			String sql = "select m.first_name,m.last_name,r.request_id,r.status,r.decision "
					+"from requests r "
					+"join managers m on r.manager_id = m.manager_id "
					+"where status = 'resolved'";
		
			connection = DBConnectionUtil.getConnection();
			statement = connection.createStatement();
		    resultSet = statement.executeQuery(sql);

			while(resultSet.next()) {
				request = new MgrRequest();
				request.setFirstName(resultSet.getString("first_name"));						
				request.setLastName(resultSet.getString("last_name"));
				request.setRequestId(resultSet.getInt("request_id"));
				request.setStatus(resultSet.getString("status"));
				request.setDecision(resultSet.getString("decision"));
				list.add(request);
			}
				return list;
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		return null;
	}	
	
	//A Manager can view all Employees
	@Override
	public List<Employee> viewAllEmployees() {
		List<Employee> list = null;
		Employee employee = null;
		
		try {
			list = new ArrayList<Employee>();
			String sql = "select * from employees";

			connection = DBConnectionUtil.getConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);

			while(resultSet.next()) {
				employee = new Employee();
				employee.setId(resultSet.getInt("employee_id"));
				employee.setUsername(resultSet.getString("username"));
				employee.setPassword(resultSet.getString("password"));
				employee.setFirstName(resultSet.getString("first_name"));
				employee.setLastName(resultSet.getString("last_name"));
				employee.setEmail(resultSet.getString("email"));
				list.add(employee);
			}
			return list;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	//A Manager can view reimbursement requests from a single Employee
	@Override
	public List<Request> viewRequests(int id) {
		List<Request> list = null;
		Request request = null;
				
		try {
			list = new ArrayList<Request>();
			String sql = "SELECT  *"
		            + " FROM requests r"
		    		+ " join employees e on e.employee_id = r.employee_id"
		    		+ " where e.employee_id =" + id;
		
				connection = DBConnectionUtil.getConnection();
				statement = connection.createStatement();
				resultSet = statement.executeQuery(sql);

			while(resultSet.next()) {
				request = new Request();
				request.setId(resultSet.getInt("request_id"));						
				request.setEmpId(resultSet.getInt("employee_id"));
				request.setMgrId(resultSet.getInt("manager_id"));
				request.setRequestAmount(resultSet.getInt("request_amount"));
				request.setExpenseDate(resultSet.getString("expense_date"));
				request.setStatus(resultSet.getString("status"));
				request.setDecision(resultSet.getString("decision"));
				list.add(request);
			}
				return list;
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		return null;
	}


}
