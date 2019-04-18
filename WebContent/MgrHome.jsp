<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Manager</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
	<h1>Hello ${man.firstName}</h1>
		<p>-A Manager can logout</p>
		<a href="LogoutServlet">Logout</a>
		
		<p>-A Manager can approve/deny pending reimbursement requests</p>
		<a href="MgrMakeDecision">Approve/Deny Requests</a>
		
		<p>-A Manager can view all pending requests from all employees</p>
		<a href="MgrViewPending">View Pending</a>
		
		<p>-A Manager can view all resolved requests from all employees and see which manager resolved it</p>
		<a href="MgrViewResolved">View Resolved</a>
		
		<p>-A Manager can view all Employees</p>
		<a href="MgrViewEmployees">View All Employees</a>
		
		<p>-A Manager can view reimbursement requests from a single Employee</p>
		<p>Enter the employees ID number:</p>
        <form action="MgrViewRequests" method="POST">
	        <input type="text" name="empID">
	        <input type="submit" value="Enter">
        </form>

</body>
</html>