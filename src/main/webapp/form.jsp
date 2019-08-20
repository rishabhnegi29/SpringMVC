<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Form Data</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		<form:input path="firstName" />
		<form:errors path="firstName"/>
		<form:input path="lastName" />
		<form:errors path="lastName"/>
		<input type="submit" value="Submit"/>
		
	</form:form>
</body>
</html>