<%@ include file="header.jsp" %>
<body>
<c:out value="Helloworld" />
<br/>
<c:set var="name" value="sowmya" />
Name: <c:out value="${name}" />
<%-- Loop: <br />
<c:forEach var="i" begin="1" end="10" step="1">
<h2>${i}</h2>
</c:forEach>
 --%>
 <%-- Loop with Array:<br />
 <c:forEach var="i" items="1,2,4,6,687,454">
 <h2>${i}</h2>
 </c:forEach>
 <br/> --%>
 <c:set var="income" scope="session" value="${4000*4}"/>  
<c:if test="${income > 17000}">  
   <p>My income is: <c:out value="${income}"/><p>  
</c:if>
</body>
</html>