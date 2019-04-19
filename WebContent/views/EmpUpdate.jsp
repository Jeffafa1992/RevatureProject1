<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Information</title>
<link rel="stylesheet" type="text/css" href="myStyle.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
<a href="EmployeeHomePage" >Go Back</a>
<p>Enter the information you would like to change</p>
<form action="EmpPerformUpdate" method="POST"> 
	<label>First Name: <input type="text" value="${emp.firstName}" name="fname"></label><br>
	<label>Last Name: <input type="text" value="${emp.lastName}" name="lname"></label><br>
	<label>Email: <input type="text" value="${emp.email}" name="email"></label><br>
	<input type="submit" value="Update">
</form>

</body>
</html>