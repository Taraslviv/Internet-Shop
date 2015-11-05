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
	<div id="login">
	<sec:authorize access="isAnonymous()">
		<a href="login"><button>Login</button></a>
	</sec:authorize>
	</div>
	<div id="backet">
		<sec:authorize access="isAuthenticated()">
			<a href="basket"><button>Basket</button></a>
		</sec:authorize>
	</div>
	<div id="logout">
		<sec:authorize access="isAuthenticated()">
		<a href="<c:url value="/j_spring_security_logout"/>"><button>Log Out</button></a>
		</sec:authorize>
	</div>
</div>

