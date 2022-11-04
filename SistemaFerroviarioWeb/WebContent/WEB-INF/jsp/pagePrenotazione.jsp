<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<link href="<c:url value="/resources/css/tabella.css" />" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<%@include file="menu.jsp"%>
	</div>


<table>
			<tr>
				<th>idPrenotazione</th>
				<th>Stazione Partenza</th>
				<th>Stazione Arrivo</th>
				<th>Data</th>
				<c:if test="${sessionScope.utente.livello > 1}">
					<th>Utente</th>
				</c:if>
			</tr>
			<c:forEach var="prenotazione" items="${list}">
				<tr align="center">
					<td>${prenotazione.idPrenotazione}</td>
					<td>${prenotazione.viaggio.partenza.nomeStazione},${prenotazione.viaggio.partenza.citta}</td>
					<td>${prenotazione.viaggio.arrivo.nomeStazione},${prenotazione.viaggio.arrivo.citta}</td>
					<td>${prenotazione.viaggio.dataViaggio}</td>
					<c:if test="${sessionScope.utente.livello > 1}">
						<td>${prenotazione.utente.username}</td>
					</c:if>
				</tr>
			</c:forEach>
		</table>

</body>
</html>