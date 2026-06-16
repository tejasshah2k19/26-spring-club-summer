<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration</title>

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">

</head>
<body>

	<div class="container mt-5">
		<div class="row justify-content-center">
			<div class="col-md-6">

				<div class="card shadow">
					<div class="card-header bg-primary text-white text-center">
						<h3>Student Registration Form</h3>
					</div>

					<div class="card-body">
						<form action="registerStudent" method="post">

							<!-- First Name -->
							<div class="mb-3">
								<label class="form-label">First Name</label> <input type="text"
									name="firstName" class="form-control"> <span
									class="text-danger">
									${result.getFieldError("firstName").defaultMessage} </span>
							</div>

							<!-- Roll Number -->
							<div class="mb-3">
								<label class="form-label">Roll Number</label> <input type="text"
									name="rollNum" class="form-control"> <span
									class="text-danger">
									${result.getFieldError("rollNum").defaultMessage} </span>
							</div>

							<!-- Email -->
							<div class="mb-3">
								<label class="form-label">Email</label> <input type="text"
									name="email" class="form-control"> <span
									class="text-danger">
									${result.getFieldError("email").defaultMessage} </span>
							</div>

							<!-- Password -->
							<div class="mb-3">
								<label class="form-label">Password</label> <input
									type="password" name="password" class="form-control"> <span
									class="text-danger">
									${result.getFieldError("password").defaultMessage} </span>
							</div>

							<!-- Submit Button -->
							<div class="d-grid">
								<button type="submit" class="btn btn-success">Register
								</button>
							</div>

						</form>
					</div>

				</div>

			</div>
		</div>
	</div>

	<!-- Bootstrap JS -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>