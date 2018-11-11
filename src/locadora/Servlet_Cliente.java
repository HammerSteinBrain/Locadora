package locadora;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Requests
 */
@WebServlet("/Servlet_Cliente")
public class Servlet_Cliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_Cliente() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public String carro;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Concluido");
		ServletContext sc = request.getServletContext();
        try{
        	sc.getRequestDispatcher("/Home_Cliente.jsp").forward(request,response);            
        }catch (Exception e){
        	System.out.println(e.toString());
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Requests_Cliente_DAO r = new Requests_Cliente_DAO();
		
		if (request.getParameter("volvo") != null) {
			this.carro=request.getParameter("volvo");
			r.adiciona(carro);
		}else if (request.getParameter("camaro") != null) {
			this.carro=request.getParameter("camaro");
			r.adiciona(carro);
		} else {
			this.carro=request.getParameter("uno");
			r.adiciona(carro);
		}
		
		//System.out.println(carro);
		
		doGet(request, response);
	}
}
