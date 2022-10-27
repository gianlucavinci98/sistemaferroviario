<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista dei turni</title>
</head>

<style>
	<%@include file="allTurni.css" %>
</style>

<body>
	<div>
		<%@include file="menu.jsp"%>
	</div>

	<h1 align="center">Lista dei turni</h1>

	<form id="utilities">
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

	<br><br>

	<c:if test="${list.size() > 0}">
	<table style="width:100%">
		<tr>
			<th>idTurno</th>
			<th>idDipendente</th>
			<th>idTreno</th>
			<th>Data</th>
			<!-- <th>Modifica</th> -->
			<th>Elimina</th>
		</tr>
		<c:forEach var="turno" items="${list}">
			<tr align="center">
				<td>${turno.idTurno}</td>
				<td>${turno.dipendente.idDipendente}</td>
				<td>${turno.treno.idTreno}</td>
				<td>${turno.dataTurno}</td>
				<%-- <td><a href="edit/${turno.idTurno}">Modifica</a></td> --%>
				<td><a href="delete/${turno.idTurno}">Elimina</a></td>
			</tr>
		</c:forEach>
	</table>
	</c:if>
	<br />
</body>
</html>