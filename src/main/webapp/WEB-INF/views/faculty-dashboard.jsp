<%@page import="java.util.List"%>
<%@page import="com.jims.attendance.model.Subject"%>
<%@page import="com.jims.attendance.model.Faculty"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Faculty Dash-board</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<script
	src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.7.14/js/bootstrap-datetimepicker.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.7.14/css/bootstrap-datetimepicker.min.css">

</head>
<body>
	<div class="container">

		<%
		Faculty faculty = (Faculty) request.getAttribute("faculty");
		%>
		
		 <%
    		session.setAttribute("faculty", faculty);

        %>
		<div class="card-header mt-3"
			style="text-align: center; font-size: x-large;">
			Welcome
			<%=faculty.getFacultyName()%>
		</div>
		<div class="row">
			<div class="col-lg-4 mt-3">
				<div class="card">
					<ul class="list-group">

						<li class="list-group-item active"><%=faculty.getFacultyName()%></li>
						<li class="list-group-item"><%=faculty.getGender()%></li>
						<li class="list-group-item"><%=faculty.getContactNumber()%></li>
						<li class="list-group-item"><%=faculty.getFacultyEmail()%></li>
					</ul>
				</div>
			</div>


			<div class="col-lg-8 mt-3">
			<form action="">
				<div class="row mt-3">
					<div class="col-md-6">
						<label class="form-control-label" style="font-weight: 500">Select
							Day/Date</label> <input class="form-control" type="date" name="date">
					</div>


					<div class="col-md-6">
						<label class="form-control-label" style="font-weight: 500">Time
							Slot</label> <select class="form-select form-control" name="timeslot">
							<option selected>Select Time Slot</option>
							<option value="L1">08:30 am to 09:20 am</option>
							<option value="L2">09:20 am to 10:10 am</option>
							<option value="L3">10:25 am to 11:15 am</option>
							<option value="L4">11:15 am to 12:05 pm</option>
							<option value="L5">12:50 pm to 01:50 pm</option>
							<option value="L6">01:40 pm to 02:30 pm</option>
							<option value="L7">02:30 pm to 03:20 pm</option>
							<option value="L8">12:50 pm to 03:20 pm</option>
						</select>
					</div>
					
				</div>
				<div class="row mt-3">
					<%
					List<Subject> subjects = (List<Subject>) request.getAttribute("subjects");
					%>
					<div class="col-md-6">
						<label class="form-label"> Course Name</label> <select
							name="courseName" id="courseName"
							class="form-select form-control">
							<option selected>Select Course / Batch</option>
							<option value="1">MCA-1</option>
							<option value="2">MCA-2</option>
							<option value="3">MBA-1</option>
							<option value="4">MBA-2</option>
						</select>
					</div>
					<div class="col-md-6">
						<label class="form-control-label">Select Subject</label> <select
							name="subject" class="form-select form-control">
							<%
							for (Subject s : subjects) {
							%>
							<option><%=s.getSubjectCode() + "  " + s.getSubjectName()%></option>
							<%
							}
							%>
						</select>

					</div>
					
				</div>
				</form>
			</div>

			<button type="submit" class="btn btn-primary mb-3 mt-5"
				value="load" onclick="window.location='take-attendance'" style="width: 100%">Take Attendance</button>
		</div>
	</div>
</body>
</html>
