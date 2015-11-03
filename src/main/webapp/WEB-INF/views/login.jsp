<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
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
</body>
</html>