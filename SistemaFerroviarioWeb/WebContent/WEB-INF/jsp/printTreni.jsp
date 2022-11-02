<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html>
<head>

<link href="<c:url value="/resources/css/tabella.css" />" rel="stylesheet">

<meta charset="ISO-8859-1">
<title>Lista dei treni</title>
</head>

<body>
	<div>
		<%@include file="menu.jsp"%>
	</div>

	<h1 align="center">Lista dei treni</h1>

	<form id="utilities">
		<input type="submit" name="submit" formaction="all" value="Visualizza tutti i turni">
		<input type="submit" name="submit" formaction="formAdd" value="Aggiungi un nuovo turno">
		<br><br>
		Cerca turno: <input id="idTurno" name="idTurno" type="number" /> 
		<input disabled id="1" type="submit" name="submit" formaction="find" value="Cerca">
		<br><br>
		Cerca i treni in cui ha lavorato il dipendente: <input id="idDipendente" name="idDipendente"
			type="number" /> 
		<input disabled id="2" type="submit" name="submit" formaction="findTreniByDipendente" 
			value="Cerca">
		<br><br>
		Cerca i dipendenti che hanno lavorato sul treno: 
		<input id="idTreno" name="idTreno" type="number" />
		<input disabled id="3" type="submit" name="submit" formaction="findDipendentiByTreno" value="Cerca">
		<br><br>
		Cerca i dipendenti che hanno lavorato in data: 
		<input id="data" name="data" type="text" />
		<input disabled id="4" type="submit" name="submit" formaction="findDipendentiByData" value="Cerca">
	</form>
	
	<script type="text/javascript">
	const btn1 = document.getElementById("1");
	const btn2 = document.getElementById("2");
	const btn3 = document.getElementById("3");
	const btn4 = document.getElementById("4");
	const turno = document.getElementById("idTurno");
	const dipendente = document.getElementById("idDipendente");
	const treno = document.getElementById("idTreno");
	const data = document.getElementById("data");

	function check(e, btn) {
		const id = e.currentTarget.value;
		
		if(id != ""){
			btn.disabled = false;
		} else {
			btn.disabled = true;
		}
	}

	turno.addEventListener("input", (e) => check(e, btn1));
	dipendente.addEventListener("input", (e) => check(e, btn2));
	treno.addEventListener("input", (e) => check(e, btn3));
	data.addEventListener("input", (e) => check(e, btn4));
	</script>

	<br><br>

	<c:if test="${list.size() > 0}">
	<table>
		<tr>
			<th>idTreno</th>
			<th>Tipo</th>
			<th>Numero Posti</th>
			<th>Sigla</th>
			<th>Peso</th>
			<th>Peso Trainabile</th>
		</tr>
		<c:forEach var="treno" items="${list}">
			<tr align="center">
				<td>${treno.idTreno}</td>
				<td>${treno.tipo}</td>
				<td>${treno.numPosti}</td>
				<td>${treno.sigla}</td>
				<td>${treno.peso}</td>
				<td>${treno.pesoTrainabile}</td>
			</tr>
		</c:forEach>
	</table>
	</c:if>
</body>
</html>