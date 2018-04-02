<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<head><title>Usuario List</title>
</head>
<body>
<center>
<h1>Usuario List</h1>
<table border="1" width="80%">
	<tr>
		<td>Id(PK)</td>
		<td>Username</td>
		<td>Nombre</td>
		<td>Password</td>
		<td></td>
	</tr>
<%
orm.Usuario[] usuarios = orm.UsuarioDAO.listUsuarioByQuery(null, null);
for(int i = 0; i < usuarios.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(usuarios[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(usuarios[i].getUsername());
		out.println("</td>");
		out.print("<td>");
		out.print(usuarios[i].getNombre());
		out.println("</td>");
		out.print("<td>");
		out.print(usuarios[i].getPassword());
		out.println("</td>");
		out.print("<td>");
		out.print("<a href=\"Usuario.jsp?action=search&id=");
		out.print(usuarios[i].getORMID());
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
<a href="Usuario.jsp">Add Usuario</a>
</center>
</body>
</html>
