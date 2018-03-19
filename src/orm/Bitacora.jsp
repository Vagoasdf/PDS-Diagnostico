<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<jsp:useBean id="BitacoraBean" scope="page" class="orm.BitacoraProcessor" />
<jsp:setProperty name="BitacoraBean" property="*" />
<% String result = BitacoraBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'BitacoraList.jsp';
		return true;
	}
// -->
</script>
<head><title>Bitacora</title>
</head>
<body>
<h1>Bitacora</h1>
<form method="POST" name="form1" action=Bitacora.jsp>
	<table>
		<tr>
			<td>*Id : </td>
			<td><input type=text name="id" value="<jsp:getProperty name="BitacoraBean" property="id"/>" /></td>
		</tr>
		<tr>
			<td>FechaBitacora : </td>
			<td><input type=text name="fechaBitacora" value="<jsp:getProperty name="BitacoraBean" property="fechaBitacora"/>" /></td>
		</tr>
		<tr>
			<td>Titulo : </td>
			<td><input type=text name="titulo" value="<jsp:getProperty name="BitacoraBean" property="titulo"/>" /></td>
		</tr>
		<tr>
			<td>Detalle : </td>
			<td><input type=text name="detalle" value="<jsp:getProperty name="BitacoraBean" property="detalle"/>" /></td>
		</tr>
		<tr>
			<td>Id_contacto_contactoid : </td>
			<td><input type=text name="id_contacto_contactoid" value="<jsp:getProperty name="BitacoraBean" property="id_contacto_contactoid"/>" /></td>
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
