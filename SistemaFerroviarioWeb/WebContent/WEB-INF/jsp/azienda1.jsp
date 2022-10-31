<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
    <title>Pagina di reindirizzamento</title>
    <script type="text/javascript">
    function countdown(){
	var ora = parseFloat(document.rovescia.conto.value);
	ora = ora + 1.0;
	document.rovescia.conto.value=ora;
	var g_c = ora*4.5;
	document.getElementById("barra").innerHTML="<div style='height:15px; width:"+g_c+"px; background-color:#FF0000'></div>";
	if(ora==40){
		location.href = "/SistemaFerroviarioWeb/home/treno/visualizzaTreno";
	}
	conto = setTimeout("countdown()",200);
    }
    </script>
</head>
<body>
Sto costruendo il treno...

<br/>
<form name='rovescia' action='#'>
    <input type='hidden' name='conto' value='0'/>
</form>
<div class='barra' id='barra' style='border:1px solid #000000; width:180px;'></div>
<script type="text/javascript">
    countdown();
</script>
</body>
</html>