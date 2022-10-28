<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<input id="sequenza" type="text" placeholder="Example: 'HPPP'" onchange="">

<input type="button" value="Click Me" onclick="checkStringa()">
<p id="messaggio"></p>

<script>
	var checkStringa = function() {
		var sequenza = document.getElementById("sequenza").value;
		var firstCharacter = sequenza.charAt(0);
			if(firstCharacter!='H'){
				document.getElementById("messaggio").innerHTML = "Non hai inserito la locomitiva in testa";
			}
				
			else{
				
			}
				alert("ok");
		
			
	}
	

</script>
</body>
</html>