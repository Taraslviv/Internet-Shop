<%@ page language="java" contentType="text/html; charset=UTF8"
	pageEncoding="UTF8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<div class="header">
	<div class="title">
		<h3>Internet-Shop</h3>
	</div>
	<div>
	<sec:authorize access="isAnonymous()">
		<a href="login">Login</a>
	</sec:authorize>
	</div>
	<div>
		<sec:authorize access="isAuthenticated()">
			<a href="basket">Basket</a>
		</sec:authorize>
	</div>
	<div>
		<sec:authorize access="isAuthenticated()">
		<a href="<c:url value="/j_spring_security_logout"/>">Log Out</a>
		</sec:authorize>
	</div>
</div>

