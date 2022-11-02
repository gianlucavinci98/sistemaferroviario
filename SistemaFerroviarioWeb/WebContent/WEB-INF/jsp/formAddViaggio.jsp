<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inserisci Viaggio</title>
</head>
<body>

	<div>
		<%@include file="menu.jsp"%>
	</div>
	
	
	<form:form modelAttribute="viaggio" method="GET">     
	<label for="treni">Scegli treno:</label>
    <select id="treni" name="treni">
    <c:forEach var="i" begin="0" end="${listaTreni.size()}" items="${listaTreni}">
      <option value="i">${i.idTreno} - ${i.sigla}</option>
    </c:forEach>
    </select>
    <br><br>
	<input type="submit" name="submit" formaction="addViaggio" value="AGGIUNGI"> 
	</form:form>

</body>
</html>