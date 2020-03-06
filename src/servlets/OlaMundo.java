package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OlaMundo
 */
@WebServlet({ "/OlaMundo", "/ola" })
public class OlaMundo extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public OlaMundo() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("\t\tPagina inicial do primeiro projeto DOCKER:\n\n\t\t\tOLA MUNDO ");
	}

}
