<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="orm.Contacto"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <!--Import Google Icon Font-->
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <!--Import materialize.css-->
    <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>

    <!--Let browser know website is optimized for mobile-->
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Sistema de Agenda</title>
</head>
<body class="lime lighten-3">
	<nav class="light-green darken-1">
		<div class="navWrapper ">
		<a href="/" class="brand-logo">Agenda Web</a>
		<ul id="nav-mobile" class=" right hide-on-med-and-down">
			<li><a href="crearContacto.jsp"> Nuevo Contacto</a> </li>
			<li><a href="listContacto"> Ver Contactos</a> </li>
			<li><a href="#"> Cerrar Sesion</a> </li>
		</ul>
		</div>
	</nav>
<% Contacto con = (Contacto)request.getAttribute("contacto");%>
	<div class="container">
		<div class="row light-green darken-1" >
			<h2>Nueva nota para: <%=con.getNombre()+" "+con.getApellido()%></h2>
		</div>

		<div class="row">
			<form id="form-crearNota">
				<div class="input-field col s12">
					<input placeholder="Bitacora 1 " id="titulo" name="titulo" type="text" class="validate">
					<label for="titulo">Titulo:</label>
				</div>

				<div class="input-field col s12">
		        	<textarea id="detalle" class="materialize-textarea" data-length="400"></textarea>
		        	<label for="detalle">Ingrese la nota acá</label>
		        </div>
			</form>
			<div class="col s4 offset-s8"><a class="waves-effect waves-light light-green darken-1 btn" id="btnEnviar">Enviar</a></div>
					
		</div>
	</div>

<script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/materialize.min.js"></script>
</body>

<script type="text/javascript">
$(document).ready(function() {
	$('input#input_text, textarea#textarea1').characterCounter();
});

	$('#btnEnviar').click(function(){
	 var ready=true;
	console.log($("#titulo").val());
	console.log($("#detalle").val());
	 if($("#titulo").val() == ""){
		 console.log("Falta Titulo");
	 	  $("label[for='titulo']").addClass('active');
          $('label[for="titulo"]').attr('data-error',"Ingrese un Titulo");
          $('#titulo').removeClass('valid');
          $('#titulo').addClass('invalid');
	 	ready=false;
	 }
	 if($("#detalle").val() == ""){
		 console.log("Falta detalle");
	 	$("label[for='detalle']").addClass('active');
        $('label[for="detalle"]').attr('data-error',"Ingrese un cuerpo de nota");
        $('#detalle').removeClass('valid');
        $('#detalle').addClass('invalid');
	 	ready=false;
	 }
	 

	 if(ready){
		
		$.ajax({
		    url: 'crearNotas', //la ruta donde se envia el form
		    headers: {

		    },
		      type: 'POST', //tipo post
		      data: {titulo: $("#titulo").val(),detalle: $("#detalle").val(),id: <%=con.getId()%>},
		    
		      success: function(response) {
		       console.log(response);
		       if(response==true){
		    	   console.log("Escrito! Limpiar?");
		    	   window.location.replace("listContacto");
		       }else if(response==false){
		    	   console.log("cambiar a que error se muestre o algo");
		       } 
		      },
		      error: function(response) {
		      	console.log(response);
		      }
		});
	}
 });

</script>
</html>