<%@page import="java.util.ArrayList"%>
<%@page import="com.jims.attendance.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student list</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
	<div class="card-header mt-3" style="text-align: center;">
	<h3>Students List</h3>
	</div>
		<table class="table mt-3">
			<thead class="thead-dark">
				<tr>
					<th scope="col">Student Id</th>
					<th scope="col">Name</th>
					<th scope="col">Email</th>
					<th scope="col">Contact</th>
				</tr>
			</thead>
			<tbody>
				<!-- Loop over and print students-->

				<%
					ArrayList<Student> std = (ArrayList<Student>) request.getAttribute("students");
					for (Student s : std) {
					%>
				<%-- Arranging data in tabular form  --%>
				<tr>
					<th scope="row"><%=s.getStudentId()%></th>
						<td><%=s.getStudentName()%></td>
						<td><%=s.getStudentEmail()%></td>
						<td><%=s.getContactNumber()%></td>
					</tr>
				<%
					}
					%>

			</tbody>
		</table>
	</div>
</body>
</html>