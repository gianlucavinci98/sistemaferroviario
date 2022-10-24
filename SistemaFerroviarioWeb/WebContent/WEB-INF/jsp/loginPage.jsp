<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LoginPage</title>
</head>
<body>


<form:form modelAttribute="user" method="get">

Username <form:input path="username"/><br><br>
Password <form:input path="psw" type="password"/><br><br>

<input type="submit" name="submit" formaction="login" value ="login">

</form:form>



</body>
</html>