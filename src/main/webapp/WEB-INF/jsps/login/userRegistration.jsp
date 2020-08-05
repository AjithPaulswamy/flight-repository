<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration</title>
</head>
<body>
<form action="createUser" method="post">
<pre>
First Name :<input type="text" name="firstName">
Last Name :<input type="text" name="lastName">
Email :<input type="text" name="email">
Password :<input type="password" name="password">
Confirm Password :<input id="confirmPassword" type="password">
<input type="submit" value="Create">
</pre>
</form>
</body>
</html>