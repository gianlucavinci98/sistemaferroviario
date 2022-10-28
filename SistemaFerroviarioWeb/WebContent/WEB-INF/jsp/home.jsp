<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="java.util.Enumeration" %>

<html>
<head>
<title>Home</title>
<style> <%@ include file="../../resources/css/menu.css" %></style>

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
</body>
</html>