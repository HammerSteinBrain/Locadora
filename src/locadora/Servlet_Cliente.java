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
		
		Veiculos v = new Veiculos();
		
		Controller_Veiculos con = new Controller_Veiculos();
		
		if (request.getParameter("volvo") != null) {
			v.setNome_cliente("usuario");
			v.setNome_carro("Volvo");
			v.setCategoria("SUV");
			v.setAno("2017");
			v.setModelo("KLO-5485");
			v.setCor("Branco");
			v.setEstado_conservacao("Usado");
			v.setQuilometragem("120.000 km");
			v.setTnq_combustivel("20 Litros");
			
			con.salvar_veiculos(v);
			
		}else if (request.getParameter("camaro") != null) {
			v.setNome_cliente("usuario");
			v.setNome_carro("Camaro");
			v.setCategoria("Popular");
			v.setAno("2017");
			v.setModelo("KYO-5005");
			v.setCor("Prata");
			v.setEstado_conservacao("Usado");
			v.setQuilometragem("100.000 km");
			v.setTnq_combustivel("30 Litros");
			
			con.salvar_veiculos(v);
			
		} else {
			v.setNome_cliente("usuario");
			v.setNome_carro("UNO");
			v.setCategoria("Popular");
			v.setAno("2017");
			v.setModelo("Mile-fire");
			v.setCor("Branco");
			v.setEstado_conservacao("Usado");
			v.setQuilometragem("20.000 km");
			v.setTnq_combustivel("40 Litros");
			
			con.salvar_veiculos(v);
			
		}
		

		
		doGet(request, response);
	}
}
