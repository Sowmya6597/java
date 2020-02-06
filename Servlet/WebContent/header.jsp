<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>

<body>
<a href="ImplicitObjects.jsp">impObj</a>
<a href="second.jsp">impObj</a>
<a href="login.jsp">Login</a>
<a href="Register.jsp">Register</a>
<a href="actions.jsp">Actions</a>
<a href="Index.html">Login Page</a>
<a href="expressions.jsp">expressions</a>
<a href="jstlcore.jsp">JSTL Core</a>
<a href="session.jsp">Session</a>
welcome : <% session.getAttribute("loggedInUser") %>


</body>
</html>