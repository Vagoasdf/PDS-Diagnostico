package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.orm.PersistentException;

/**
 * Servlet implementation class crearNotas
 */
@WebServlet("/crearNotas")
public class crearNotas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       String page="crearNota.jsp";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public crearNotas() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
	 * @return 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String titulo =  request.getParameter("titulo");
		String detalle =  request.getParameter("detalle");
		int id=Integer.parseInt(request.getParameter("id"));
		PrintWriter out=response.getWriter();
		orm.Contacto contacto=null;
		try {
			orm.ContactoCriteria lormContactoCriteria = new orm.ContactoCriteria();
			lormContactoCriteria.id.eq(id);
			contacto= lormContactoCriteria.uniqueContacto();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		orm.Bitacora nBitacora = orm.BitacoraDAO.createBitacora();
		Date today = new Date(); 
		nBitacora.setORM_Id_contacto(contacto);
		nBitacora.setTitulo(titulo);
		nBitacora.setDetalle(detalle);
		nBitacora.setFechaBitacora(today);
		try {
			orm.BitacoraDAO.save(nBitacora);
			out.print(1);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			out.print(0);
		}
		
		
		
	}

}
