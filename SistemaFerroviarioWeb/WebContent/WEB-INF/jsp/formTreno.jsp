<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html>
<head>
<link href="<c:url value="/resources/css/tabella.css" />" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Trova Treno</title>
</head>
<body>
<div>
<%@include file="menu.jsp" %>
</div>

	<form:form modelAttribute="treno" method="GET">  
	ID treno: <form:input path="idTreno"/> <br><br>     
	<input type="submit" name="submit" formaction="getTreno" value="TROVA"> 
	</form:form>

</body>
</html>