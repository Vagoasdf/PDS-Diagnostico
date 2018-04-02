package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.orm.PersistentException;

import orm.Usuario;
import orm.UsuarioCriteria;
import orm.UsuarioDAO;


/**
 * Servlet implementation class MainController
 */
@WebServlet(name = "LoginController", description = "Controlador del Login", urlPatterns = { "/LoginController" })
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String password = (String) request.getAttribute("password");
		String username = (String) request.getAttribute("username");
		PrintWriter out=response.getWriter();
	
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Enumeration<String> params=  request.getParameterNames();
		
		
		String password =  request.getParameter("password");
		String username =  request.getParameter("username");

		
		PrintWriter out=response.getWriter();
		if( username != null && password != null) {
			orm.UsuarioCriteria ormUsuarioLogin = null;
			
			try {
				ormUsuarioLogin = new orm.UsuarioCriteria();
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ormUsuarioLogin.username.eq(username);
			ormUsuarioLogin.password.eq(password);
			orm.Usuario auth=ormUsuarioLogin.uniqueUsuario();
			if(auth==null) {
				Cookie loginCookie = new Cookie("userID", ""+auth.getId());
				//setting cookie to expiry in 30 mins
				loginCookie.setMaxAge(30*60);
				response.addCookie(loginCookie);
				response.sendRedirect("listContacto");
				out.print(0);
			}else {
				out.print(1);
			}
			
		}
		
		//doGet(request, response);
	}

}
