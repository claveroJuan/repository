package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import speedsocket.core.Persona;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String nombre = (String) request.getParameter("nombre_usuario");
			String pass = (String) request.getParameter("password");

			if (nombre.equals("jmaldonado") && pass.equals("1234567890")) {
				HttpSession session = request.getSession();
				session.setAttribute("USUARIO", new Persona(nombre, pass));
				response.sendRedirect("app");
			} else {
				response.sendRedirect("index.html");
			}
		} catch (Exception e) {
			response.sendRedirect("index.html");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
