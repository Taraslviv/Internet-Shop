<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<%@ page session="false"%>
<html>
<body>
<h2>Hello Internet shop!</h2>

<sec:authorize access="hasAnyRole('ROLE_ADMIN','CUSTOMER_USER')">

</sec:authorize>

<%-- 	<sec:authorize access="isAuthenticated()">
		<a href="<c:url value="/j_spring_security_logout"/>">Log Out</a>
	</sec:authorize> --%>
</body>
</html>
