package com.revature.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.entity.Employee;
import com.revature.entity.Request;
import com.revature.util.DBConnectionUtil;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	Connection connection = null;
	Statement statement = null;
	ResultSet resultSet = null;
	
	public static Employee createUser(String name,String pass){  
		Employee employee = new Employee();  
		try{  

			String sql = "select * from employees where username = '"+name+"' and password = '"+pass+"'";  
			Connection connection = DBConnectionUtil.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);

			resultSet.next();
			employee.setId(resultSet.getInt("employee_id"));
			employee.setUsername(resultSet.getString("username"));
			employee.setPassword(resultSet.getString("password"));
			employee.setFirstName(resultSet.getString("first_name"));
			employee.setLastName(resultSet.getString("last_name"));
			employee.setEmail(resultSet.getString("email"));
			
			return employee;
			          
		}catch(Exception e){System.out.println(e);}  
		return null;  
	} 
	
	public static boolean validate(String name,String pass){  
		boolean status=false;  
		try{  
		
			Connection con = DBConnectionUtil.getConnection();  
	      
			PreparedStatement ps=con.prepareStatement(  
			"select * from employees where username=? and password=?");  
			ps.setString(1,name);  
			ps.setString(2,pass);  
	      
			ResultSet rs=ps.executeQuery();  
			status=rs.next();  
	          
		}catch(Exception e){System.out.println(e);}  
		return status;  
	} 
	
	public int getRequestCount() {
		try {
			String sql = "select count(*) from requests";  
			Connection connection = DBConnectionUtil.getConnection();
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			rs.next();
			return rs.getInt(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;		
	}

	//An Employee can submit a reimbursement request
	@Override
	public void submitRequest(int empid,int manid, int reqamt) {
		int id = getRequestCount()+1;
		String expdate = "19-APR-19";
		String status = "pending";
		String decision = "";
		  
		try {
			String sql ="INSERT INTO requests (request_id, employee_id, manager_id, request_amount, expense_date, status, decision) " +
                "VALUES (" + id +", '" + empid + "', '" +  manid + "', '" +  reqamt + "', '" +  expdate + "', '" +  status + "', '" + decision + "')";  
			Connection connection = DBConnectionUtil.getConnection();
			Statement statement = connection.createStatement();
			statement.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}

	//An Employee can view their pending reimbursement requests
	public List<Request> viewPending(int id) {
		List<Request> list = null;
		Request request = null;
				
		try {
			list = new ArrayList<Request>();
			String sql = "select * from requests "+
				    "where employee_id = "+id+" and status = 'pending'";

			Connection connection = DBConnectionUtil.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			
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

	//An Employee can view their resolved reimbursement requests
	public List<Request> viewResolved(int id) {
		List<Request> list = null;
		Request request = null;
				
		try {
			list = new ArrayList<Request>();

			String sql = "select * from requests "+
				    "where employee_id = "+id+" and status = 'resolved'";
					

			Connection connection = DBConnectionUtil.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);

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

	//An Employee can view their information
	public Employee viewInformation(int id) {
		Employee employee = new Employee();  
		try{  

			String sql = "select * from employees where id = "+id;  
			Connection connection = DBConnectionUtil.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);

			resultSet.next();
			employee.setId(resultSet.getInt("employee_id"));
			employee.setUsername(resultSet.getString("username"));
			employee.setPassword(resultSet.getString("password"));
			employee.setFirstName(resultSet.getString("first_name"));
			employee.setLastName(resultSet.getString("last_name"));
			employee.setEmail(resultSet.getString("email"));
			
			return employee;
			          
		}catch(Exception e){System.out.println(e);}  
		return null; 		
	}

	//An Employee can update their information
	@Override
	public void updateInformation(String firstname, String lastname, String email, int id) {		
		try {
			String sql = "update employees set first_name = '"+firstname+"', last_name='"+lastname+"',email = '"+email+"' where employee_id="+id;  
			Connection connection = DBConnectionUtil.getConnection();
			Statement statement = connection.createStatement();		
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
