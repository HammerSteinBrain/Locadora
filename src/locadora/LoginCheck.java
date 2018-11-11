package locadora;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginCheck
 */
@WebServlet("/LoginCheck")
public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginCheck() {//construtor padr�o
        super();
    }
    
    //declara��o das variaveis q v�o receber as variaveis q est�o vindo como parametro das requisi��es abaixo
    private String uname;
	private String password;
  
    public String[] vetor = null;//vetorzinho para trabalhar o retorno da query feita la no DAO
    
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    //metodo caso haja uma requisi��o do tipo get, e n�o usei ela pq eu n tenho req do tipo get
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	//usei o post, pq o form login la da tela INDEX.JSP � do tipo post
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		this.uname=request.getParameter("uname");//parametro uname sendo salvo na variavel dessa classe uname
		
		this.password=request.getParameter("password");//parametro password sendo salvo na variavel dessa classe password
		
		LoginDAO login = new LoginDAO(uname);//instancia e envio da variavel dessa classe uname la pra classe DAO
		
		
		//System.out.println(l.procurar_id()[0]); //teste com funcao q retorna um vetor
		
		this.vetor= login.procurar_id();//armazena o retorno da funcao que � um vetor no vetor local
		
		/*for (int j = 0; j < vetor.length; j++) {
			System.out.println(vetor[j]);
		}*/
		
		//compara��es da variavel uname(contem o retorno do doPOST) com o vetor (contem o retorno do banco de dados)
		if (uname.equals(vetor[1]) && password.equals(vetor[2]) && (vetor[3].equals("1"))){
			response.sendRedirect("Home_adm.jsp");
			//direciona para o jsp adm caso o vetor[3] seja igual a 1
		}
		else if(uname.equals(vetor[1]) && password.equals(vetor[2]) && (vetor[3].equals("0"))){
			response.sendRedirect("Home_Cliente.jsp");
			//direciona para o jsp cliente caso o vetor[3] seja igual a 0
		}
		else{
			response.sendRedirect("error.jsp");
			//erro de autenticacao
		}

	}
	
}
