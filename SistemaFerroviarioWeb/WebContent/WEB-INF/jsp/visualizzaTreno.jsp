<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
	<link href="<c:url value="/resources/css/tabella.css" />" rel="stylesheet">
	<link href="<c:url value="/resources/css/visualizzaTreno.css" />" rel="stylesheet">
</head>
<body>
<div id="menu">
	<%@include file="menu.jsp" %>

</div>

<div id="display"></div><br><br>

<div id="caratteristiche">
	<br>
	idTreno = ${sessionScope.treno.idTreno}<br>
	Tipologia: ${sessionScope.treno.tipo}<br>
	NumeroPosti: ${sessionScope.treno.numPosti}<br>
	peso: ${sessionScope.treno.peso}<br>
	Sigla: ${sessionScope.treno.sigla }<br>
</div>

<c:if test="${sessionScope.treno.viaggi.size() > 0}">
<br>
<input id="btn1" type="button" value="Carica Viaggi" onclick="caricaViaggi()">
<br><br>
</c:if>
	<c:if test="${sessionScope.treno.viaggi.size() > 0}">
	<table id="tabella" style="visibility:hidden; width:100%">
		<tr>
			<th>Codice Viaggio</th>
			<th>Partenza</th>
			<th>Arrivo</th>
			<th>Data</th>
		</tr>
		<c:forEach var="viaggio" items="${sessionScope.treno.viaggi}">
			<tr align="center">
				<td> <a href="../../home/viaggio/visualizza/${viaggio.idViaggio}"> ${viaggio.idViaggio}</a></td>
				<td>${viaggio.partenza.nomeStazione}, ${viaggio.partenza.citta}</td>
				<td>${viaggio.arrivo.nomeStazione}, ${viaggio.arrivo.citta}</td>
				<td>${viaggio.dataViaggio}</td>
			</tr>
		</c:forEach>
	</table>
	</c:if>



<script>
	var display = document.getElementById("display");
	var sequenza = "${sessionScope.treno.sigla}";
	var img1 = [];
	var i = 0;
	for(i=0;i<sequenza.length;i++){
		var c = sequenza.charAt(i);
			var img = new Image();
			img.src = "../../resources/img/"+c+".png";
			img1[i] = img;		
			document.getElementById("display").append(img1[i]);
	}
	
	function caricaViaggi() {
		if (document.getElementById("tabella").style.visibility == "visible") {
			document.getElementById("tabella").style.visibility = "hidden";
		}
		else {
			document.getElementById("tabella").style.visibility = "visible";
		}
		
	}
	
</script>

</body>
</html>