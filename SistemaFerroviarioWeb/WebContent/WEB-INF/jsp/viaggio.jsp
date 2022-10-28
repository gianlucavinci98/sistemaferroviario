<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div>
<%@include file="menu.jsp" %>
</div>

<div>
<table border=2 width="70%" align="center">
<tr><th>IdViaggio</th><th>IdPartenza</th><th>IdArrivo</th><th>IdTreno</th><th>DataViaggio</th><th>Voto</th><th>Nvoti</th>
<c:forEach var="i" begin="0" end="${dimensione}" items="${lista}">
	<tr align=center>	
	<td><c:out value="${i.idViaggio}"></c:out></td>
	<td><c:out value="${i.partenza.nomeStazione}"></c:out></td>
	<td><c:out value="${i.arrivo.nomeStazione}"></c:out></td>
	<td><c:out value="${i.idTreno}"></c:out></td>
	<td><c:out value="${i.dataViaggio}"></c:out></td>
	<td><c:out value="${i.voto}"></c:out></td>
	<td><c:out value="${i.nvoti}"></c:out></td>
</tr>
</c:forEach>

</table>
</div>


</body>
</html>