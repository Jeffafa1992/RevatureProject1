<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Manager</title>
</head>
<body>
	<h1>Hello ${man.firstName}</h1>
		<p>-A Manager can logout</p>
		<a href="index.html">Logout</a>
		
		<p>-A Manager can approve/deny pending reimbursement requests</p>
		<a href="MgrMakeDecision">Approve/Deny Requests</a>
		
		<p>-A Manager can view all pending requests from all employees</p>
		<a href="MgrViewPending">View Pending</a>
		
		<p>-A Manager can view all resolved requests from all employees and see which manager resolved it</p>
		<a href="MgrViewResolved">View Resolved</a>
		
		<p>-A Manager can view all Employees</p>
		<a href="MgrViewEmployees">View All Employees</a>
		
		<p>-A Manager can view reimbursement requests from a single Employee</p>
		<a href="MgrViewRequestForm">View Reimbursement Requests</a>

</body>
</html>