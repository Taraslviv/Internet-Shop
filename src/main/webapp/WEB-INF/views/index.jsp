<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<%@ page session="false"%>
<html>
<body>
<sec:authorize access="isAuthenticated()">
<div class="hello">Hello ${customer_name }!</div>
</sec:authorize>

<h2>Stuff</h3>
<table>
	<tr>
		<th>Id</th>
		<th>Title</th>
		<th>Description</th>
		<th>Price</th>
	</tr>
	<c:forEach items="${all_stuff}" var="stuff">
		<tr>
			<td>${stuff.id}</td>
			<td>${stuff.name}</td>
			<td>${stuff.description}</td>
			<td>${stuff.price}</td>
		</tr>
	</c:forEach>
</table>

<sec:authorize access="hasAnyRole('ROLE_ADMIN','CUSTOMER_USER')">

</sec:authorize>

<%-- 	<sec:authorize access="isAuthenticated()">
		<a href="<c:url value="/j_spring_security_logout"/>">Log Out</a>
	</sec:authorize> --%>
</body>
</html>
