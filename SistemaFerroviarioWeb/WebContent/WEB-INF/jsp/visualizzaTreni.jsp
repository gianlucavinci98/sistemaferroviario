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
					<td>${treno.idTreno}</td>
					<td>${treno.tipo}</td>
					<td>${treno.sigla}</td>
					<td>${treno.peso}</td>
					<td>${treno.pesoTrainabile}</td>
				</tr>
			</c:forEach>
		</table>
	<br><br>
	
	<form>
		Tipo: <input type="text" name="tipo">
		<input type="submit" value="sumbit" formaction="searchByType">
	</form>

</body>
</html>