<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Approve/Deny</title>
<link rel="stylesheet" type="text/css" href="myStyle.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
	<a href="ManagerHomePage" >Go Back</a>
	<p>Approve/Deny Reimbursements</p>
	<div class="container">
	<table class="table table-hover">
		<tr>
			<th>Request Id</th>
			<th>Employee Id</th>
			<th>RequestAmount</th>
			<th>Expense Date</th>
			<th>Status</th>
		</tr>
		<c:forEach items="${list}" var="request">
			<tr>
				<td>${request.id}</td>
				<td>${request.empId}</td>
				<td>${request.requestAmount}</td>
				<td>${request.expenseDate}</td>
				<td>${request.status}</td>
			</tr>
		</c:forEach>
	</table>
	</div>
	<form action="MgrFinalDecision" method="POST">
	    <p>Enter Request ID</p>
	    <input type="text" name="requestId">
	    <p>Enter 'approved' or 'denied'</p>
	    <input type="text" name="mydecision">
	    <input type="submit" value="Submit">
	</form>
</body>
</html>