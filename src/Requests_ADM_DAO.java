import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Requests_ADM_DAO {
	
	//Variaveis
	Connection conexao;

    public Requests_ADM_DAO() throws ClassNotFoundException{
    	
    	//conexão com o banco do DAO GENERICO
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?"+"user=root&password=root");

            System.out.print("Conexao ok\n");
            
        } catch (SQLException u){
        	throw new RuntimeException(u);
        }
    }
    
    //FUNÇÃO ESPECIFICA PARA A PAGINA _CADASTRAR_RESERVAS.JSP
    public void Cadastrar_Reservas(String codigo_reserva,String nome_cliente,String cpf,String telefone,String hr_ini_reserva,String term_reserva,String vlr_total_prev,String carro){  
        
    	System.out.println(codigo_reserva);
    	
    	String sql = "INSERT INTO reservas(codigo_reserva,nome_cliente,cpf,telefone,hr_ini_reserva,term_reserva,vlr_total_prev,carro)"
        		+ "VALUES(?,?,?,?,?,?,?,?)";  
        try {
        	
        	PreparedStatement stmt = conexao.prepareStatement(sql);//envia a query para a conexao
        	
        	stmt.setString(1, codigo_reserva);  
            stmt.setString(2, nome_cliente);  
            stmt.setString(3, cpf);  
            stmt.setString(4, telefone);  
            stmt.setString(5, hr_ini_reserva);  
            stmt.setString(6, term_reserva); 
            stmt.setString(7, vlr_total_prev);  
            stmt.setString(8, carro);
            
            stmt.execute();  //executa a query
            stmt.close(); //fecha a conexao
            
            System.out.println(carro);
            
        } catch (SQLException u) {  
            throw new RuntimeException(u); 
    	}
    	
    	//System.out.println(codigo_reserva+nome_cliente+cpf+telefone+hr_ini_reserva+term_reserva+vlr_total_prev+carro);
    }
    
    //FUNÇÃO ESPECIFICA PARA A PAGINA _EDITAR_RESERVAS.JSP
    public void Alterar_Reservas(String codigo_reserva,String nome_cliente,String cpf,String telefone,String hr_ini_reserva,String term_reserva,String vlr_total_prev,String carro){  
    	
    	//System.out.println(codigo_reserva);
    	
        String sql = "UPDATE reservas SET nome_cliente=?,cpf=?,telefone=?,hr_ini_reserva=?,term_reserva=?,vlr_total_prev=?,carro=? WHERE codigo_reserva= ? ";
        
        try {
        	
        	PreparedStatement stmt = conexao.prepareStatement(sql);//envia a query para a conexao
        	
            stmt.setString(1, nome_cliente);  
            stmt.setString(2, cpf);  
            stmt.setString(3, telefone);  
            stmt.setString(4, hr_ini_reserva);  
            stmt.setString(5, term_reserva); 
            stmt.setString(6, vlr_total_prev);
            stmt.setString(7, carro); 
            stmt.setString(8, codigo_reserva);
            
            stmt.execute();  //executa a query
            stmt.close(); //fecha a conexao
            
            
        } catch (SQLException u) {  
            throw new RuntimeException(u); 
    	}
    	
    	System.out.println(codigo_reserva+nome_cliente+cpf+telefone+hr_ini_reserva+term_reserva+vlr_total_prev+carro);
    }
    
    //FUNÇÃO ESPECIFICA PARA A PAGINA _REMOVER_RESERVAS.JSP
    public void Deletar_Reservas(String codigo_reserva,String nome_cliente,String cpf,String telefone,String hr_ini_reserva,String term_reserva,String vlr_total_prev,String carro){  
    	
    	//System.out.println(codigo_reserva);
    	
        String sql = "DELETE from reservas where codigo_reserva=?";
        
        try {
        	
        	PreparedStatement stmt = conexao.prepareStatement(sql);//envia a query para a conexao
        	
            stmt.setString(1, codigo_reserva);  
            
            /*stmt.setString(1, nome_cliente);
            stmt.setString(2, cpf);  
            stmt.setString(3, telefone);  
            stmt.setString(4, hr_ini_reserva);  
            stmt.setString(5, term_reserva); 
            stmt.setString(6, vlr_total_prev);
            stmt.setString(7, carro); 
            stmt.setString(8, codigo_reserva);*/
            
            stmt.execute();  //executa a query
            stmt.close(); //fecha a conexao
            
            
        } catch (SQLException u) {  
            throw new RuntimeException(u); 
    	}
    	
    	//System.out.println(codigo_reserva+nome_cliente+cpf+telefone+hr_ini_reserva+term_reserva+vlr_total_prev+carro);
    }
}