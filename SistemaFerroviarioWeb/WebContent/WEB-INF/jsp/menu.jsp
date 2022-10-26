<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>

<style>
	<%@include file="menu.css" %>
</style>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<nav>
		<ul class="menu">
			<li><a href = "#">Home</a></li>
			<li class="has-children"><a href = "#">Dipendente</a>
					<ul class="submenu">
					<li><a href="allDipendenti">Tutti Dipendenti</a></li>
					<li><a href="#">Funzione2</a></li>
					<li><a href="#">Funzione3</a></li>
					</ul>
			</li>
			<li><a href = "#">Viaggio</a></li>
			<li class="has-children"><a href = "#">Treno</a>
				<ul class=submenu>
					<c:if test="${sessionScope.utente.livello>1}">
						<li><a href="#">Costruisci Treno</a></li>
					</c:if>
					<li><a href="#">Funzione2</a></li>
					<li><a href="#">Funzione3</a></li>
				</ul>
				
			</li>
			<li><a href="logout">Logout</a></li>	
		</ul>
	</nav>
</body>
</html>