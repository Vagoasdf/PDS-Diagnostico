package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.orm.PersistentException;

/**
 * Servlet implementation class loadNotas
 */
@WebServlet("/loadNotas")
public class loadNotas extends HttpServlet {
	private static final long serialVersionUID = 1L;
     String page="notas.jsp";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loadNotas() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		orm.Bitacora[] bitacoras=null;
		try {
			orm.BitacoraCriteria bitacoraCriteria= new orm.BitacoraCriteria();
			bitacoraCriteria.id_contactoId.eq(id);
			bitacoras=orm.BitacoraDAO.listBitacoraByCriteria(bitacoraCriteria);
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// List dataList= new ArrayList(); Esto es para cuando son mas de una
		 
		 // dataList.add(contacto);
		 request.setAttribute("bitacoras", bitacoras);
		 response.getWriter().append("Served at: ").append(request.getContextPath());
		
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
		doGet(request, response);
	}

}
