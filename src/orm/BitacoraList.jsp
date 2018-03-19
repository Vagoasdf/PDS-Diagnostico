<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: 
License Type: Evaluation-->
<html>
<head><title>Bitacora List</title>
</head>
<body>
<center>
<h1>Bitacora List</h1>
<table border="1" width="80%">
	<tr>
		<td>Id(PK)</td>
		<td>FechaBitacora</td>
		<td>Titulo</td>
		<td>Detalle</td>
		<td>Id_contacto(FK)</td>
		<td></td>
	</tr>
<%
orm.Bitacora[] bitacoras = orm.BitacoraDAO.listBitacoraByQuery(null, null);
for(int i = 0; i < bitacoras.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(bitacoras[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(bitacoras[i].getFechaBitacora());
		out.println("</td>");
		out.print("<td>");
		out.print(bitacoras[i].getTitulo());
		out.println("</td>");
		out.print("<td>");
		out.print(bitacoras[i].getDetalle());
		out.println("</td>");
		
		orm.Contacto id_contacto = bitacoras[i].getId_contacto();
		if(id_contacto != null) {
			out.print("<td>");
			out.print("<a href=\"Contacto.jsp?action=search&id=");
			out.print(id_contacto.getORMID());
			out.print("\">");
			out.print(id_contacto.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		out.print("<td>");
		out.print("<a href=\"Bitacora.jsp?action=search&id=");
		out.print(bitacoras[i].getORMID());
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
<a href="Bitacora.jsp">Add Bitacora</a>
</center>
</body>
</html>
