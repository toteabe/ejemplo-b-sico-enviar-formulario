package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Persona;

/**
 * Servlet implementation class FormServlet
 */
@WebServlet("/formulario")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Ruta GET /formulario redirige a vista form.jsp
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/form.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Recogida de parámetros enviados desde el formulario
		String nombre = request.getParameter("nombre");
		String apellidos = request.getParameter("apellidos");
		
		//Se instancia el bean de modelo
		Persona persona = new Persona();
		persona.setNombre(nombre);
		persona.setApellidos(apellidos);
		
		//Se establece el objeto para la vista
		request.setAttribute("persona", persona);
		
		
		//Ruta POST /formulario redirige a vista result-form.jsp
		RequestDispatcher dispatcher =  request.getRequestDispatcher("/WEB-INF/jsp/result-form.jsp");
		dispatcher.forward(request, response);
	}

}
