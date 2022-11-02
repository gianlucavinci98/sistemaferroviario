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
    <form:select id="treni" path="treno">
    <c:forEach var="i" begin="0" end="${listaTreni.size()}" items="${listaTreni}">
      <form:option value="i" label="${i.idTreno} - ${i.sigla}"></form:option>
    </c:forEach>
    </form:select>
    <br><br>
    
    <label for="partenze">Scegli partenza:</label>
    <select id="partenze" name="partenze">
    <c:forEach var="i" begin="0" end="${listaStazioni.size()}" items="${listaStazioni}">
      <option value="i">${i.nomeStazione}</option>
    </c:forEach>
    </select>
    <br><br>
    
    <label for="arrivi">Scegli arrivo:</label>
    <select id="arrivo" name="arrivo">
    <c:forEach var="i" begin="0" end="${listaStazioni.size()}" items="${listaStazioni}">
      <option value="i">${i.nomeStazione}</option>
    </c:forEach>
    </select>
    <br><br>
    
	<input type="submit" name="submit" formaction="addViaggio" value="AGGIUNGI"> 
	</form:form>

</body>
</html>