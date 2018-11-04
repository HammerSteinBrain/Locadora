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

    Requests_ADM_DAO adm;
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Concluido");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//System.out.println(request.getParameter("codigo_reserva"));
		
		//cria um array list para verificar os parametros, isso serve para verificar a origem da requisi��o
		//a pagina ou o bot�o que esta fazendo a requisi��o e assim direcionar a requisi��o ao seu DAO correspondente
		ArrayList<String> parameterNames = new ArrayList<String>();
		
		Enumeration<String> enumeration = request.getParameterNames();//enumera os parametros que vem de request.getParameterNames()
		while (enumeration.hasMoreElements()) {
			String parameterName = (String) enumeration.nextElement();
			parameterNames.add(parameterName);
		}
		
		//System.out.println(parameterNames);
		
		try {
			adm = new Requests_ADM_DAO();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//-----------------DIRECIONAMENTO PARA O DAO CORRESPONDENTE--------------------------------------------------------
		for (String string : parameterNames) {//procura parametro por parametro dentro de string
			
			//System.out.println(string);
			
			//caso o name do bot�o que esta fazendo a requisi��o seja "cadastrar_reservas" ele ira executar o script especifico
			//para essa requisi��o
			if (string.equals("cadastrar_reservas")) {
				//System.out.println("cadastrar reservas");
				
				//envia para o Requests_ADM_DAO os parametros que v�o ser gravados no banco
				adm.Cadastrar_Reservas(
						request.getParameter("codigo_reserva"),
						request.getParameter("nome_cliente"),
						request.getParameter("cpf"),
						request.getParameter("telefone"),
						request.getParameter("hr_ini_reserva"),
						request.getParameter("term_reserva"),
						request.getParameter("vlr_total_prev"),
						request.getParameter("carro"));
				break;
			}
			if (string.equals("editar_reservas")) {
				//System.out.println("editar reservas");
				//System.out.println(request.getParameter("codigo_reserva"));
				
				
				//caso o bot�o do request tenha como valor o "editar_reserva" ser� acionada a funcao abaixo
				
				//envia para o Requests_ADM_DAO os parametros que v�o ser ALTERADOs no banco
				adm.Alterar_Reservas(
						request.getParameter("codigo_reserva"),
						request.getParameter("nome_cliente"),
						request.getParameter("cpf"),
						request.getParameter("telefone"),
						request.getParameter("hr_ini_reserva"),
						request.getParameter("term_reserva"),
						request.getParameter("vlr_total_prev"),
						request.getParameter("carro"));
				break;
			}
			if (string.equals("deletar_reservas")) {
				System.out.println("deletar reservas");
				System.out.println(request.getParameter("codigo_reserva"));
				
				
				//caso o bot�o do request tenha como valor o "deletar_reservas" ser� acionada a funcao abaixo
				
				//envia para o Requests_ADM_DAO os parametros que v�o ser DELETADOS no banco
				adm.Deletar_Reservas(
						request.getParameter("codigo_reserva"),
						request.getParameter("nome_cliente"),
						request.getParameter("cpf"),
						request.getParameter("telefone"),
						request.getParameter("hr_ini_reserva"),
						request.getParameter("term_reserva"),
						request.getParameter("vlr_total_prev"),
						request.getParameter("carro"));
				break;
			}
		}
		
		
		doGet(request, response);
	}

}
