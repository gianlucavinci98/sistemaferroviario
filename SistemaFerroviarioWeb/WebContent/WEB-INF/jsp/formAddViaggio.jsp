<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inserisci Viaggio</title>
</head>
<body>

	<div>
		<%@include file="menu.jsp"%>
	</div>
	
	<form:form modelAttribute="viaggio" method="GET">     
	Partenza: <form:input path="partenza"/> <br><br>
	Arrivo: <form:input path="arrivo"/> <br><br>
	Treno: <form:input path="treno"/> <br><br>  
	<input type="submit" name="submit" formaction="addViaggio" value="AGGIUNGI"> 
	</form:form>

</body>
</html>