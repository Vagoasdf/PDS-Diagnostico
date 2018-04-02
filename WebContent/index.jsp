<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
		</ul>
		</div>
	</nav>
	
<div class="container">

	
	<div class="row  loginBar" >
		
		<div class="col m6 offset-m4 s4 offset-s5 card-panel lime ">
			<form class="loginSection" id="form-login">
				<div class ="row  black-text ">
					<div class="input-field col  m6 s12 ">
						<input  id="loginUsername" name="username" type="text" class="validate">
						<label for="loginUsername"> Usuario</label>
					</div>
					<div class="input-field col  m6 s12">
						<label for="loginPassword"> Contraseña</label>
						<input placeholder="Password" id="loginPassword" name="password" type="password" class="validate">
					</div>
					<div class="col s4 offset-s6 btn light-green darken-1 white-text" id="btnLogin"> <span> Login</span></div>
				</div>
			</form>
		</div>
		
		
	</div>
</div>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/materialize.min.js"></script>
</body>

<script type="text/javascript">

 $('#btnLogin').click(function(){
	
	$.ajax({
	    url: 'LoginController', //la ruta donde se envia el form
	    headers: {

	    },
	      type: 'POST', //tipo post
	      data: {username: $("#loginUsername").val(),password: $("#loginPassword").val()},
	    
	      success: function(response) {
	       console.log(response);
	       if(response==true){
	    	   console.log("Redirect aca a main");
	    	   window.location.replace("listContacto");
	       }else if(response==false){
	    	      $('label[for="loginUsername"]').addClass('active');
	    	      $('label[for="loginUsername"]').attr('data-error',"Error al Ingresar sesion");
	    	      $('#loginUsername').removeClass('valid');
	    	      $('#loginUsername').addClass('invalid');
	    	      $('#loginPassword').removeClass('valid');
	    	      $('#loginPassword').addClass('invalid');
	       } 
	      },
	      error: function(response) {
	      	console.log(response);
	      }
	});
 });
</script>
</html>