<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resolved Requests</title>
</head>
<body>
<a href="ManagerHomePage" >Go Back</a>
<p>View resolved request and see which manager resolved it</p>
	<table border="1">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Request Id</th>
			<th>Status</th>
			<th>Decision</th>
		</tr>
		<c:forEach items="${list}" var="request">
			<tr>
				<td>${request.firstName}</td>
				<td>${request.lastName}</td>
				<td>${request.requestId}</td>
				<td>${request.status}</td>
				<td>${request.decision}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>