<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ADMIN page</title>
</head>
<body>
  <h1>Name: ${name }</h1>
  <h1>Description: ${description }</h1>
  <c:if test="${pageContext.request.userPrincipal.name !=null }">
   <h2>
      Welcome : ${user} | <a
      href="<c:url value="/j_spring_security_logout" />">Logout</a>
   </h2>
   </c:if>
</body>
</html>