<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Resolved</title>
</head>
<body>
<a href="EmployeeHomePage" >Go Back</a>
	<table border="1">
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
</body>