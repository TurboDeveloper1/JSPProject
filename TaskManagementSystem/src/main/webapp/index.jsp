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
		<nav>
			<ul>
				<li><a href="#">Home</a></li>
				<li><a href="#">Bikes</a></li>
				<li><a href="#">Rentals</a></li>
				<li><a href="#">About</a></li>
				Username: <input type="text" name="user">
				Password: <input type="password" name="pass">
				<% int i=10; if(i<1) {%>
				<li><a href="/TaskManagementApplication/dashboard.jsp">Contact</a></li>
				<%} else { %>
				<li><a href="/TaskManagementApplication/dashboard.jsp">Information</a></li>
				<% } %>

				<% LoginController.createTable(); %>
				
				
				
			</ul>
		</nav>
	
</body>
</html>