package controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.orm.PersistentException;

/**
 * Servlet implementation class editNota
 */
@WebServlet("/editNota")
public class editNota extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editNota() {
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
		int id=Integer.parseInt(request.getParameter("idNota"));
		PrintWriter out=response.getWriter();
		orm.Bitacora bitacora=null;
		try {
			orm.BitacoraCriteria lormContactoCriteria = new orm.BitacoraCriteria();
			lormContactoCriteria.id.eq(id);
			bitacora= lormContactoCriteria.uniqueBitacora();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(request.getParameter("eliminar") != null) {
			try {
				orm.BitacoraDAO.delete(bitacora);
				out.print(1);
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				out.print(0);
				e.printStackTrace();
			}
			
			
		}else {
			
			String titulo = request.getParameter("titulo");
			String detalle = request.getParameter("detalle");
			
			bitacora.setTitulo(titulo);
			bitacora.setDetalle(detalle);
			try {
				orm.BitacoraDAO.save(bitacora);
				out.print(1);
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				out.print(0);
			}
		
		}
		
	}

}
