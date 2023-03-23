<%@page import="com.jims.attendance.model.Course"%>
<%@page import="com.jims.attendance.model.Subject"%>
<%@page import="com.jims.attendance.model.Student"%>
<%@page import="java.util.List"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>register-faculty</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	<div class="container card mt-5">
		<div>
			<h2 style="text-align: center; margin: 10px">Register Faculty</h2>
		</div>
		<div>
			<h5 style="text-align: left; margin: 10px">
				Personal Details
				</h2>
		</div>


		<div>
			<form method="post" action="save-faculty">
				<div class="row">
					<div class="col-md-6">
						<label class="col-sm-3 col-form-label"> Full Name <span
							style="color: red">*</span>
						</label> <input type="text" name="facultyName" class="form-control"
							placeholder="Faculty Name" required>
					</div>
					<div class="col-md-6">
						<label class="col-sm-3 col-form-label">Contact<span
							style="color: red">*</span>
						</label> <input type="text" name="contactNumber" class="form-control"
							placeholder="Faculty Contact Number" required>
					</div>
				</div>
				<div class="row">
					<div class="col-md-6">
						<label class=" col-sm-3 col-form-label"> Email<span
							style="color: red">*</span>
						</label> <input type="email" name="facultyEmail" class="form-control"
							placeholder="Faculty E-mail Id" required>
					</div>

					<div class="col-md-6">
						<label class="col-sm-3 col-form-label">Gender : <span
							style="color: red">*</span></label><br>
						<div class="form-check form-check-inline col-md-2">
							<input class="form-check-input" type="radio" name="gender"
								id="MALE" value="MALE" required="required""> <label
								class="form-check-label" for="MALE">Male</label>
						</div>
						<div class="form-check form-check-inline col-md-2">
							<input class="form-check-input" type="radio" name="gender"
								id="FEMALE" value="FEMALE"> <label
								class="form-check-label" for="FEMALE">Female</label>
						</div>
						<div class="form-check form-check-inline">
							<input class="form-check-input" type="radio" name="gender"
								id="OTHER" value="OTHER"> <label
								class="form-check-label" for="OTHER">Other</label>
						</div>
					</div>
				</div>
				<br>
				<div>
					<h5 style="text-align: left; margin: 10px">
						Academic Details
						</h2>
				</div>
				
				<div class="row">
					<%List<Course> courses = (List<Course>) request.getAttribute("courses"); %>
					<div class="col-md-6">
						<label class="col-sm-3 col-form-label">Course<span
							style="color: red">*</span></label><br> <select
							class="form-select form-control" name="course">
							<%for(Course c: courses){ %>
							<option><%=c.getCourseCode()+"  "+ c.getCourseName()%></option>
							<%} %>
						</select>
					</div>
					
					</div>
				<button type="submit" class="btn btn-primary mb-3 mt-3"
					value="save-faculty" style="width: 100%">Register</button>
			</form>
		</div>
</body>
</html>