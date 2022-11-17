<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="java.util.Enumeration" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<title>Home</title>
<link href="<c:url value="/resources/css/home.css" />" rel="stylesheet">
	  

</head>
<body>
<div>
	<%@ include file="menu.jsp" %>
</div>
<!--  
  <%
  Enumeration<String> names = request.getHeaderNames();
  
	while(names.hasMoreElements()) {
		String name = names.nextElement();
		out.println("Valore del Header: " + name + " " + request.getHeader(name));
	}
 
	//request.getCookies(); 
	// chiave valore scadenza
  
  %>
-->
<!--     <br></br> -->
<!--     <div style="text-align: center" > -->
<!--     <h1 id="testohome">Sistema Ferroviario WEB</h1> -->
<!--     </div> -->
    
<!--     <div id="contimg" > -->
<!--     <img src="resources/img/imgtrenohome.png" id="imgsalvo"> -->
<!-- 	</div> -->
</body>
</html>