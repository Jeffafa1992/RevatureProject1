<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employees</title>
<link rel="stylesheet" type="text/css" href="myStyle.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
    <div class="container">
	<table class="table table-hover">
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
	<a href="ManagerHomePage" >Go Back</a>
	</div>
</body>
</html>