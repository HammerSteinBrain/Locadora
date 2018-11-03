import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Servlet_ADM
 */
@WebServlet("/Servlet_ADM")
public class Servlet_ADM extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_ADM() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Sucesso");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//System.out.println(request.getParameter("codigo_reserva"));
		
		
		//cria um array list para verificar os parametros, isso serve para verificar a origem da requisição
		//a pagina ou o botão que esta fazendo a requisição e assim direcionar a requisição ao seu DAO correspondente
		ArrayList<String> parameterNames = new ArrayList<String>();
		
		Enumeration enumeration = request.getParameterNames();//enumera os parametros que vem de request.getParameterNames()
		    while (enumeration.hasMoreElements()) {
		        String parameterName = (String) enumeration.nextElement();
		        parameterNames.add(parameterName);
		    }
		
		//System.out.println(parameterNames);
		    
		for (String string : parameterNames) {
			if (string.equals("cadastrar_reservas")) {
				System.out.println("cadastrar reservas");
			}
		}
		
		
		//doGet(request, response);
	}

}
