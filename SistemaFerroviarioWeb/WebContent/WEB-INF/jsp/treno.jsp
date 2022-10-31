<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<link  rel="stylesheet" type="text/css" href="../../resources/css/tabella.css"/>
<title>Treno</title>
</head>



<body>
<div>
<%@include file="menu.jsp" %>
</div>

	ID treno: ${result.idTreno} <br>
	Tipo: ${result.tipo} <br>
	Numero posti: ${result.numPosti} <br>
	
	<br>
	<input id="btn1" type="button" value="Carica Viaggi" onclick="caricaViaggi()">
	
	<br><br>

	<c:if test="${result.viaggi.size() > 0}">
	<table id="tabella" style="visibility:hidden; width:100%">
		<tr>
			<th>Codice Viaggio</th>
			<th>Partenza</th>
			<th>Arrivo</th>
			<th>Data</th>
		</tr>
		<c:forEach var="viaggio" items="${result.viaggi}">
			<tr align="center">
				<td>${viaggio.idViaggio}</td>
				<td>${viaggio.partenza.nomeStazione}, ${viaggio.partenza.citta}</td>
				<td>${viaggio.arrivo.nomeStazione}, ${viaggio.arrivo.citta}</td>
				<td>${viaggio.dataViaggio}</td>
			</tr>
		</c:forEach>
	</table>
	</c:if>

	<script type="text/javascript">
		function caricaViaggi() {
			document.getElementById("tabella").style.visibility = "visible";
		}
	</script>

</body>
</html>