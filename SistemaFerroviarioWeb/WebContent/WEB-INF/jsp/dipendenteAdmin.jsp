<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link  rel="stylesheet" type="text/css" href="../../resources/css/tabella.css"/>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div>
<%@include file="menu.jsp" %>
</div>

<div>
<table>
<tr><th>Id</th><th>Nome</th><th>Cognome</th><th>Ruolo</th><th>Elimina</th>
<c:forEach var="i" begin="0" end="${dimensione}" items="${lista}">
	<tr align=center>	
	<td><a href="visualizza/${i.idDipendente}"><c:out value="${i.idDipendente}"></c:out></a></td>
	<td><c:out value="${i.nome}"></c:out></td>
	<td><c:out value="${i.cognome}"></c:out></td>
	<td><c:out value="${i.ruolo}"></c:out></td>
	<!--  <td><a href="edit/${i.idDipendente}">Modifica</a></td>  -->
	<td><a href="delete/${i.idDipendente}">Elimina</a></td>
</tr>
</c:forEach>

</table>
</div>
<br><br>
<div align="center">
<form >
<input type="submit" name="submit" formaction="addDip" value="Aggiungi dipendente">
<input type="submit" name="submit" formaction="associaUteDip" value="Associa Utente">
</form>
</div>
<br><br>
<br><br>
<div align="center">
<form  >
ID: <input type="text" name="id" >
<input type="submit" name="submit" formaction="moreDipendentiAdmin" value="cerca">
</form>
</div>
<br><br>
<div align="center">
<form  >
Ruolo: <input type="text" name="ruolo">
<input type="submit" name="submit" formaction="dipendentiForRuoloAdmin" value="cerca">
</form>
</div>

</body>
</html>