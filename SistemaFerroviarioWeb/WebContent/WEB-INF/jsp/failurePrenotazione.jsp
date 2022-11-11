<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Failure Prenotazione</title>
</head>
<body>

	<div>
		<%@include file="menu.jsp"%>
	</div>

<div>
	La prenotazione non è andata a buon fine perchè: ${message}
</div>

</body>
</html>