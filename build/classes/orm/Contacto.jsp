<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<jsp:useBean id="ContactoBean" scope="page" class="orm.ContactoProcessor" />
<jsp:setProperty name="ContactoBean" property="*" />
<% String result = ContactoBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'ContactoList.jsp';
		return true;
	}
// -->
</script>
<head><title>Contacto</title>
</head>
<body>
<h1>Contacto</h1>
<form method="POST" name="form1" action=Contacto.jsp>
	<table>
		<tr>
			<td>*Id : </td>
			<td><input type=text name="id" value="<jsp:getProperty name="ContactoBean" property="id"/>" /></td>
		</tr>
		<tr>
			<td>Fono : </td>
			<td><input type=text name="fono" value="<jsp:getProperty name="ContactoBean" property="fono"/>" /></td>
		</tr>
		<tr>
			<td>Run : </td>
			<td><input type=text name="run" value="<jsp:getProperty name="ContactoBean" property="run"/>" /></td>
		</tr>
		<tr>
			<td>FechaNacimiento : </td>
			<td><input type=text name="fechaNacimiento" value="<jsp:getProperty name="ContactoBean" property="fechaNacimiento"/>" /></td>
		</tr>
		<tr>
			<td>Nombre : </td>
			<td><input type=text name="nombre" value="<jsp:getProperty name="ContactoBean" property="nombre"/>" /></td>
		</tr>
		<tr>
			<td>Apellido : </td>
			<td><input type=text name="apellido" value="<jsp:getProperty name="ContactoBean" property="apellido"/>" /></td>
		</tr>
		<tr>
			<td>FotoAvatar : </td>
			<td><input type=text name="fotoAvatar" value="<jsp:getProperty name="ContactoBean" property="fotoAvatar"/>" /></td>
		</tr>
		<tr>
			<td>Direccion : </td>
			<td><input type=text name="direccion" value="<jsp:getProperty name="ContactoBean" property="direccion"/>" /></td>
		</tr>
		<tr>
			<td>Email : </td>
			<td><input type=text name="email" value="<jsp:getProperty name="ContactoBean" property="email"/>" /></td>
		</tr>
		<tr>
			<td>Residencia : </td>
			<td><input type=text name="residencia" value="<jsp:getProperty name="ContactoBean" property="residencia"/>" /></td>
		</tr>
		<tr>
			<td>Organizacion : </td>
			<td><input type=text name="organizacion" value="<jsp:getProperty name="ContactoBean" property="organizacion"/>" /></td>
		</tr>
	</table>
	<INPUT type="hidden" name="action" value="">
	<hr>
	<INPUT type="button" value="List All" onclick="return listAll();">
	<INPUT type="button" value="Search" onclick="return perform('search');">
	<INPUT type="button" value="Insert" onclick="return perform('insert');">
	<INPUT type="button" value="Update" onclick="return perform('update');">
	<INPUT type="button" value="Delete" onclick="return perform('delete');">
	<INPUT type="reset">
</form>
<hr>
<h3><b>Result :</b><%=result%></h3>
</body>
</html>
