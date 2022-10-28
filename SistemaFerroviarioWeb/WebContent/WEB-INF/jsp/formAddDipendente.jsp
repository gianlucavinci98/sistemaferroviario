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

	<h1 align="center">Aggiungi dipendente</h1>

	<div align="center">
	<form id=addDipendente>
		    ID Dipendente: <input id="idDipendente" name="idDipendente" type="number" /> <br> <br> 
			Nome: <input id="nome" name="nome" type="text" /> <br> <br>
			Cognome: <input id="cognome" name="cognome" type="text" /> <br> <br> 
			Ruolo: <input id="ruolo" name="ruolo" type="text" /> <br> <br>
		    <input type="submit" name="submit" formaction="addDipendente" value="Aggiungi">
	</form>
	</div>
	
	<br><br> 
	
	<div align="center">${message}</div>

</body>
</html>