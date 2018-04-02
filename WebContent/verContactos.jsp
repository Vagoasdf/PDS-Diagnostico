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
<title>Editar Contacto</title>
</head>
<body class="lime lighten-3">
	<nav class="light-green darken-1">
		<div class="navWrapper ">
			<a href="/" class="brand-logo">Agenda Web</a>
			<ul id="nav-mobile" class=" right hide-on-med-and-down">
				<li><a href="crearContacto.jsp"> Nuevo Contacto</a> </li>
				<li><a href="listContacto"> Ver Contactos</a> </li>
			</ul>
		</div>
	</nav>

<div class="section">
<div class="container">

	<div class="col s6 offset-s2 indigo lighten-2 z-depth-3">
		<div class="row">
		<form id="busquedaBasica" action="PDS-Diagnostico/buscador" method="post">
		<div class="section">
			<div class="input_field col s12 m6 ">
				<input id="nombre" type="text" name="nombre" >
				<label for="nombre"> Nombre </label>
			</div> 
			<div class="input_field col s12 m6 ">
				<input id="apellido" type="text" name="apellido" >
				<label for="apellido"> Apellido </label>
			</div>  
			<div class="input_field col s12 m6 ">
				<input id="email" type="email" name="email" >
				<label for="email"> email </label>
			</div>  
			<div class="input_field col s12 m6 ">
				<input id="organizacion" type="text" name="organizacion" >
				<label for="organizacion"> Organizacion </label>
			</div>  
			<div class="input_field col s12 m6 ">
				<input id="direccion" type="text" name="direccion" >
				<label for="direccion"> Direccion </label>
			</div>   
		</div>

		<div class="col s2 right-align"> <a class="waves-effect waves-light btn modal-trigger" href="#modalBuscar">Busqueda Avanzada</a> </div>
		<div class="col s2 right-align"> <button class="waves-effect waves-light btn" type="sumbit"  name="action">Buscar</button> </div>
		</form>
	</div>
	</div>
</div>
</div>

<div id="modalBuscar" class="modal">
	<div class="modal-content">
		<h4> Busqueda Avanzada</h4>
		<form id="busquedaAvanzada" action="PDS-Diagnostico/buscador" method="post">
		<div class="section">
			<div class="row">
				<div class="input_field col s12 m6 ">
					<input id="nombreAv" type="text" name="nombre" >
					<label for="nombreAv"> Nombre </label>
				</div> 
				<div class="input_field col s12 m6 ">
					<input id="apellidoAv" type="text" name="apellido" >
					<label for="apellidoAv"> Apellido </label>
				</div>  
			</div>
			<div class="row">
				<div class="input_field col s12 m6 ">
					<input id="emailAv" type="email" name="email" >
					<label for="emailAv"> email </label>
				</div> 
				<div class="input_field col s12 m6 ">
					<input id="telefonoAv" type="email" name="telefono" >
					<label for="telefonoAv"> telefono </label>
				</div> 
				<input id="avanzada" name="avanzada" type="hidden" value="1">
			</div>
			<div class="row">
				<div class="input_field col s12 m6 ">
					<input id="organizacionAv" type="text" name="organizacion" >
					<label for="organizacionAv"> Organizacion </label>
				</div>  
				<div class="input_field col s12 m6 ">
					<input id="direccionAv" type="text" name="direccion" >
					<label for="direccionAv"> Direccion </label>
				</div>   
			</div>
		</div>
		<div class="row">
			<div clas="col s4 offset-s6">
				<button class="waves-effect waves-light btn" type="sumbit" name="action">Buscar</button>
			</div>
		</div>
	</form>

	</div>

</div>
	<% Contacto[] contactos = (Contacto[])request.getAttribute("contactos");
		if(contactos==null){ %>

	<div class="container lime lighten-1">
		<div class="col s4 offset-s2">
			<h2>Lo sentimos. Hubo un error cargando la información.</h2>
		</div>
	</div>
	<%
	}else{
	%>
	<div class="container lime lighten-1">
		<ul class="collapsible lime darken-2 " data-collapsible="accordion">
			<%	int numContactos=contactos.length;
				for(int i=0;i<numContactos;i++){		
				
			%>
			<li>
				<div class="collapsible-header lime darken-2"><%=contactos[i].getNombre() %> </div>
				<div class="collapsible-body">
					<div class="card light-green darken-1 hoverable">
						
						<div class="card-content black-text">
							<div class="row">
								<div class="col m4 s2">
									
									<%=contactos[i].getNombre()%>  <%=contactos[i].getApellido() %>
								</div>
								<div class="col m8 s10  light-green">
									<ul>
										<li>Organizacion: <%=contactos[i].getOrganizacion()%></li>
										<li>Direccion: <%=contactos[i].getDireccion()%> </li>
										<li>Residencia: <%=contactos[i].getResidencia()%> </li>
										<li>Correo: <%=contactos[i].getEmail()%> </li>
										<li>Telefono <%=contactos[i].getFono()%> </li>
										<li>RUT: <%=contactos[i].getRun()%> </li>
										<li>Fecha de Nacimiento <%=contactos[i].getFechaNacimiento()%> </li>
										
									</ul>
								</div>
							</div>				
						</div>
						<div class="card-action">
							<a href="loadNotas?id=<%=contactos[i].getId()%>">Notas</a>
							<a href="loadContacto?id=<%=contactos[i].getId()%>">Editar Contacto</a>
							<a href="crearNotas?id=<%=contactos[i].getId()%>">Nueva Nota</a>
						</div>
					</div>
				</div>
			</li>
			<% } %>
			<li>
				
		</ul>
	 	
	</div>
	<% } %>
	<a class="btn-floating btn-large waves-effect waves-light red" href="crearContacto.jsp"><i class="material-icons">add</i></a>

<script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/materialize.min.js"></script>
</body>

<script type="text/javascript" >
$(document).ready(function(){
	$('.collapsible').collapsible();
});

  $(document).ready(function(){
    $('.modal').modal();
  });
</script>
</html>