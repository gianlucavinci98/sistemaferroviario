<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Gestione dei turni</title>
</head>

<!-- <style> -->
<%-- 	<%@include file="homeTurni.css" %> --%>
<!-- </style> -->

<body>

	<div>
		<%@include file="menu.jsp"%>
	</div>

	<h1 align="center">Gestione dei turni</h1>
	
	<div align="center">
	<form id="utilities">
		<input type="submit" name="submit" formaction="all" value="Visualizza tutti i turni">
		<input type="submit" name="submit" formaction="formAdd" value="Aggiungi un nuovo turno">
		<br><br>
		Cerca turno: <input id="idTurno" name="idTurno"
			type="number" /> <input type="submit" name="submit" formaction="find" value="Cerca">
		<br><br>
		Cerca i treni in cui ha lavorato il dipendente: <input id="idDipendente" name="idDipendente"
			type="number" /> <input type="submit" name="submit" formaction="findTreniByDipendente" 
			value="Cerca">
		<br><br>
		Cerca i dipendenti che hanno lavorato più di un certo numero di turni: 
		<input id="x" name="x" type="number" />
		<input type="submit" name="submit" formaction="findDipendentiByXTurni" value="Cerca">
		<br><br>
		Cerca i dipendenti che hanno lavorato su uno specifico treno: 
		<input id="idTreno" name="idTreno" type="number" />
		<input type="submit" name="submit" formaction="findDipendentiByTreno" value="Cerca">
		<br><br>
		Cerca i dipendenti che hanno lavorato in una certa data: 
		<input id="data" name="data" type="text" />
		<input type="submit" name="submit" formaction="findDipendentiByData" value="Cerca">
	</form>
	</div>

</body>
</html>