<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link  rel="stylesheet" type="text/css" href="../../../resources/css/tabella.css"/>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<%@include file="menu.jsp" %>
	</div>
	
	<div>
	${dipendente.idDipendente}
	${dipendente.nome}
	${dipendente.cognome}
	${dipendente.ruolo}
	</div>
</body>
</html>