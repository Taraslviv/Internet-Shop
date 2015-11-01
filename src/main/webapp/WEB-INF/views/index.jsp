<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<%@ page session="false"%>
<html>
<body>
<h2>Hello World!</h2>
	<sec:authorize access="isAnonymous()">
		<form action="login_user" method="post">
			<div>
				<input type="email" class="form-control" name="email"
					placeholder="email" required> <input type="password"
					class="form-control" name="password" placeholder="password"
					required>
			</div>
			<div>
				<button class="btn btn-sample" type="submit">Enter</button>
			</div>
		</form>
	</sec:authorize>

<sec:authorize access="hasAnyRole('ROLE_ADMIN','CUSTOMER_USER')">
<h3>${messageOk}<h3>
</sec:authorize>

	<sec:authorize access="isAuthenticated()">
		<a href="<c:url value="/j_spring_security_logout"/>">Log Out</a> <%--c:url --%>
	</sec:authorize>
</body>
</html>
