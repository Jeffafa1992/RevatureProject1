<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee</title>
</head>
<body>
	<h1>Hello ${emp.firstName}</h1>

		<p>-An Employee can logout</p>
		<a href="index.html">Logout</a>
		
		<p>-An Employee can submit a reimbursement request</p>
		<a href="EmpSubmitRequest">Submit Request</a>
		
		<p>-An Employee can view their pending reimbursement requests</p>
		<a href="EmpViewPending">View Pending Requests</a>
		
		<p>-An Employee can view their resolved reimbursement requests</p>
		<a href="EmpViewResolved">View Resolved Requests</a>
		
		<p>-An Employee can view their information</p>
		<a href="EmpViewInformation">View Information</a>
		
		<p>-An Employee can up date their information</p>
		<a href="EmpUpdateForm">Update Information</a>

</body>
</html>