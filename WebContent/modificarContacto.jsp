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


	<div class="container">
		<div class="row light-green darken-1" >
			<h2>Editar Contacto:</h2>
		</div>
		<% Contacto con = (Contacto)request.getAttribute("contacto");%>
		<div class="row">
			<form id="form-editarContacto">
				<div class="input-field col m6 s12">
					<input placeholder="Juan " value="<%=con.getNombre()%>" id="nombre" name="nombre" type="text" class="validate">
					<label for="nombre">Nombre</label>
				</div>

				<div class="input-field col m6 s12">
					<input placeholder="Perez" value="<%=con.getApellido()%>" id="apellido" name="apellido" type="text" class="validate">
					<label for="apellido">Apellido</label>
				</div>

				<div class="input-field col m6 s12">
					<input placeholder="12.345.678-9" value="<%=con.getRun()%>" id="rut" name="rut" type="text" class="validate">
					<label for="rut">Rut</label>
				</div>

				<div class="input-field col m6 s12">
					<input placeholder="+56999333000" id="telefono" value="<%=con.getFono()%>" name="telefono" type="text" class="validate">
					<label for="telefono">Telefono</label>
				</div>

				<div class="input-field col m6 s12">
					<input placeholder="12 de Febrero, 1996" id="fechaNac" value="<%=con.getFechaNacimiento()%>" name="fechaNac" type="text" class="validate">
					<label for="fechaNac">Fecha de Nacimiento</label>
				</div>

				<div class="input-field col  s12">
					<input placeholder="JuanPe@correo.example" id="mail" name="mail" value="<%=con.getEmail()%>" type="text" class="validate">
					<label for="mail">Correo Electronico</label>
				</div>

				<div class="input-field col m6 s12">
					<input placeholder="Los Avellanos 1556" id="direccion" value="<%=con.getDireccion()%>" name="direccion" type="text" class="validate">
					<label for="direccion">Direccion</label>
				</div>

				

				<div class="input-field col m6 s12">
					<input placeholder="Depto 605" id="residencia"  value="<%=con.getResidencia()%>" name="residencia" type="text" class="validate">
					<label for="residencia">Residencia</label>
				</div>

				<div class="input-field col s12">
					<input placeholder=" Universidad de la Frontera" id="organizacion"  value="<%=con.getOrganizacion()%>" name="organizacion" type="text" class="validate">
					<label for="organizacion">Organizacion</label>
				</div>
				<div class="row">

					<div class="col s4 "><a class="waves-effect waves-light red darken-1 btn" id="btnDelete">Eliminar</a></div>

					<div class="col s4 offset-s2"><a class="waves-effect waves-light light-green darken-1 btn" id="btnEnviar">Enviar</a></div>
					

				</div>
				
			</form>
		</div>
	</div>

<script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/materialize.min.js"></script>

<script type="text/javascript">
	
$('#btnEnviar').click(function(){
	console.log("click!");
	 var ready=true;
	 console.log("fono"+$("#telefono").val());
	 if($("#telefono").val() == ""){
		 console.log("Falta Fono");
	 	  $("label[for='telefono']").addClass('active');
          $('label[for="telefono"]').attr('data-error',"Ingrese un Teléfono");
          $('#telefono').removeClass('valid');
          $('#telefono').addClass('invalid');
	 	ready=false;
	 }
	 if($("#rut").val() == ""){
		 console.log("Falta Rut");
	 	$("label[for='rut']").addClass('active');
        $('label[for="rut"]').attr('data-error',"Ingrese su Rut");
        $('#rut').removeClass('valid');
        $('#rut').addClass('invalid');
	 	ready=false;
	 }
	 if($("#fechaNac").val() == ""){
		 console.log("Falta Fecha");
	 	$("label[for='fechaNac']").addClass('active');
        $('label[for="fechaNac"]').attr('data-error',"Ingrese la fecha de nacimiento");
        $('#fechaNac').removeClass('valid');
        $('#fechaNac').addClass('invalid');
	 	ready=false;
	 }
	 if($("#nombre").val() == ""){
		 console.log("Falta Nombre");
	 	$("label[for='nombre']").addClass('active');
        $('label[for="nombre"]').attr('data-error',"Ingrese un Nombre");
        $('#nombre').removeClass('valid');
        $('#nombre').addClass('invalid');
	 	ready=false;
	 }
	 if($("#apellido").val() == ""){
		 console.log("Falta Apellido");
	 	$("label[for='apellido']").addClass('active');
        $('label[for="apellido"]').attr('data-error',"Ingrese un Apellido");
        $('#apellido').removeClass('valid');
        $('#apellido').addClass('invalid');
	 	ready=false;
	 }
	 /** Avatar
	 if($("#fono".val() == null){
	 	//add error falta fono
	 	ready=false;
	 }
	 **/

	 if(ready){
		
		$.ajax({
		    url: 'loadContacto', //la ruta donde se envia el form
		    headers: {

		    },
		      type: 'POST', //tipo post
		      data: {nombre: $("#nombre").val(),apellido: $("#apellido").val(), rut:$("#rut").val(),
		    	  fono:$("#telefono").val(),fechaNac:$("#fechaNac").val(),email:$("#mail").val(),
		    	  direccion:$("#direccion").val(),residencia:$("#residencia").val(),organizacion:$("#organizacion").val(),
		    	  idContacto:<%=con.getId()%>
		    	},
		    
		      success: function(response) {
		       console.log(response);
		       if(response==true){
		    	   console.log("Escrito! Limpiar?");
		    	  /window.location.replace("listContacto");
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

$('#btnDelete').click(function(){
	$.ajax({
		    url: 'loadContacto', //la ruta donde se envia el form
		    headers: {

		    },
		      type: 'POST', //tipo post
		      data: {eliminar: "true",
		    	  idContacto:<%=con.getId()%>
		    	},
		    
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
})
</script>
</body>
</html>