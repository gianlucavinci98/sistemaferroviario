<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
     
<!DOCTYPE html>
<html>

<head>
<link  rel="stylesheet" type="text/css" href="resources/css/tabella.css"/>
<link href="<c:url value="/resources/css/corpo.css" />" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Elenco Viaggi</title>


</head>

<body>
<br>
<div align="center">



<form:form modelAttribute="emp" method="GET">
        
Codice Viaggio: <form:input  type="number" path="idViaggio"/> 

Partenza: <form:input type="text" path="cittaPartenza"/>
<!-- <br><br> -->
Arrivo: <form:input type="text" path="cittaArrivo"/>
<!-- <br><br> -->
Treno: <form:input type="number" id="idTreno" path="idTreno" />

Data: <form:input type="text" id="dataViaggio" path="dataViaggio"/>

<input type="submit" name="submit" formaction="findViaggiByFilter" value="cerca">
<br><br>


 </form:form>

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
	<td><c:out value="${i.idViaggio}"></c:out></td>
	<td><c:out value="${i.partenza.nomeStazione}, ${i.partenza.citta}"></c:out></td>
	<td><c:out value="${i.arrivo.nomeStazione}, ${i.arrivo.citta}"></c:out></td>
	<td><c:out value="${i.idTreno.idTreno} - ${i.idTreno.sigla}"></c:out></td>
	<td><c:out value="${i.dataViaggio}"></c:out></td>
</tr>
</c:forEach>

</table>
<br></br>

</div>





</body>
</html>