<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<link href="<c:url value="/resources/css/menu.css" />" rel="stylesheet">
	
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>


<body>
	<nav>
		<ul class="menu">
			<li><a href = "/SistemaFerroviarioWeb/home">Home</a></li>
			<c:if test="${sessionScope.utente.livello>=1}">
			<li class="has-children"><a href = "#">Dipendente</a>
					<ul class="submenu">
					<c:if test="${sessionScope.utente.livello<2}">
					<li><a href="/SistemaFerroviarioWeb/home/dipendente/allDipendenti">Tutti i Dipendenti</a></li>
					</c:if>
					<c:if test="${sessionScope.utente.livello>1}">
						<li><a href="/SistemaFerroviarioWeb/home/turni/">Gestisci Turni</a></li>
					</c:if>
					<c:if test="${sessionScope.utente.livello<2}">
						<li><a href="/SistemaFerroviarioWeb/home/turni/myTurni">I miei Turni</a></li>
					</c:if>
					<c:if test="${sessionScope.utente.livello>1}">
						<li><a href="/SistemaFerroviarioWeb/home/dipendente/allDipendentiAdmin">Gestisci Dipendenti</a></li>
					</c:if>
					</ul>
			</li>
			<li class="has-children"><a href = "#">Viaggio</a>
					<ul class="submenu">
					<c:if test="${sessionScope.utente.livello<1}">
						<li><a>I Tuoi Viaggi</a></li>
					</c:if>
					<c:if test="${sessionScope.utente.livello>1}">
						<li><a href="/SistemaFerroviarioWeb/home/viaggio/formAddViaggio">Aggiungi Viaggio</a></li>
					</c:if>
					<c:if test="${sessionScope.utente.livello>0}">
						<li><a href="/SistemaFerroviarioWeb/home/viaggio/allViaggi">Tutti i Viaggi</a></li>
					</c:if>
					</ul>
			</li>
			</c:if>
			<c:if test="${sessionScope.utente.livello>1}">
			<li class="has-children"><a href = "#">Treno</a>
				<ul class=submenu>
				
						<li><a href="/SistemaFerroviarioWeb/home/treno/builderTreno">Costruisci Treno</a></li>
					<li><a href="/SistemaFerroviarioWeb/home/treno/infoTreno">Info Treno</a></li>
					<li><a href="/SistemaFerroviarioWeb/home/treno/visualizzaTreni">AllTreni</a></li>
						
				</ul>
				
			</li>
			</c:if>
			<li class="has-children"><a href = "#">Prenotazione</a>
				<ul class=submenu>
			<c:if test="${sessionScope.utente.livello<1}">
			<li><a href="/SistemaFerroviarioWeb/home/prenotazione/pagePrenotazione">Le Mie Prenotazioni</a></li>
			<li><a href="/SistemaFerroviarioWeb/home/viaggio/allViaggi">Visualizza Viaggi</a></li>
			</c:if>
			<c:if test="${sessionScope.utente.livello>1}">
				<li><a href="/SistemaFerroviarioWeb/home/prenotazione/allPrenotazioni">Prenotazioni</a></li>
			</c:if>
			</ul>
			<li><a href="/SistemaFerroviarioWeb/logout">Logout</a></li>	
		</ul>
	</nav>
</body>
</html>