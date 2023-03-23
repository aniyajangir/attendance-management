<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>register-subject</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>

	<div class="container card mt-5">

		<!-- Register subject header text -->
		<div>
			<h2 style="text-align: center; margin: 10px">Register Subject</h2>
		</div>


		<div>
			<form method="post" action="save-subject">

				<div class="row">
					<div class="col-md-6">
						<label class="col-sm-3 col-form-label">Subject Code <span
							style="color: red">*</span></label> <input type="text" name="subjectCode"
							class="form-control" placeholder="Subject Code" required>
					</div>
					<div class="col-md-6">
						<label class="col-sm-3 col-form-label">Subject Name</label> <input
							type="text" name="subjectName" class="form-control"
							placeholder="Subject Name " required>
					</div>
				</div>
				<div class="row">
					<!-- Column-2 -->
					<div class="col-md-6">
						<label class="col-sm-3 col-form-label"> Course Name</label> <select
							name="courseId" id="courseId" class="form-select form-control">
							<option selected>Select Course / Batch</option>
							<option value="1">MCA-1</option>
							<option value="2">MCA-2</option>
							<option value="3">MBA-1</option>
							<option value="4">MBA-2</option>
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