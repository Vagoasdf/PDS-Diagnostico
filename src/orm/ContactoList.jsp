<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<head><title>Contacto List</title>
</head>
<body>
<center>
<h1>Contacto List</h1>
<table border="1" width="80%">
	<tr>
		<td>Id(PK)</td>
		<td>Fono</td>
		<td>Run</td>
		<td>FechaNacimiento</td>
		<td>Nombre</td>
		<td>Apellido</td>
		<td>FotoAvatar</td>
		<td>Direccion</td>
		<td>Email</td>
		<td>Residencia</td>
		<td>Organizacion</td>
		<td></td>
	</tr>
<%
orm.Contacto[] contactos = orm.ContactoDAO.listContactoByQuery(null, null);
for(int i = 0; i < contactos.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(contactos[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(contactos[i].getFono());
		out.println("</td>");
		out.print("<td>");
		out.print(contactos[i].getRun());
		out.println("</td>");
		out.print("<td>");
		out.print(contactos[i].getFechaNacimiento());
		out.println("</td>");
		out.print("<td>");
		out.print(contactos[i].getNombre());
		out.println("</td>");
		out.print("<td>");
		out.print(contactos[i].getApellido());
		out.println("</td>");
		out.print("<td>");
		out.print(contactos[i].getFotoAvatar());
		out.println("</td>");
		out.print("<td>");
		out.print(contactos[i].getDireccion());
		out.println("</td>");
		out.print("<td>");
		out.print(contactos[i].getEmail());
		out.println("</td>");
		out.print("<td>");
		out.print(contactos[i].getResidencia());
		out.println("</td>");
		out.print("<td>");
		out.print(contactos[i].getOrganizacion());
		out.println("</td>");
		out.print("<td>");
		out.print("<a href=\"Contacto.jsp?action=search&id=");
		out.print(contactos[i].getORMID());
		out.print("\">");
		out.print("Edit");
		out.print("</a>");
		out.print("</td>");
		out.println("</td>");
		out.println("</tr>");
}

%>
</table><br>
<a href="index.html">Index page</a>
 | 
<a href="Contacto.jsp">Add Contacto</a>
</center>
</body>
</html>
