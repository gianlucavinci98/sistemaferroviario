<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Aggiungi turno</title>
</head>
<body>

	<div>
		<%@include file="menu.jsp"%>
	</div>

	<h1>Aggiungi turno</h1>

	<form id=addTurno>
		ID Dipendente: <input id="idDipendente" name="idDipendente"
			type="number" /> <br> <br> ID Treno: <input id="idTreno"
			name="idTreno" type="number" /> <br> <br> Data
		(YYYY-MM-DD): <input id="data" name="data" type="text" /> <br> <br>
		<input type="submit" name="submit" formaction="add" value="Aggiungi">
	</form>

	<br>
	<br> ${message}

</body>
</html>