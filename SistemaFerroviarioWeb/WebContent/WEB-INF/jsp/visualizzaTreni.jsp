<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="<c:url value="/resources/css/tabella.css" />" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
	<div>
		<%@include file="menu.jsp"%>
	</div>


	
	<form>
	<div style="text-align:center">
		Tipo: <input type="text" name="tipo">
		<input type="submit" value="cerca" formaction="searchByType">
	</div>

	</form>
		<br><br>


<table>
			<tr>
				<th>idTreno</th>
				<th>tipo</th>
				<th>sigla</th>
				<th>peso</th>
				<th>pesoTrainabile</th>
			</tr>
			<c:forEach var="treno" items="${list}">
				<tr align="center">
					<td><a href="visualizza/${treno.idTreno}">${treno.idTreno}</a></td>
					<td>${treno.tipo}</td>
					<td>${treno.sigla}</td>
					<td>${treno.peso}</td>
					<td>${treno.pesoTrainabile}</td>
				</tr>
			</c:forEach>
		</table>



</body>
</html>