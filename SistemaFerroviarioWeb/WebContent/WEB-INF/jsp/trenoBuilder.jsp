<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div>
	<%@include file="menu.jsp"%>
</div>



<p class="001"><a href="azienda1">Azienda1</a></p>
<p class="002"><a href="#">Azienda2</a></p>
<p class="003"><a href="#">Azienda3</a></p>
	
<form>
<input id="input" type="text" placeholder="'Example: HPPPR'" name="sequenza">
<button disabled id="button" type="submit" formaction="azienda1">Build</button>
</form>	

<p id ="locomotiva">Locomotiva non in testa</p>
<p id = "carattereErrato"> Inserito un carattere non valido</p>


<script>
	const submitButton = document.getElementById("button");
	const input = document.getElementById("input");
	const locomotivaTesta = document.getElementById("locomotiva");
	locomotivaTesta.style.color="#FF0000";
	const carattereErrato = document.getElementById("carattereErrato");
	carattereErrato.style.color="#FF0000";
	
	input.addEventListener("keyup",(e)=>{
	const sequenza = e.currentTarget.value;
	if(sequenza===""){
		submitButton.disabled = true;
		locomotivaTesta.style.color = "#FF0000";
		carattereErrato.style.color= "#FF0000";
	}else{
		
		if(sequenza.charAt(0)==="H"){
			locomotivaTesta.style.color="#66ff00";
			submitButton.disable = false;
		}else{
			locomotivaTesta.style.color="#FF0000";
			submitButton.disable=true;
		}
		for(var i=0;i<sequenza.length;i++){
			if(sequenza.charAt(i)!="H" && sequenza.charAt(i)!="C" && sequenza.charAt(i)!="R" && sequenza.charAt(i)!="P" ){
				carattereErrato.style.color="#FF0000";
				submitButton.disable = true;
			}else{
				carattereErrato.style.color="#66ff00";
				submitButton.disable = false;
			}
				
		}
		
		submitButton.disabled = false;
	}
	});
	

	

</script>


</body>




</html>