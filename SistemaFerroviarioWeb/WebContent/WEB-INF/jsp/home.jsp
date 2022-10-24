<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	
	<form method="get">
		<input type="submit" name="infoTreno" formaction="infoTreno" value="Info Treno">
		<input type="submit" name="addTreno" formaction="formAddTreno" value="Aggiungi Treno">
	</form>

</body>
</html>