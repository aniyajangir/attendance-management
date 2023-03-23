<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<body>
<div class="modal-body row">
<div class="col-md-6">
	<div>
		<img alt="jims logo" src="https://img.collegedekhocdn.com/media/img/institute/logo/1440861766.jpg" style="display:block; height: 150px; width:320px; margin-left: auto; margin-right: auto">
	</div>
	<div class="card mb-3" style="text-align: center; background-color: #ECEBF6; width: 65%; float: left; margin-left: 140px; margin-top: 30px; padding: 10px">
	 
            	<h1>Login </h1>
                 <form action="login" method="post">
				<div class="form-group row">
                <label class="col-sm-3 col-form-label"> Username </label>
                <input type ="text" name="userEmail" class="form-control" style="margin-left : 20px; margin-right : 20px" placeholder="User Email">
				</div>
                <div class="form-group row">
                <label class="col-sm-3 col-form-label">Password</label>
                <input type ="password" name="password" class="form-control" style="margin-left : 20px; margin-right : 20px" placeholder="Password">
				</div>
                <button type = "submit" class="btn btn-primary mb-3 mt-3" style="width: 100%">Login</button>
            </form>
	</div>
</div>


		
	<div  class="col-md-6" style="background-color:#D8EFFE">
		<img alt="image" style="height: 100%; width: 100%; object-fit: contain" src="https://img.freepik.com/free-vector/appointment-booking-with-smartphone_52683-39659.jpg?w=740&t=st=1676577086~exp=1676577686~hmac=67d106d18c1a5d0ab7d40a29a63209798224c8afa2735fe706ab03208eb29985">
	</div>
</div>

</body>
</html>
<!-- h1{
font-size:60px;
}
body{
font-family:monospace;
font-size:15px;
background-color:powderblue;
border: 2px black;
text-align:center;
} -->