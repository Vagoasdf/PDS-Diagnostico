<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="orm.Bitacora"%>
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
</head><body class="lime lighten-3">
	<nav class="light-green darken-1">
		<div class="navWrapper ">
		<a href="/" class="brand-logo">Agenda Web</a>
		<ul id="nav-mobile" class=" right hide-on-med-and-down">
			<li><a href="#"> Nuevo Contacto</a> </li>
			<li><a href="verContactos"> Ver Contactos</a> </li>
			<li><a href="#"> Cerrar Sesion</a> </li>
		</ul>
		</div>
	</nav>
	<% Bitacora[] bitacoras = (Bitacora[])request.getAttribute("bitacoras");%>
	<div class="container lime lighten-1">
		
		<div class="row contactSection" >
		<%	int num=bitacoras.length;
			for(int i=0;i<num;i++){
				
			
		%>
			<div class="col l4 m4 s6">
				<div class="row">
					<div class="card light-green darken-1">
						<div class="card-content black-text">
							<span class="card-title"> <%=bitacoras[i].getTitulo()%></span>
							<p> <%=bitacoras[i].getDetalle()%> </p>
							
						</div>
						<div class="card-action">
							<a href="editNotas?id=<%=bitacoras[i].getId()%>" >Editar</a>
							<a href="deleteNotas?id=<%=bitacoras[i].getId()%>"> Eliminar</a>
						</div>
					</div>
				</div>
			</div>
	<% } %>
			
			

		</div>
	</div>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/materialize.min.js"></script>
</body>
</body>
</html>