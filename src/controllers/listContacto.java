package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.orm.PersistentException;


/**
 * Servlet implementation class listContacto
 */
@WebServlet("/listContacto")
public class listContacto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	String page="verContactos.jsp";
	String login="index.jsp";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public listContacto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String authId=null;
		/**
		Cookie[] cookies = request.getCookies();
			if(cookies !=null){
				for(Cookie cookie : cookies){
					if(cookie.getName().equals("userID")) authId = cookie.getValue();
				}
			}
		if(authId == null) response.sendRedirect(login);
		else {
		**/
			orm.Contacto[] contactos=null;
			try {
				contactos = orm.ContactoDAO.listContactoByQuery(null, null);
				
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			// List dataList= new ArrayList(); Esto es para cuando son mas de una
			 
			 // dataList.add(contacto);
			
			 request.setAttribute("contactos", contactos);
			 response.getWriter().append("Served at: ").append(request.getContextPath());
			
			 RequestDispatcher dispatcher = request.getRequestDispatcher(page);


			  if (dispatcher != null){

				  dispatcher.forward(request, response);

			  } 
		//}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
