package controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.criterion.Restrictions;
import org.orm.PersistentException;



import orm.Contacto;

/**
 * Servlet implementation class buscadorControler
 */
@WebServlet("/buscador")
public class buscadorControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String page="verContactos.jsp";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public buscadorControler() {
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
		Contacto[] contactos = null;
		PrintWriter out=response.getWriter();
		if(request.getParameter("avanzada")!=null) {
			contactos=busquedaAvanzada(request);
			out.print("Busqueda Avanzada");
			
		}else {
			contactos=busquedaSimple(request);
			out.print("Busqueda Simple");
		}
		
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		out.println("Contactos:"+contactos.length);
		out.println(contactos[0].getNombre());
		/*
		request.setAttribute("contactos", contactos);
	    response.getWriter().append("Served at: ").append(request.getContextPath());
		
		 RequestDispatcher dispatcher = request.getRequestDispatcher(page);

		  if (dispatcher != null){

			  dispatcher.forward(request, response);

		  } 
		  */
		
	}

	protected Contacto[] busquedaAvanzada(HttpServletRequest request){
		Contacto[] contactos = null;
		orm.ContactoCriteria ormBuscadorSimple = null;
		try {
			ormBuscadorSimple = new orm.ContactoCriteria();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (request.getParameter("nombre")!=null){
			System.out.print("Busco por nombre");
			ormBuscadorSimple.nombre.eq(request.getParameter("nombre"));
		}
		if (request.getParameter("apellido")!=null){

			ormBuscadorSimple.apellido.eq(request.getParameter("apellido"));
		}
		if (request.getParameter("email")!=null){

			ormBuscadorSimple.email.eq(request.getParameter("email"));
		}
		if (request.getParameter("organizacion")!=null){

			ormBuscadorSimple.organizacion.eq(request.getParameter("organizacion"));
		}
		if (request.getParameter("direccion")!=null){

			ormBuscadorSimple.direccion.eq(request.getParameter("direccion"));
		}

		if(request.getParameter("telefono")!=null){
		
			ormBuscadorSimple.fono.eq(request.getParameter("telefono"));
		}
		
		contactos=ormBuscadorSimple.listContacto();
		System.out.println(contactos.toString());
		
		return contactos;	
	}
	
	protected Contacto[] busquedaSimple(HttpServletRequest request) {
		Contacto[] contactos = null;
		orm.ContactoCriteria ormBuscadorSimple = null;
		try {
			ormBuscadorSimple = new orm.ContactoCriteria();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			
		ormBuscadorSimple.add(Restrictions.or(
				Restrictions.eq("nombre",request.getParameter("nombre"))
			));
		
		if (request.getParameter("apellido")!=null){

			ormBuscadorSimple.add(Restrictions.or(
				Restrictions.eq("apellido",request.getParameter("apellido"))
			));
		}
		if (request.getParameter("email")!=null){

			ormBuscadorSimple.add(Restrictions.or(
				Restrictions.eq("email",request.getParameter("email"))
			));
		}
		if (request.getParameter("organizacion")!=null){

			ormBuscadorSimple.add(Restrictions.or(
				Restrictions.eq("organizacion",request.getParameter("organizacion"))
			));
		}
		if (request.getParameter("direccion")!=null){

			ormBuscadorSimple.add(Restrictions.or(
				Restrictions.eq("direccion",request.getParameter("direccion"))
			));
		}
		
		contactos=ormBuscadorSimple.listContacto();
		

	
		
		
		return contactos; 
	}

}
