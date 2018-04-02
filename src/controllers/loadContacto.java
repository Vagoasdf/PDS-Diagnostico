package controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.orm.PersistentException;

/**
 * Servlet implementation class loadContacto
 */
@WebServlet("/loadContacto")
public class loadContacto extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String page="modificarContacto.jsp";
	String login="index.jsp";
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loadContacto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(request.getParameter("id"));
		orm.Contacto contacto=null;
		try {
			orm.ContactoCriteria lormContactoCriteria = new orm.ContactoCriteria();
			lormContactoCriteria.id.eq(id);
			contacto= lormContactoCriteria.uniqueContacto();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// List dataList= new ArrayList(); Esto es para cuando son mas de una
		 
		 // dataList.add(contacto);
		 request.setAttribute("contacto", contacto);
		response.getWriter().append("Served at: "+id).append(request.getContextPath());
		
		 RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		 

		  if (dispatcher != null){

			  dispatcher.forward(request, response);

		  } 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(request.getParameter("idContacto"));
		
		orm.Contacto contacto=null;
		PrintWriter out=response.getWriter();
		try {
			orm.ContactoCriteria lormContactoCriteria = new orm.ContactoCriteria();
			lormContactoCriteria.id.eq(id);
			contacto= lormContactoCriteria.uniqueContacto();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(request.getParameter("eliminar") != null) {
			try {
				orm.ContactoDAO.delete(contacto);
				out.print(1);
		
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				out.print(0);
			}
			
			
		}else {
			
			String nombre =  request.getParameter("nombre");
			String apellido =  request.getParameter("apellido");
			String fechaNac = request.getParameter("fechaNac");
			String run = request.getParameter("rut");
			String fono = request.getParameter("fono");
			
			String direccion= request.getParameter("direccion");
			String residencia= request.getParameter("residencia");
			String organizacion = request.getParameter("organizacion");
			
			contacto.setNombre(nombre);
			contacto.setApellido(apellido);
			contacto.setRun(run);
			contacto.setFono(fono);
		
			contacto.setResidencia(residencia);
			contacto.setDireccion(direccion);
			contacto.setOrganizacion(organizacion);
			
			try {
				orm.ContactoDAO.save(contacto);
				out.print(1);
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				out.print(0);
			}
		}
		
	}

}
