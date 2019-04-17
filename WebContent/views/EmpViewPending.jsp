<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Pending</title>
</head>
<body>
<a href="EmployeeHomePage" >Go Back</a>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>Employee Id</th>
			<th>RequestAmount</th>
			<th>Expense Date</th>
			<th>Status</th>
		</tr>
		<c:forEach items="${viewPending}" var="request">
			<tr>
				<td>${request.id}</td>
				<td>${request.empId}</td>
				<td>${request.requestAmount}</td>
				<td>${request.expenseDate}</td>
				<td>${request.status}</td>
			</tr>
		</c:forEach>
	</table>
</body>