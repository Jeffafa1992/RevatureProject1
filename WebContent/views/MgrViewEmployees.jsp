<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employees</title>
</head>
<body>
    <a href="ManagerHomePage" >Go Back</a>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>User Name</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email Name</th>
		</tr>
		<c:forEach items="${list}" var="employee">
			<tr>
				<td>${employee.id}</td>
				<td>${employee.username}</td>
				<td>${employee.firstName}</td>
				<td>${employee.lastName}</td>
				<td>${employee.email}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>