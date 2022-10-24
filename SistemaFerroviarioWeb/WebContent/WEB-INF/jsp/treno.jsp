<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Treno</title>
</head>
<body>

	ID treno: ${result.idTreno} <br>
	Tipo: ${result.tipo} <br>
	Numero posti: ${result.numPosti} <br>
	<br>
	<form method="get">
		<input type="submit" name="submitViaggi" formaction="viaggiByTreno" value="Carica Viaggi">
	</form>
	
</body>
</html>