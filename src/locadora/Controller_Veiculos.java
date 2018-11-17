package locadora;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Controller_Veiculos {
	//define as variaveis para abrir sess�o com o banco
	EntityManagerFactory emf;
	EntityManager em;
	
	
	public Controller_Veiculos(){
		//abre sess�o com o banco de dados
		emf = Persistence.createEntityManagerFactory("reserva_cliente");
		em = emf.createEntityManager();
	}
	
	//define as fun��es do controller
	
	//espera receber como parametro um objeto _Veiculos
	public void salvar_veiculos(Veiculos _Veiculos) {
		em.getTransaction().begin(); //inicia transa��o
		em.merge(_Veiculos);//salva o objeto _Veiculos no banco
		em.getTransaction().commit();//commita no banco as altera��es (realmente salva)
		em.close();//fecha a conex�o com o banco
	}
	
	
}
