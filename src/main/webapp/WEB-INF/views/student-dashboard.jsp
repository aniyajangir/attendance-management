<%@page import="com.jims.attendance.model.Attendance"%>
<%@page import="com.jims.attendance.service.StudentService"%>
<%@page import="org.springframework.beans.factory.annotation.Autowired"%>
<%@page import="com.jims.attendance.dao.StudentDao"%>
<%@page import="com.jims.attendance.model.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Dash-board</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">

		<%
		Student student = (Student) request.getAttribute("student");
		%>
		<div class="card-header mt-3" style="text-align: center; font-size: x-large;">
			Welcome <%=student.getStudentName()%>
		</div>
		<div class="row mt-3">
			<div class="col-xxl-4 col-md-4">
				<div class="card">
					<ul class="list-group">

						<li class="list-group-item active"><%=student.getStudentName()%></li>
						<li class="list-group-item"><%=student.getGender()%></li>
						<li class="list-group-item"><%=student.getContactNumber()%></li>
						<li class="list-group-item"><%=student.getCourse()%></li>
					</ul>
				</div>
			</div>

			<div class="col-md-8">
				<table class="table">
					<thead class="thead-dark">
						<tr>
							<th scope="col">Sr.No</th>
							<th scope="col">Subject Name</th>
							<th scope="col">Subject Code</th>
							<th scope="col">Attended</th>
							<th scope="col">Delivered</th>
							<th scope="row">Attendance Percentage</th>
						</tr>
					</thead>
					<tbody>

						<tr>

							<th scope="row">1</th>
							<td>JAVA</td>
							<td>IT-121</td>
							<td>5</td>
							<td>6</td>
						</tr>
						<tr>
							<th scope="row">2</th>
							<td>Jacob</td>
							<td>Thornton</td>
							<td>@fat</td>
						</tr>
						<tr>
							<th scope="row">3</th>
							<td>Larry</td>
							<td>the Bird</td>
							<td>@twitter</td>
						</tr>
					</tbody>
				</table>
			</div>
			
			<%
		Attendance attendance = (Attendance) request.getAttribute("attendance");
		%>
		<div class="card-header mt-3" style="text-align: center; font-size: x-large;">
			Total Attendance
		</div>
			<div class="row mt-3">
			<div class="col-xxl-4 col-md-4">
				<div class="card">
				<h4>Total Attendace Percentage</h4>
				</div>
			</div>
			
			
		</div>

	</div>

</body>
</html>
