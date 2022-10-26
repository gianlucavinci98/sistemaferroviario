<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LoginPage</title>
</head>
<style>
	<%@include file="LoginPage.css" %>
</style>
<body>


<form:form modelAttribute="user" method="get">

 <label for="username">Username</label>
        <form:input type="text" placeholder="Username" path="username"/>

        <label for="password">Password</label>
        <form:input type="password" placeholder="Password" path="psw"/>

<input class="btn from-center" type="submit" name="submit" formaction="login" value ="login">
<input class="btn from-center" type="submit" name="submit" formaction="register" value="Register"/>


</form:form>
  
  


</body>
</html>