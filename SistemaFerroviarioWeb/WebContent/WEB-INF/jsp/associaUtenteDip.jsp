<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
		<%@include file="menu.jsp"%>
	</div>


	<div align="center">
	<form id="associaDipendente" >
	       Username Utente: <input type="text" name="user" >
		   ID Dipendente: <input type="text" name="id" >
    <input type="submit" name="submit" formaction="associaDipendente" value="Associa">
	</form>
	</div>
	
	<br><br> 
	
	<div align="center">${message}</div>
	
	<form >
<input type="submit" name="submit" formaction="allDipendentiAdmin" value="indietro">
</form>

</body>
</html>