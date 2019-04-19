<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Manager</title>
<link rel="stylesheet" type="text/css" href="myStyle.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
	<h1>Hello ${man.firstName}</h1>
		
		<a href="MgrMakeDecision">Approve/Deny Requests</a>
		<p>Approve or deny pending reimbursement requests</p>
		
		<a href="MgrViewPending">View Pending</a>
		<p>-View pending requests from all employees</p>
		
		<a href="MgrViewResolved">View Resolved</a>
		<p>View resolved requests and deciding manager</p>
		
		<a href="MgrViewEmployees">View All</a>
		<p>View every employees information</p>
		
		
        <form action="MgrViewRequests" method="POST">
	        <input type="text" name="empID">
	        <input type="submit" class="btn btn-primary" value="Enter">
        </form>
       <p>Enter an employee ID number to view requests from employee:</p>
        
        <a href="LogoutServlet">Logout</a>
</div>
</body>
</html>