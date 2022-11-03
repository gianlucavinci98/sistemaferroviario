<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
	<link href="<c:url value="/resources/css/visualizzaTreno.css" />" rel="stylesheet">
</head>
<body>
<div id="menu">
	<%@include file="menu.jsp" %>

</div>

<div id="display"></div>

<div id="caratteristiche">
	<br>
	idTreno = ${sessionScope.treno.idTreno}<br>
	Tipologia: ${sessionScope.treno.tipo}<br>
	NumeroPosti: ${sessionScope.treno.numPosti}<br>
	peso: ${sessionScope.treno.peso}<br>
	Sigla: ${sessionScope.treno.sigla }<br>
</div>


<script>
	var display = document.getElementById("display");
	var sequenza = "${sessionScope.sequenza}";
	var img1 = [];
	var i = 0;
	for(i=0;i<sequenza.length;i++){
		var c = sequenza.charAt(i);
			var img = new Image();
			img.src = "../../resources/img/"+c+".png";
			img1[i] = img;		
			document.getElementById("display").append(img1[i]);
	}
</script>

</body>
</html>