	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>

<head>
<link  rel="stylesheet" type="text/css" href="../../resources/css/tabella.css"/>
<meta charset="ISO-8859-1">
<title>Elenco Viaggi</title>


</head>

<body>

<div>
<%@include file="menu.jsp" %>
</div>

<div>
<table>
<tr>
	<th>Codice Viaggio</th>
	<th>Partenza</th>
	<th>Arrivo</th>
	<th>Treno</th>
	<th>Data</th>
</tr>


<c:forEach var="i" begin="0" end="${dimensione}" items="${lista}">
	<tr align=center>	
	<c:if test="${sessionScope.utente.livello>1}">
		<td><c:out value="${i.idViaggio}"></c:out></td>
	</c:if>
	<c:if test="${sessionScope.utente.livello<1}">
		<td><a href ="../../home/prenotazione/addPrenotazione/${i.idViaggio}"><c:out value="${i.idViaggio}"></c:out></a></td>
	</c:if>
	<td><c:out value="${i.partenza.nomeStazione}, ${i.partenza.citta}"></c:out></td>
	<td><c:out value="${i.arrivo.nomeStazione}, ${i.arrivo.citta}"></c:out></td>
	<td><c:out value="${i.idTreno.idTreno} - ${i.idTreno.sigla}"></c:out></td>
	<td><c:out value="${i.dataViaggio}"></c:out></td>
</tr>
</c:forEach>

</table>
</div>
<br></br>

</body>
</html>