import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Requests_Cliente_DAO {
	
	Connection conexao;

    public Requests_Cliente_DAO(){
    	
    	//conexão com o banco do DAO GENERICO
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?"+"user=root&password=root");

            System.out.print("Conexao ok\n");
            
        } catch (Exception e){
            System.out.print("Erro de conexao LoginDAO "+e.toString());
        }
    }
    
    public void adiciona(String carro){  
        String sql = "INSERT INTO carro_reservado(nome_cliente,nome_carro,categoria,ano,placa,modelo,cor,estado_conservacao,quilometragem,tanque_de_combustivel)"
        		+ "VALUES(?,?,?,?,?,?,?,?,?,?)";  
        try {
        	
        	PreparedStatement stmt = conexao.prepareStatement(sql);//envia a query para a conexao
        	
            if (carro.equals("volvo")) {
            	stmt.setString(1, "usuario");  
                stmt.setString(2, "Volvo");  
                stmt.setString(3, "SUV");  
                stmt.setString(4, "2017");  
                stmt.setString(5, "KLO-5485");  
                stmt.setString(6, "Generic-for-this-trab"); 
                stmt.setString(7, "Branco");  
                stmt.setString(8, "Usado");
                stmt.setString(9, "120.000");
                stmt.setString(10, "20 Litros restantes");
            
            } else if(carro.equals("camaro")){
				stmt.setString(1, "usuario");  
                stmt.setString(2, "Camaro");  
                stmt.setString(3, "popular");  
                stmt.setString(4, "2017");  
                stmt.setString(5, "KYO-5005");  
                stmt.setString(6, "Generic-for-this-trab"); 
                stmt.setString(7, "Prata");  
                stmt.setString(8, "Usado");
                stmt.setString(9, "100.000");
                stmt.setString(10, "30 Litros restantes");  
			} else {
				stmt.setString(1, "usuario");  
                stmt.setString(2, "UNO");  
                stmt.setString(3, "popular");  
                stmt.setString(4, "2017");  
                stmt.setString(5, "TRB-1324");  
                stmt.setString(6, "Mile Fire"); 
                stmt.setString(7, "Branco");  
                stmt.setString(8, "Usado");
                stmt.setString(9, "20.000");
                stmt.setString(10, "40 Litros restantes");   
			}
            
            stmt.execute();  //executa a query
            stmt.close(); //fecha a conexao
            
            System.out.println(carro);
            
        } catch (SQLException u) {  
            throw new RuntimeException(u);  
    }  
} 
	
}