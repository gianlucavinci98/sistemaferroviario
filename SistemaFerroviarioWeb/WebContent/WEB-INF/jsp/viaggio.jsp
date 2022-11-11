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
	<td><a href="visualizza/${i.idViaggio}"><c:out value="${i.idViaggio}"></c:out></a></td>	
	<td><c:out value="${i.partenza.nomeStazione}, ${i.partenza.citta}"></c:out></td>
	<td><c:out value="${i.arrivo.nomeStazione}, ${i.arrivo.citta}"></c:out></td>
	<td><c:out value="${i.idTreno.idTreno} - ${i.idTreno.sigla}"></c:out></td>
	<td><c:out value="${i.dataViaggio}"></c:out></td>
</tr>
</c:forEach>

</table>
<br></br>

<div align="center">

<form:form modelAttribute="emp" method="GET">
        
Codice Viaggio: <form:input  type="number" path="idViaggio"/> 

Partenza: <form:input type="text" path="cittaPartenza"/>
<!-- <br><br> -->
Arrivo: <form:input type="text" path="cittaArrivo"/>
<!-- <br><br> -->
Treno: <form:input type="number" id="idTreno" path="idTreno" />

Data: <form:input type="text" id="dataViaggio" path="dataViaggio"/>
<br><br>

<input type="submit" name="submit" formaction="findViaggiByFilter" value="cerca">


 </form:form>




</div>





</body>
</html>