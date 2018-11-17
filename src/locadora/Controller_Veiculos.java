package locadora;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Controller_Veiculos {
	//define as variaveis para abrir sessão com o banco
	EntityManagerFactory emf;
	EntityManager em;
	
	
	public Controller_Veiculos(){
		//abre sessão com o banco de dados
		emf = Persistence.createEntityManagerFactory("reserva_cliente");
		em = emf.createEntityManager();
	}
	
	//define as funções do controller
	
	//espera receber como parametro um objeto _Veiculos
	public void salvar_veiculos(Veiculos _Veiculos) {
		em.getTransaction().begin(); //inicia transação
		em.merge(_Veiculos);//salva o objeto _Veiculos no banco
		em.getTransaction().commit();//commita no banco as alterações (realmente salva)
		em.close();//fecha a conexão com o banco
	}
	
	
}
