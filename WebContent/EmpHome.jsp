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
			
	<a href="EmpSubmitRequest">Submit Request</a>
	<p>-An Employee can submit a reimbursement request</p>	
	
	<a href="EmpViewPending">View Pending Requests</a>
	<p>-An Employee can view their pending reimbursement requests</p>	
	
	<a href="EmpViewResolved">View Resolved Requests</a>
	<p>-An Employee can view their resolved reimbursement requests</p>	
	
	<a href="EmpViewInformation">View Information</a>
	<p>-An Employee can view their information</p>	
	
	<a href="EmpUpdateForm">Update Information</a>
	<p>-An Employee can up date their information</p>
	
	<a href="LogoutServlet">Logout</a>

</div>
</body>
</html>