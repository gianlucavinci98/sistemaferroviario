<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link href="<c:url value="/resources/css/tabella.css" />" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div>
	
	
	<%@include file="viaggio.jsp"%>
	
	
	</div>
	<br><br> 
	<div align="center">
	<form id="addPrenotazione" >
	       ID Viaggio: <input type="text" name="idViaggio" >
    <input type="submit" name="submit" formaction="addPrenotazione" value="Prenota">
	</form>
	</div>
	
	<br><br> 
	
	<div align="center">${message}</div>
	
	<form >
<input type="submit" name="submit" formaction="pagePrenotazione" value="indietro">
</form>
	

</body>
</html>