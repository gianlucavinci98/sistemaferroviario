<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html>
<head>

<link  rel="stylesheet" type="text/css" href="../../resources/css/tabella.css"/>

<meta charset="ISO-8859-1">
<title>Lista dei dipendenti</title>
</head>

<body>
	<div>
		<%@include file="menu.jsp"%>
	</div>

	<h1 align="center">Lista dei dipendenti</h1>

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
		Cerca i dipendenti che hanno lavorato sul treno: 
		<input id="idTreno" name="idTreno" type="number" />
		<input type="submit" name="submit" formaction="findDipendentiByTreno" value="Cerca">
		<br><br>
		Cerca i dipendenti che hanno lavorato in data: 
		<input id="data" name="data" type="text" />
		<input type="submit" name="submit" formaction="findDipendentiByData" value="Cerca">
	</form>

	<br><br>

	<c:if test="${list.size() > 0}">
	<table style="width:100%">
		<tr>
			<th>idDipendente</th>
			<th>Nome</th>
			<th>Cognome</th>
			<th>Ruolo</th>
		</tr>
		<c:forEach var="dipendente" items="${list}">
			<tr align="center">
				<td>${dipendente.idDipendente}</td>
				<td>${dipendente.nome}</td>
				<td>${dipendente.cognome}</td>
				<td>${dipendente.ruolo}</td>
			</tr>
		</c:forEach>
	</table>
	</c:if>
</body>
</html>