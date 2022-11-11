<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div>
		<%@include file="menu.jsp"%>
	</div>

<div>
	La Prenotazione ${prenotazione.idPrenotazione} è andata a buon fine<br>
	Destinazione: ${prenotazione.viaggio.partenza.nomeStazione}<br>
	Arrivo: ${prenotazione.viaggio.arrivo.nomeStazione}<br>
	Data: ${prenotazione.viaggio.dataViaggio}
	
</div>


</body>
</html>