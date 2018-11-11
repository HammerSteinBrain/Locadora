package locadora;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Requests_ADM_DAO {
	
	//Variaveis
	Connection conexao;

    public Requests_ADM_DAO() throws ClassNotFoundException{
    	
    	//conexão com o banco do DAO GENERICO
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?"+"user=root&password=root");

            System.out.print("Conexao ok DAO ADM e Banco de dados\n");
            
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
    
  //FUNÇÃO ESPECIFICA PARA A PAGINA _CADASTRAR_Veiculos.JSP
    public void Cadastrar_Veiculos(
    		String codigo_veiculo,
    		String nome_veiculo,
    		String categoria,
    		String ano,
    		String modelo,
    		String fabricante,
    		String cor,
    		String estado_conservacao,
    		String quilometragem,
    		String tnq_combustivel
    		){
        
    	System.out.println(codigo_veiculo);
    	
    	String sql = "INSERT INTO veiculos(codigo_veiculo,nome_veiculo,categoria,ano,modelo,fabricante,cor,estado_conservacao,quilometragem,tnq_combustivel)"
        		+ "VALUES(?,?,?,?,?,?,?,?,?,?)";  
        try {
        	
        	PreparedStatement stmt = conexao.prepareStatement(sql);//envia a query para a conexao
        	
        	stmt.setString(1, codigo_veiculo);  
            stmt.setString(2, nome_veiculo);  
            stmt.setString(3, categoria);  
            stmt.setString(4, ano);  
            stmt.setString(5, modelo);  
            stmt.setString(6, fabricante); 
            stmt.setString(7, cor);  
            stmt.setString(8, estado_conservacao);
            stmt.setString(9, quilometragem);
            stmt.setString(10, tnq_combustivel);
            
            stmt.execute();  //executa a query
            stmt.close(); //fecha a conexao
            
        } catch (SQLException u) {  
            throw new RuntimeException(u); 
    	}
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
    
    //FUNÇÃO ESPECIFICA PARA A PAGINA _ALUGAR_CARRO_RESERVADO.JSP
    public void Cadastrar_Contrato(
    		String codigo_contrato,
    		String nome_cliente,
    		String cpf,
    		String telefone,
    		String carro,
    		String hr_retirada,
    		String hr_devolucao,
    		String vlr_total_res,
    		String vl_pgto_antec,
    		String vl_pgto_devolucao
    		){  
        
    	System.out.println(codigo_contrato);
    	
    	String sql = "INSERT INTO contratos(codigo_contrato,nome_cliente,cpf,telefone,carro,hr_retirada,hr_devolucao,vlr_total_res,vl_pgto_antec,vl_pgto_devolucao)"
        		+ "VALUES(?,?,?,?,?,?,?,?,?,?)";  
        try {
        	
        	PreparedStatement stmt = conexao.prepareStatement(sql);//envia a query para a conexao
        	
        	stmt.setString(1, codigo_contrato);  
            stmt.setString(2, nome_cliente);  
            stmt.setString(3, cpf);  
            stmt.setString(4, telefone);  
            stmt.setString(5, carro);  
            stmt.setString(6, hr_retirada); 
            stmt.setString(7, hr_devolucao);  
            stmt.setString(8, vlr_total_res);
            stmt.setString(9, vl_pgto_antec);
            stmt.setString(10, vl_pgto_devolucao);
            
            stmt.execute();  //executa a query
            stmt.close(); //fecha a conexao
            
            
        } catch (SQLException u) {  
            throw new RuntimeException(u); 
    	}
    }
    
    //FUNÇÃO ESPECIFICA PARA A PAGINA _RECEBER_CARRO_ALUGADO.JSP
    public String[] Procurar_Contrato(String codigo_contrato){  
    	try{
            PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM login.contratos where codigo_contrato = ?");
            
            //sql query
            stmt.setString(1, codigo_contrato);//substitui o 1° ? pela variavel
            
            ResultSet rs = stmt.executeQuery();
            
            System.out.println("Conectei a tabela contratos");
            
            //System.out.println(rs.next()); //se for testar o rs.next() com o print, deixar apenas um se n da erro
            
            /*for (int i = 1; i <= 10; i++) {
            	System.out.println(rs.getString(i));
			}*/
            
            //System.out.println(rs.getString(2));
            
            
            String consulta[] = new String[10];
            
            if (rs.next()==true) { // SÓ PODE CHAMAR O RS.NEXT() UMA VEZ!!!!!!!!!!!!!!!!!!!!!!!
            	//copula os setores do vetor consulta com o parametro corresposnte ao retorn sql
            	consulta[0] = rs.getString(1);
    	        consulta[1] = rs.getString(2);
    	        consulta[2] = rs.getString(3);
    	        consulta[3] = rs.getString(4);
    	        consulta[4] = rs.getString(5);
    	        consulta[5] = rs.getString(6);
    	        consulta[6] = rs.getString(7);
    	        consulta[7] = rs.getString(8);
    	        consulta[8] = rs.getString(9);
    	        consulta[9] = rs.getString(10);
    	        
			} else {// caso o rs.next() for false, ou seja, a consulta sql não restornou positivo, copula os setores com nada
				consulta[0] = "";
    	        consulta[1] = "";
    	        consulta[2] = "";
    	        consulta[3] = "";
    	        consulta[4] = "";
    	        consulta[5] = "";
    	        consulta[6] = "";
    	        consulta[7] = "";
    	        consulta[8] = "";
    	        consulta[9] = "";
			}

            /* Fechando conexão */
            
            stmt.close();
            rs.close();
            
            //conexao.close();
            
			return consulta;// retorna o vetor carregado com os resultados da busca sql ou vazio
        }           
        catch (Exception e)
        {
          System.out.print("\nErro de conexao ADM DAO...\n" + e.toString());
        }
        return null;
    }
    
  //FUNÇÃO ESPECIFICA PARA A PAGINA _RECEBER_CARRO_ALUGADO.JSP
    public void Cadastrar_Retorno(
    		String codigo_retorno,
    		String nome_cliente,
    		String cpf,
    		String telefone,
    		String hr_ini_reserva,
    		String carro,
    		String status_conser_veiculo
    		){  
        
    	//System.out.println(codigo_retorno);
    	
    	String sql = "INSERT INTO retornos(codigo_retorno,nome_cliente,cpf,telefone,hr_ini_reserva,carro,status_conser_veiculo)"
        		+ "VALUES(?,?,?,?,?,?,?)";  
        try {
        	
        	PreparedStatement stmt = conexao.prepareStatement(sql);//envia a query para a conexao
        	
        	stmt.setString(1, codigo_retorno);  
            stmt.setString(2, nome_cliente);  
            stmt.setString(3, cpf);  
            stmt.setString(4, telefone);  
            stmt.setString(5, hr_ini_reserva);  
            stmt.setString(6, carro); 
            stmt.setString(7, status_conser_veiculo);
            
            stmt.execute();  //executa a query
            stmt.close(); //fecha a conexao
            
            
        } catch (SQLException u) {  
            throw new RuntimeException(u); 
    	}
    }
    
    //FUNÇÃO ESPECIFICA PARA A PAGINA _EDITAR RESERVAS
    public String[] Procurar_Reserva(String codigo_reserva){  
    	try{
            PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM login.reservas where codigo_reserva = ?");
            
            //sql query
            stmt.setString(1, codigo_reserva);//substitui o 1° ? pela variavel
            
            ResultSet rs = stmt.executeQuery();
            
            System.out.println("Conectei a tabela reservas");
            
            //System.out.println(rs.next()); //se for testar o rs.next() com o print, deixar apenas um se n da erro
            
            /*for (int i = 1; i <= 10; i++) {
            	System.out.println(rs.getString(i));
			}*/
            
            //System.out.println(rs.getString(2));
            
            
            String consulta[] = new String[8];
            
            if (rs.next()==true) { // SÓ PODE CHAMAR O RS.NEXT() UMA VEZ!!!!!!!!!!!!!!!!!!!!!!!
            	//copula os setores do vetor consulta com o parametro corresposnte ao retorn sql
            	consulta[0] = rs.getString(1);
    	        consulta[1] = rs.getString(2);
    	        consulta[2] = rs.getString(3);
    	        consulta[3] = rs.getString(4);
    	        consulta[4] = rs.getString(5);
    	        consulta[5] = rs.getString(6);
    	        consulta[6] = rs.getString(7);
    	        consulta[7] = rs.getString(8);
    	        
			} else {// caso o rs.next() for false, ou seja, a consulta sql não restornou positivo, copula os setores com nada
				consulta[0] = "";
    	        consulta[1] = "";
    	        consulta[2] = "";
    	        consulta[3] = "";
    	        consulta[4] = "";
    	        consulta[5] = "";
    	        consulta[6] = "";
    	        consulta[7] = "";
			}

            /* Fechando conexão */
            
            stmt.close();
            rs.close();
            
            //conexao.close();
            
			return consulta;// retorna o vetor carregado com os resultados da busca sql ou vazio
        }           
        catch (Exception e)
        {
          System.out.print("\nErro de conexao ADM DAO...\n" + e.toString());
        }
        return null;
    }
}