<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Treno</title>
</head>
<body>

	ID treno: ${result.idTreno} <br>
	Tipo: ${result.tipo} <br>
	Numero posti: ${result.numPosti} <br>
	
	<br>
	<form method="get">
		<input type="submit" name="submitViaggi" formaction="viaggiByTreno" value="Carica Viaggi">
	</form>
	
	<br><br>

	<c:if test="${result.viaggi.size() > 0}">
	<table style="width:100%">
		<tr>
			<th>Codice Viaggio</th>
			<th>Partenza</th>
			<th>Arrivo</th>
			<th>Data</th>
		</tr>
		<c:forEach var="viaggio" items="${result.viaggi}">
			<tr align="center">
				<td>${viaggio.idViaggio}</td>
				<td>${viaggio.partenza}</td>
				<td>${viaggio.arrivo}</td>
				<td>${viaggio.dataViaggio}</td>
			</tr>
		</c:forEach>
	</table>
	</c:if>
	
</body>
</html>