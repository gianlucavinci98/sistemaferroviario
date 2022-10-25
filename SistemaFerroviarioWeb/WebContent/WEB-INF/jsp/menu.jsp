<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
			<li><a href = "#">Dipendente</a></li>
			<li><a href = "#">Viaggio</a></li>
			<li class="has-children"><a href = "#">Treno</a>
				<ul class=submenu>
					<li><a href="#">Funzione1</a></li>
					<li><a href="#">Funzione2</a></li>
					<li><a href="#">Funzione3</a></li>
				</ul>
				
			</li>
			<li><a href="#">Logout</a></li>	
		</ul>
	</nav>
</body>
</html>