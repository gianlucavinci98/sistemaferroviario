<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link href="<c:url value="/resources/css/trenoBuilder.css" />" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>Builder Treno</title>
<script type="text/javascript">

function checkLocomotivaInTesta(sequenza,submitButton){
	const testo = document.getElementById("text");
	if(sequenza.charAt(0)==="H"){
		testo.style.display = "none";
		testo.textContent="";
		checkCarattereValido(sequenza,submitButton);
	}else{
		testo.style.display = "block";
		testo.textContent="Manca il vagone";
		submitButton.disabled = true;
	}
}

function checkCarattereValido(sequenza,submitButton){
		const testo = document.getElementById("text");
		for(var i=0; i<sequenza.length;i++){
			if(sequenza.charAt(i)!="H" && sequenza.charAt(i)!="P" && sequenza.charAt(i)!="C" &&sequenza.charAt(i)!="R"){
				testo.style.display = "block";
				testo.textContent="Inserito un carattere non valido";
				submitButton.disabled = true;
			} else{
				testo.style.display = "none";
				testo.textContent="";
				checkVagoniRPC(sequenza,submitButton);			
			}
		}	
}

function checkVagoniRPC(sequenza,submitButton){
	var flagCargo = false;
	const testo = document.getElementById("text");
	if(sequenza.includes('C') && (sequenza.includes('R') || sequenza.includes('P'))){
		testo.style.display = "block";
		testo.textContent="Inserito un vagone Cargo con un vagone Ristorante e/o Passeggeri";
		submitButton.disabled = true;
	} else {
		testo.textContent="";
		testo.style.display = "none";
		checkOccRistorante(sequenza,submitButton);
	}
}

function checkOccRistorante(sequenza,submitButton){
	const testo = document.getElementById("text");
	var count = 0;
	for(var i=0;i<sequenza.length;i++){
		if(sequenza.charAt(i)==="R")
			count++;
	}
	
	if(count>2){
		testo.style.display = "block";
		testo.textContent="Inseriti troppi vagoni ristoranti";
		submitButton.disabled = true;
	}else{
		testo.style.display = "none";
		testo.textContent="";
		checkLocomotivaInMezzo(sequenza,submitButton);
	}
}

function checkLocomotivaInMezzo(sequenza,submitButton){
	const testo = document.getElementById("text");
	if(sequenza.includes("H",1)){
		testo.style.display = "block";
		testo.textContent="Inserito una locomotiva in mezzo al treno";
		submitButton.disabled = true;
	}else{
		testo.style.display = "none";
		testo.textContent="";
		submitButton.disabled = false;
	}
}
	
</script>
</head>

<body>

<div>
	<%@include file="menu.jsp"%>
</div>
	
<form>
<input id="input" type="text" placeholder="'Example: HPPPR'" name="sequenza">
<button disabled id="button" type="submit" formaction="azienda1">Build</button>
</form>	

<br>
<div style="display:none" id= text></div>





<script>
	const submitButton = document.getElementById("button");
	const input = document.getElementById("input");
	const testo = document.getElementById("text");

	input.addEventListener("keyup",(e)=>{
	const sequenza = e.currentTarget.value;
		if(sequenza===""){
			submitButton.disabled = true;
			testo.textContent="";
			testo.style.display = "none";
		}else{
			checkLocomotivaInTesta(sequenza,submitButton);
		}
	});
</script>
</body>
</html>