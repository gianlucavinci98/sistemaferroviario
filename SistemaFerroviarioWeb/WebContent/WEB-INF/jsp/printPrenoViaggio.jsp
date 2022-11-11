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