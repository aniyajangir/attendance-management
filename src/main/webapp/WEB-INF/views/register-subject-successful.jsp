<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Successful</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
<div class="card container" style="width: 50%; margin-top: 50px">
	<div>
		<h1 style="text-align: center; margin-top: 20px; color: green" %>Registration Successful</h1>
	</div>
	<div class="row" style="align-self: center;">
		<input type="button" class="btn btn-primary" style="margin: 25px" value="Home" onclick="window.location='/'">
		<input type="button" class="btn btn-primary" style="margin: 25px" value="Add More" onclick="window.location='register-subject'">
	</div>
</div>
</body>
</html>