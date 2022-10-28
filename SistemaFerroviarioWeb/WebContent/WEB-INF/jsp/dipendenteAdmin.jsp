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
<tr><th>Id</th><th>Nome</th><th>Cognome</th><th>Ruolo</th><th>Elimina</th>
<c:forEach var="i" begin="0" end="${dimensione}" items="${lista}">
	<tr align=center>	
	<td><c:out value="${i.idDipendente}"></c:out></td>
	<td><c:out value="${i.nome}"></c:out></td>
	<td><c:out value="${i.cognome}"></c:out></td>
	<td><c:out value="${i.ruolo}"></c:out></td>
	<!--  <td><a href="edit/${i.idDipendente}">Modifica</a></td>  -->
	<td><a href="delete/${i.idDipendente}">Elimina</a></td>
</tr>
</c:forEach>

</table>
<br><br>
<br><br>
<br><br>
<form  align="center">
ID: <input type="text" name="id" >
<input type="submit" name="submit" formaction="moreDipendentiAdmin" value="cerca">
</form>
<br><br>
<form  align="center">
Ruolo: <input type="text" name="ruolo">
<input type="submit" name="submit" formaction="dipendentiForRuoloAdmin"" value="cerca">
</form>
</div>

</body>
</html>