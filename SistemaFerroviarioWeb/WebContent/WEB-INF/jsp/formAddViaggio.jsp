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
	
	
<%-- 	<form:form modelAttribute="viaggio" method="GET">   --%>
	   
<!-- 	<label for="treni">Scegli treno:</label> -->
<%--     <form:select id="treni" path="treno"> --%>
<%--     <c:forEach var="i" begin="0" end="${listaTreni.size()}" items="${listaTreni}"> --%>
<%--       <form:option value="i" label="${i.idTreno} - ${i.sigla}"></form:option> --%>
<%--     </c:forEach> --%>
<%--     </form:select> --%>
<!--     <br><br> -->
    
<!--     <label for="partenze">Scegli partenza:</label> -->
<%--     <form:select id="partenze" name="partenze" path="partenza"> --%>
<%--     <c:forEach var="i" begin="0" end="${listaStazioni.size()}" items="${listaStazioni}"> --%>
<%--       <form:option value="i" label="${i.nomeStazione}"></form:option> --%>
<%--     </c:forEach> --%>
<%--     </form:select> --%>
<!--     <br><br> -->
    
<!--     <label for="arrivi">Scegli arrivo:</label> -->
<%--     <form:select id="arrivi" name="arrivi" path="arrivo"> --%>
<%--     <c:forEach var="i" begin="0" end="${listaStazioni.size()}" items="${listaStazioni}"> --%>
<%--       <form:option value="i" label="${i.nomeStazione}"></form:option> --%>
<%--     </c:forEach> --%>
<%--     </form:select> --%>
<!--     <br><br> -->
    
<%--     Data (YYYY-MM-DD): <form:input path="dataViaggio"/> <br><br> --%>
    
<!-- 	<input type="submit" name="submit" formaction="addViaggio" value="AGGIUNGI">  -->
<%-- 	</form:form> --%>





	<div align="center">
		<form id=addViaggio>
			
			<label for="treno">Scegli treno:</label>
		    <select id="treno" name="treno">
		    <c:forEach var="i" begin="0" end="${listaTreni.size()}" items="${listaTreni}">
		      <option value="${i.idTreno}" label="${i.idTreno} - ${i.sigla}"></option>
		    </c:forEach>
		    </select>
		    <br><br>
		    
			<label for="idpartenza">Scegli partenza:</label>
		    <select id="partenza" name="partenza">
		    <c:forEach var="i" begin="0" end="${listaStazioni.size()}" items="${listaStazioni}">
		      <option value="${i.idStazione}" label="${i.nomeStazione}"></option>
		    </c:forEach>
		    </select>
		    <br><br>
		    
		    <label for="arrivo">Scegli arrivo:</label>
		    <select id="arrivo" name="arrivo">
		    <c:forEach var="i" begin="0" end="${listaStazioni.size()}" items="${listaStazioni}">
		      <option value="${i.idStazione}" label="${i.nomeStazione}"></option>
		    </c:forEach>
		    </select>
		    <br><br>
					
			Data (YYYY-MM-DD): <input id="data" name="data" type="text" /> <br><br>
			
			<input type="submit" name="submit" formaction="addViaggio" value="AGGIUNGI"> 
		</form>
	</div>

</body>
</html>