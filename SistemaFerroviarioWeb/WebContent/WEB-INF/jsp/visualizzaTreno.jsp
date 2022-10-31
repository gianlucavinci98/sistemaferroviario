<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<img id="display">


<script>
	var display = document.getElementById("display");
	var sequenza = "${sessionScope.sequenza}";
	
	var img1 = [];
	var i = 0;
	for(i=0;i<sequenza.length;i++){
		var c = sequenza.charAt(i);
			var img = new Image();
			img.src = "../../resources/img/"+c+".png";
			img1[i] = img;		
			document.body.append(img1[i]);
			
	}


</script>

</body>
</html>