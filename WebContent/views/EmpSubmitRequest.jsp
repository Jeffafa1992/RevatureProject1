<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SubmitRequest</title>
</head>
<body>
	<a href="EmployeeHomePage" >Go Back</a>
	<p>Enter request details:</p>
	<form action="EmpPerformSubmit" method="POST"> 
	    <label>Enter Manager Id: <input type="text" value="" name="manID"></label>
		<label>Enter Request Amount: <input type="text" value="" name="amount"></label>
		<input type="submit" value="Submit">
	</form>

</body>
</html>