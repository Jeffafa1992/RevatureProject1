<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Resolved</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
<a href="EmployeeHomePage" >Go Back</a>
	<div class="container">
	<table class="table table-hover">
		<tr>
			<th>Request Id</th>
			<th>Employee Id</th>
			<th>RequestAmount</th>
			<th>Expense Date</th>
			<th>Status</th>
			<th>Decision</th>
		</tr>
		<c:forEach items="${viewResolved}" var="request">
			<tr>
				<td>${request.id}</td>
				<td>${request.empId}</td>
				<td>${request.requestAmount}</td>
				<td>${request.expenseDate}</td>
				<td>${request.status}</td>
				<td>${request.decision}</td>
			</tr>
		</c:forEach>
	</table>
	</div>
</body>