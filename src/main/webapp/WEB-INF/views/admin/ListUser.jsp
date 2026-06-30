<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<h2>List Users</h2>
	
	<table border="1" class="table table-bordered">
		<tr class="table-dark">
			<th>FirstName</th>
			<th>LastName</th>
			<th>Email</th>
			<th>Action</th>
		</tr>
	<c:forEach  items="${users}" var="user"> 
		
		<tr>
			<td>${user.firstName}</td>
			<td>${user.lastName}</td>
			<td>${user.email }</td>
			<td> <a href="/admin/deleteUser/${user.userId}">Delete</a> |
			 <a href="/admin/viewUser/${user.userId}">View</a> | Edit </td>
		</tr>
	</c:forEach>
		
		
	</table>
	
		 	
</body>
</html>