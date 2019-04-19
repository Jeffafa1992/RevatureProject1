<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SubmitRequest</title>
<link rel="stylesheet" type="text/css" href="myStyle.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
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