<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link  rel="stylesheet" type="text/css" href="../../../resources/css/tabella.css"/>
<meta charset="ISO-8859-1">
<meta http-equiv="Content-Security-Policy" content="default-src *;
   img-src * 'self' data: https:; script-src 'self' 'unsafe-inline' 'unsafe-eval' *;
   style-src  'self' 'unsafe-inline' *">
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
 	<img src="C:\Users\Andrea\Desktop\ImmaginiProject\profiloAlessio.jpg">
	</div>
</body>
</html>