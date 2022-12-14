	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<link href="<c:url value="/resources/css/tabella.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/corpo.css" />" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Elenco Viaggi</title>


</head>

<body>

<div>
<c:if test="${sessionScope.utente!=null }">
<%@include file="menu.jsp" %>
</c:if>
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
	<c:if test="${sessionScope.utente==null}">
		<td><c:out value="${i.idViaggio}"></c:out></td>
	</c:if>	
	<c:if test="${sessionScope.utente.livello>1}">
		<td><a href="visualizza/${i.idViaggio}"><c:out value="${i.idViaggio}"></c:out></a></td>
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