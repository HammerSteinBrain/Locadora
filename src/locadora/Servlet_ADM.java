package locadora;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.ServletContext;
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
    
    //VARIAVEIS GLOBAIS
    String[] vetorzinho = null;
    Requests_ADM_DAO adm;
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext sc = request.getServletContext();
        try{
        	sc.getRequestDispatcher("/Home_adm.jsp").forward(request,response);            
        }catch (Exception e){
        	System.out.println(e.toString());
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//System.out.println(request.getParameter("codigo_reserva"));
		
		//cria um array list para verificar os parametros, isso serve para verificar a origem da requisição
		//a pagina ou o botão que esta fazendo a requisição e assim direcionar a requisição ao seu DAO correspondente
		ArrayList<String> parameterNames = new ArrayList<String>();
		
		Enumeration<String> enumeration = request.getParameterNames();//enumera os parametros que vem de request.getParameterNames()
		while (enumeration.hasMoreElements()) {
			String parameterName = enumeration.nextElement();
			parameterNames.add(parameterName);
		}
		
		//System.out.println(parameterNames);
		
		try {
			adm = new Requests_ADM_DAO();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//-----------------DIRECIONAMENTO PARA O DAO CORRESPONDENTE--------------------------------------------------------
		for (String parametro : parameterNames) {//procura parametro por parametro dentro de string
			
			//System.out.println(string);
			
			//caso o name do botão que esta fazendo a requisição seja "cadastrar_reservas" ele ira executar o script especifico
			//para essa requisição
			if (parametro.equals("cadastrar_reservas")) {
				//System.out.println("cadastrar reservas");
				
				//envia para o Requests_ADM_DAO os parametros que vão ser gravados no banco
				adm.Cadastrar_Reservas(
						request.getParameter("codigo_reserva"),
						request.getParameter("nome_cliente"),
						request.getParameter("cpf"),
						request.getParameter("telefone"),
						request.getParameter("hr_ini_reserva"),
						request.getParameter("term_reserva"),
						request.getParameter("vlr_total_prev"),
						request.getParameter("carro")
						);
				break;
			}
			
			if (parametro.equals("cadastrar_veiculos")) {
				System.out.println("cadastrar_veiculos");
				
				//envia para o Requests_ADM_DAO os parametros que vão ser gravados no banco
				adm.Cadastrar_Veiculos(
						request.getParameter("codigo_veiculo"),
						request.getParameter("nome_veiculo"),
						request.getParameter("categoria"),
						request.getParameter("ano"),
						request.getParameter("modelo"),
						request.getParameter("fabricante"),
						request.getParameter("cor"),
						request.getParameter("estado_conservacao"),
						request.getParameter("quilometragem"),
						request.getParameter("tnq_combustivel")
						);
				break;
			}
			
			if (parametro.equals("editar_reservas")) {
				//System.out.println("editar reservas");
				//System.out.println(request.getParameter("codigo_reserva"));
				
				
				//caso o botão do request tenha como valor o "editar_reserva" será acionada a funcao abaixo
				
				//envia para o Requests_ADM_DAO os parametros que vão ser ALTERADOs no banco
				adm.Alterar_Reservas(
						request.getParameter("codigo_reserva"),
						request.getParameter("nome_cliente"),
						request.getParameter("cpf"),
						request.getParameter("telefone"),
						request.getParameter("hr_ini_reserva"),
						request.getParameter("term_reserva"),
						request.getParameter("vlr_total_prev"),
						request.getParameter("carro")
						);
				break;
			}
			if (parametro.equals("deletar_reservas")) {
				System.out.println("deletar reservas");
				System.out.println(request.getParameter("codigo_reserva"));
				
				
				//caso o botão do request tenha como valor o "deletar_reservas" será acionada a funcao abaixo
				
				//envia para o Requests_ADM_DAO os parametros que vão ser DELETADOS no banco
				adm.Deletar_Reservas(
						request.getParameter("codigo_reserva"),
						request.getParameter("nome_cliente"),
						request.getParameter("cpf"),
						request.getParameter("telefone"),
						request.getParameter("hr_ini_reserva"),
						request.getParameter("term_reserva"),
						request.getParameter("vlr_total_prev"),
						request.getParameter("carro")
						);
				break;
			}
			if (parametro.equals("gerar_contrato")) {
				System.out.println("gerar_contratos");
				
				//envia para o Requests_ADM_DAO os parametros que vão ser gravados no banco
				adm.Cadastrar_Contrato(
						request.getParameter("codigo_contrato"),
						request.getParameter("nome_cliente"),
						request.getParameter("cpf"),
						request.getParameter("telefone"),
						request.getParameter("carro"),
						request.getParameter("hr_retirada"),
						request.getParameter("hr_devolucao"),
						request.getParameter("vlr_total_res"),
						request.getParameter("vl_pgto_antec"),
						request.getParameter("vl_pgto_devolucao")
						);
				break;
			}
			
			//_Receber_carro_alugado.jsp
			if (parametro.equals("proc_codigo")) {
				System.out.println("proc_codigo");
				
				//envia para o Requests_ADM_DAO os parametros que vão ser procurados no banco
				//System.out.println(adm.Procurar_Contrato(request.getParameter("codigo_contrato")));
				
				this.vetorzinho = adm.Procurar_Contrato(request.getParameter("codigo_contrato"));
				
				/*for (String item : vetorzinho) {
					System.out.println(item);
				}*/
				
				
				//RETORNANDO VALORES PARA A PAGINA JSP _Receber_carro_alugado.jsp
				request.setAttribute("codigo_contrato", vetorzinho[0]);
				request.setAttribute("nome_cliente", vetorzinho[1]);
				request.setAttribute("cpf", vetorzinho[2]);
				request.setAttribute("telefone", vetorzinho[3]);
				request.setAttribute("hr_ini_reserva", "08:00");
				request.setAttribute("carro", vetorzinho[4]);
				request.setAttribute("status_conser_veiculo", "usado");
				request.getRequestDispatcher("/_Receber_carro_alugado.jsp"). forward (request, response);
				
				break;
			}
			
			//_Receber_carro_alugado.jsp
			if (parametro.equals("reg_retorno")) {
				//System.out.println("reg_retorno");
				
				//System.out.println(request.getParameter("codigo_contrato"));
				
				//envia para o Requests_ADM_DAO os parametros que vão ser gravados no banco
				adm.Cadastrar_Retorno(
						request.getParameter("codigo_contrato"),
						request.getParameter("nome_cliente"),
						request.getParameter("cpf"),
						request.getParameter("telefone"),
						request.getParameter("hr_ini_reserva"),
						request.getParameter("carro"),
						request.getParameter("status_conser_veiculo")
						);
				break;
			}
			
			//_Editar_reservas
			if(parametro.equals("proc_reserva")) {
				this.vetorzinho = adm.Procurar_Reserva(request.getParameter("codigo_reserva"));
				
				/*for (String item : vetorzinho) {
					System.out.println(item);
				}*/
				
				//RETORNANDO VALORES PARA A PAGINA JSP _Receber_carro_alugado.jsp
				request.setAttribute("codigo_reserva", vetorzinho[0]);
				request.setAttribute("nome_cliente", vetorzinho[1]);
				request.setAttribute("cpf", vetorzinho[2]);
				request.setAttribute("telefone", vetorzinho[3]);
				request.setAttribute("hr_ini_reserva", vetorzinho[4]);
				request.setAttribute("term_reserva", vetorzinho[5]);
				request.setAttribute("vlr_total_prev", vetorzinho[6]);
				request.setAttribute("carro", vetorzinho[7]);
				request.getRequestDispatcher("/_Editar_Reservas.jsp"). forward (request, response);
				
				
				break;
			}
			//_Deletar_reservas
			if(parametro.equals("proc_reserva_del")) {
				this.vetorzinho = adm.Procurar_Reserva(request.getParameter("codigo_reserva"));
				
				/*for (String item : vetorzinho) {
					System.out.println(item);
				}*/
				
				//RETORNANDO VALORES PARA A PAGINA JSP _Receber_carro_alugado.jsp
				request.setAttribute("codigo_reserva", vetorzinho[0]);
				request.setAttribute("nome_cliente", vetorzinho[1]);
				request.setAttribute("cpf", vetorzinho[2]);
				request.setAttribute("telefone", vetorzinho[3]);
				request.setAttribute("hr_ini_reserva", vetorzinho[4]);
				request.setAttribute("term_reserva", vetorzinho[5]);
				request.setAttribute("vlr_total_prev", vetorzinho[6]);
				request.setAttribute("carro", vetorzinho[7]);
				request.getRequestDispatcher("/_Remover_Reservas.jsp"). forward (request, response);
				
				
				break;
			}
			
			//RETORNANDO VALORES PARA A PAGINA JSP _Alugar_Carro_Reservado.jsp
			if(parametro.equals("proc_cod_cr")) {
				this.vetorzinho = adm.Procurar_Reserva(request.getParameter("codigo_contrato"));
				
				/*for (String item : vetorzinho) {
					System.out.println(item);
				}*/
				
				request.setAttribute("codigo_contrato", vetorzinho[0]);
				request.setAttribute("nome_cliente", vetorzinho[1]);
				request.setAttribute("cpf", vetorzinho[2]);
				request.setAttribute("telefone", vetorzinho[3]);
				request.getRequestDispatcher("/_Alugar_Carro_Reservado.jsp"). forward (request, response);
					
				break;
			}
		}
		
		doGet(request, response);
	}
}
