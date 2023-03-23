<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>register-student</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>

	<div class="container card mt-5">

		<!-- Register Student header text -->
		<div>
			<h2 style="text-align: center; margin: 10px">Register Student</h2>
		</div>


		<div>
			<form  method="post" action="save-student">

				<!-- One row and Two Columns # Row-1-->
				<div class="row">
					<!-- Column-1 -->
					<div class="col-md-6">
						<label class="col-sm-3 col-form-label"> Full Name <span
							style="color: red">*</span>
						</label> <input type="text" name="studentName" class="form-control"
							placeholder="Student Name" required>
					</div>
					<!-- Column-2 -->
					<div class="col-md-6">
						<label class="col-sm-3 col-form-label">Email <span
							style="color: red">*</span></label> <input type="email" name="studentEmail"
							class="form-control" placeholder="Student E-mail Id" required>
					</div>
				</div>

				<!-- Row-2 -->
				<div class="row">
					<!-- Column-1 -->
					<div class="col-md-6">
						<label class="col-sm-3 col-form-label"> Contact <span
							style="color: red">*</span>
						</label> <input type="text" name="contactNumber" class="form-control"
							placeholder="Student Contact" required>
					</div>

					<!-- Column-2 -->
					<div class="col-md-6">
						<label class="col-sm-3 col-form-label"> Course <span
							style="color: red">*</span></label> <select
							name="courseId" id="courseId"
							class="form-select form-control">
							<option selected>Select Course / Batch</option>
							<option value="1">MCA-1</option>
							<option value="2">MCA-2</option>
							<option value="3">MBA-1</option>
							<option value="4">MBA-2</option>
						</select>
					</div>
				</div>

				<div class="row">
					<div class="col-md-6 mt-3 ">
						<label class="col-sm-3 col-form-label">Gender : <span
							style="color: red">*</span></label>
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

				<button type="submit" value="process" class="btn btn-primary mb-3 mt-3"
					style="width: 100%">Register</button>
			</form>
		</div>
	</div>
</body>
</html>