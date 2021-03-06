<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resolved Requests</title>
<link rel="stylesheet" type="text/css" href="myStyle.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
	<a href="ManagerHomePage" >Go Back</a>
	<table class="table table-hover">
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
	
	</div>
</body>
</html>