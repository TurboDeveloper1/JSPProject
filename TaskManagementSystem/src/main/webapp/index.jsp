<%@page import="org.apache.jasper.tagplugins.jstl.core.Import"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Task Management System</title>
</head>
<body>
	<h1>Welcome to the Task Management System</h1>
	<h2>Login Form</h2>
		<form action="login" method="post">
			<input type="text" id="cusid">
			<input type="password" id="password">
			<input type="submit" value="Login">
		</form>
	
</body>
</html>