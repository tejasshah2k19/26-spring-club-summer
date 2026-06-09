<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Signup</h2>


<form action="saveUser" method="post">
	FirstName : <input type="text" name="firstName"><br>
	LastName: <input type="text" name="lastName"><br>
	Email: <input type="text" name="email"><br>
	Password:  <input type="text" name="password"><br>

<input type="submit" value="Signup">

</form>
<br><Br> 
<a href="login">Login</a>

</body>
</html>