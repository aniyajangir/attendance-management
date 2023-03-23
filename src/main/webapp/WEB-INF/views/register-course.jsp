<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>register-course</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>

	<div class="container card mt-5">

		<!-- Register course header text -->
		<div>
			<h2 style="text-align: center; margin: 10px">Register Course</h2>
		</div>


		<div>
			<form method="post" action="save-course">

				<!-- One row and Two Columns # Row-1-->
				<div class="row">
					<!-- Column-1 -->
					<div class="col-md-6">
						<label class="col-sm-3 col-form-label">Course Code <span
							style="color: red">*</span></label> <input type="text" name="courseCode"
							class="form-control" placeholder="Course Code" required>
					</div>
					<!-- Column-2 -->
					<div class="col-md-6">
						<label class="col-sm-3 col-form-label"> Year <span
							style="color: red">*</span>
						</label> <input type="year" name="year" class="form-control"
							placeholder="Course Year " required>
					</div>
				</div>

				<!-- Row-2 -->
				<div class="row">
					<!-- Column-1 -->
					<div class="col-md-6">
						<label class="col-sm-3 col-form-label"> Course Name</label> <select
							name="courseName" id="courseName"
							class="form-select form-control">
							<!-- <option selected>Select Course / Batch</option> -->
							<option value="MCA-1">MCA-1</option>
							<option value="MCA-2">MCA-2</option>
							<option value="MBA-1">MBA-1</option>
							<option value="MBA-2">MBA-2</option>
						</select>
					</div>
				</div>

				<button type="submit" value="process"
					class="btn btn-primary mb-3 mt-3" style="width: 100%">Register</button>
			</form>
		</div>
	</div>
</body>
</html>