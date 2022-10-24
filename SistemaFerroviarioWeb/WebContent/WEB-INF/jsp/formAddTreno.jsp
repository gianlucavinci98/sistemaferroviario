<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Trova Treno</title>
</head>
<body>

	<form:form modelAttribute="treno" method="GET">  
	ID treno: <form:input path="idTreno"/> <br><br>   
	Tipo: <form:input path="tipo"/> <br><br>
	Velocità: <form:input path="velocita"/> <br><br>
	Numero Posti: <form:input path="numPosti"/> <br><br>  
	<input type="submit" name="submit" formaction="addTreno" value="AGGIUNGI"> 
	</form:form>
	
	<br><br>
	${messaggio}

</body>
</html>