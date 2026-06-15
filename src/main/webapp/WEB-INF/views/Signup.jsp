<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.error{
		color:red;
	}
	
</style>
</head>

<body>
<h2>Signup</h2>


<form action="saveUser" method="post">
	FirstName : <input type="text" name="firstName"> <span class="error">  ${firstNameError} </span><br>
	LastName: <input type="text" name="lastName"><span class="error"> ${lastNameError }</span> <br>
	Email: <input type="text" name="email"> <span class="error">${emailError} </span><br>
	Password:  <input type="text" name="password"> <span class="error">${passwordError}</span><br>

<input type="submit" value="Signup">

</form>
<br><Br> 
<a href="login">Login</a>

</body>
</html>