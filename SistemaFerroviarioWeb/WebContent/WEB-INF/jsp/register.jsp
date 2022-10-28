	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>

<html>
<head>
	<link rel="stylesheet" type="text/css" href="resources/css/LoginPage.css"/>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<div class="background">
        <div class="shape"></div>
        <div class="shape"></div>
    </div>
    <form:form modelAttribute="emp" method="GET" class="animated vanishIn">
        <h3>Register Here</h3>
        
        <h1>${message}</h1>
        

        <label for="username">Username</label>
        <form:input type="text" placeholder="Username" path="username"/>
       
        <label for="password">Password</label>
        <form:input type="password" placeholder="Password" path="psw"/>

  
        <input class="btn from-center" type="submit" name="submit" formaction="register" value="Register"/>
        <input class="btn from-center" type="submit" name="submit" formaction="home" value="Back"/>
        
    </form:form>


</body>
</html>