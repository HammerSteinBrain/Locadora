
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;


public class LoginDAO {
	
	Connection conexao;
	String uname;
    
    public LoginDAO(String uname){
    	
    	this.uname = uname;
    	
    	
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?"+"user=root&password=root");

            System.out.print("Conexao ok\n");
            
        } catch (Exception e){
            System.out.print("Erro de conexao LoginDAO "+e.toString());
        }
    }
    
    public String[] procurar_id() {
        try{
            PreparedStatement comandoSQLp = conexao.prepareStatement("select * from login.login where login = ?");
            //sql query
            comandoSQLp.setString(1, uname);//substitui o 1∞ ? pela variavel uname
            ResultSet rs = comandoSQLp.executeQuery();
            System.out.println("Conectei a tabela login");
            
            //rs.next();//se for testar o rs.next() com o print, deixar apenas um se n da erro
            
            //System.out.println(rs.next()); //se for testar o rs.next() com o print, deixar apenas um se n da erro
            
            //System.out.println(rs.getString(2));
            
            
            String consulta[] = new String[4];
            
            if (rs.next()==true) { // S” PODE CHAMAR O RS.NEXT() UMA VEZ!!!!!!!!!!!!!!!!!!!!!!!
            	//copula os setores do vetor consulta com o parametro corresposnte ao retorn sql
            	consulta[0] = rs.getString(1);
    	        consulta[1] = rs.getString(2);
    	        consulta[2] = rs.getString(3);
    	        consulta[3] = rs.getString(4);
			} else {// caso o rs.next() fo false, ou seja, a consulta sql n„o restornou positivo, copula os setores com nada
				consulta[0] = "";
    	        consulta[1] = "";
    	        consulta[2] = "";
    	        consulta[3] = "";	
			}
            
	        

            /* Se utilizar o padr√£o singleton, n√£o fechar a conex√£o. */
            comandoSQLp.close();
            
            rs.close();
            //conexao.close();
            
            //return id +" "+name+" "+password;
                  
            return consulta;// retorna o vetor carregado com os resultados da busca sql ou vazio
        }           
        catch (Exception e)
        {
          System.out.print("\nErro de conexao LoginDAO...\nFind by id usuario " + e.toString());
        }
        return null;  
    }
	
}