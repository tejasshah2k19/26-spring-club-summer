<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View User</title>

<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<style>
    body {
        background-color: #f8f9fa;
    }

    .user-card {
        max-width: 700px;
        margin: 50px auto;
        border-radius: 12px;
        box-shadow: 0 4px 12px rgba(0,0,0,0.1);
    }

    .card-header {
        font-size: 24px;
        font-weight: bold;
    }

    .label {
        font-weight: 600;
        color: #495057;
    }

    .value {
        color: #212529;
    }
</style>
</head>

<body>

<div class="container">
    <div class="card user-card">

        <div class="card-header bg-primary text-white text-center">
            User Details
        </div>

        <div class="card-body">

            <div class="row mb-3">
                <div class="col-md-4 label">First Name</div>
                <div class="col-md-8 value">${user.firstName}</div>
            </div>

            <div class="row mb-3">
                <div class="col-md-4 label">Last Name</div>
                <div class="col-md-8 value">${user.lastName}</div>
            </div>

            <div class="row mb-3">
                <div class="col-md-4 label">Email</div>
                <div class="col-md-8 value">${user.email}</div>
            </div>

            <div class="row mb-3">
                <div class="col-md-4 label">Role</div>
                <div class="col-md-8">
                    <span class="badge bg-success">${user.role}</span>
                </div>
            </div>

            <div class="row mb-3">
                <div class="col-md-4 label">Created At</div>
                <div class="col-md-8 value">${user.createdAt}</div>
            </div>

        </div>

        <div class="card-footer text-center">
            <a href="/admin/users" class="btn btn-secondary">
                Back
            </a>
        </div>

    </div>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>