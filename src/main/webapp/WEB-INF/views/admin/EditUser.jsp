<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Edit User</h2>
	
	<form action="/admin/updateUser" method="post">
	
		FirstName : <input type="text" name="firstName" value="${user.firstName}"/><br><Br> 
		LastName  : <input type="text" name="lastName" value="${user.lastName}"/><br><br> 
		
		<input type="hidden" name="userId" value="${user.userId}"/>
		<input type="submit" value="Update"/>
		
	
	</form>
	
</body>
</html>