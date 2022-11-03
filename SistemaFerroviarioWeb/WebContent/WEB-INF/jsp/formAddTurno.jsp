<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>

<html>
<head>

<link href="<c:url value="/resources/css/tabella.css" />" rel="stylesheet">

<meta charset="ISO-8859-1">
<title>Aggiungi turno</title>
</head>

<body>

	<div>
		<%@include file="menu.jsp"%>
	</div>

	<h1 align="center">Aggiungi turno</h1>

	<div align="center">
		<form id=addTurno>
			ID Dipendente: <input id="idDipendente" name="idDipendente" type="number" /> <br><br> 
			ID Treno: <input id="idTreno" name="idTreno" type="number" /> <br><br> 
			Data (YYYY-MM-DD): <input id="data" name="data" type="text" /> <br><br>
			<input type="submit" name="submit" formaction="all" value="Lista dei turni"> 
			<input disabled id="button" type="submit" name="submit" formaction="add" value="Aggiungi">
		</form>
	</div>

	<br><br>

	<div align="center">${message}</div>
	
	<script type="text/javascript">
		const submitButton = document.getElementById("button");
		const dipendente = document.getElementById("idDipendente");
		const treno = document.getElementById("idTreno");
		const data = document.getElementById("data");
		var flag1 = false;
		var flag2 = false;
		var flag3 = false;
		
		dipendente.addEventListener("input", (e) => {
			const id = e.currentTarget.value;
			
			if (id != "") {
				flag1 = true;
				check(submitButton, flag1, flag2, flag3);
			} else {
				flag1 = false;
				submitButton.disabled = true;
			}
		});
		
		treno.addEventListener("input", (e) => {
			const id = e.currentTarget.value;
			
			if (id != "") {
				flag2 = true;
				check(submitButton, flag1, flag2, flag3);
			} else {
				flag2 = false;
				submitButton.disabled = true;
			}
		});
		
		data.addEventListener("input", (e) => {
			const id = e.currentTarget.value;
			
			if (id != "") {
				flag3 = true;
				check(submitButton, flag1, flag2, flag3);
			} else {
				flag3 = false;
				submitButton.disabled = true;
			}
		});
		
		function check(button, flag1, flag2, flag3) {
			if (flag1 && flag2 && flag3)
				button.disabled = false;
		}
	</script>
	
</body>
</html>