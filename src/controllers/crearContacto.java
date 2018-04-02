package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.orm.PersistentException;

/**
 * Servlet implementation class crearContacto
 */
@WebServlet("/crearContacto")
public class crearContacto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public crearContacto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre =  request.getParameter("nombre");
		String apellido =  request.getParameter("apellido");
		String fechaNac = request.getParameter("fechaNac");
		String run = request.getParameter("rut");
		String fono = request.getParameter("fono");
		String fotoAvatar = request.getParameter("fotoAvatar"); 
		

		PrintWriter out=response.getWriter();
		orm.Contacto lormContacto = orm.ContactoDAO.createContacto();
		// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving :
		//bitacora, fotoAvatar, apellido, nombre, fechaNacimiento, run, fono
		lormContacto.setApellido(apellido);
		lormContacto.setNombre(nombre);
		lormContacto.setFechaNacimiento(new Date());
		lormContacto.setRun(run);
		lormContacto.setFono(fono);
		lormContacto.setFotoAvatar("test.jpg");
		lormContacto.setDireccion(request.getParameter("direccion"));
		lormContacto.setResidencia(request.getParameter("residencia"));
		lormContacto.setOrganizacion(request.getParameter("organizacion"));
		lormContacto.setEmail(request.getParameter("email"));
		try {
			orm.ContactoDAO.save(lormContacto);
			out.print(1);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			out.print(0);
		}
		
		
	}

}
