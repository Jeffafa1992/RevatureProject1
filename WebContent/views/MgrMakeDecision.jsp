<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Approve/Deny</title>
</head>
<body>
	<a href="ManagerHomePage" >Go Back</a>
	<p>Approve/Deny Reimbursements</p>
	<table border="1">
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
	<form action="MgrFinalDecision" method="POST">
	    <p>Enter Request ID</p>
	    <input type="text" name="requestId">
	    <p>Enter 'approved' or 'denied'</p>
	    <input type="text" name="mydecision">
	    <input type="submit" value="Submit">
	</form>
</body>
</html>