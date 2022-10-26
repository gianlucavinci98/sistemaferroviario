<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<div>
	<%@include file="menu.jsp"%>
</div>

<h1>Lista dei turni</h1>
<table border="2" width="70%" cellpadding="2" align="center">
	<tr>
		<th>idTurno</th>
		<th>idDipendente</th>
		<th>idTreno</th>
		<th>Data</th>
		<th>Modifica</th>
		<th>Elimina</th>
	</tr>
	<c:forEach var="turno" items="${list}">
		<tr align=center>
			<td>${turno.idTurno}</td>
			<td>${turno.dipendente.idDipendente}</td>
			<td>${turno.treno.idTreno}</td>
			<td>${turno.dataTurno}</td>
			<td><a href="editTurno/${turno.idTurno}">Modifica</a></td>
			<td><a href="deleteTurno/${turno.idTurno}">Elimina</a></td>
		</tr>
	</c:forEach>
</table>
<br />
<a href="formAdd">Aggiungi un nuovo turno</a>
