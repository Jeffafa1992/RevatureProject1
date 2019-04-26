<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee</title>
<link rel="stylesheet" type="text/css" href="myStyle.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
	<h1>Hello ${emp.firstName}</h1>
	<h4>Your Id: ${emp.id}<br> Your Full Name: ${emp.firstName} ${emp.lastName}<br> 
	   Your User Name: ${emp.username}<br> Your Email: ${emp.email}</h4>
			
	<a href="EmpSubmitRequest">Submit Request</a>
	<p>Submit a reimbursement request</p>	
	
	<a href="EmpViewPending">View Pending Requests</a>
	<p>View your pending reimbursement requests</p>	
	
	<a href="EmpViewResolved">View Resolved Requests</a>
	<p>View your resolved reimbursement requests</p>		
	
	<a href="EmpUpdateForm">Update Information</a>
	<p>Update your information</p>
	
	<a href="LogoutServlet">Logout</a>

</div>
</body>
</html>