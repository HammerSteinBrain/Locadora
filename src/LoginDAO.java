
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class LoginDAO {
	
	Connection conexao;
    
    public LoginDAO(){
    	
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //Class.forName("org.mariadb.jdbc.Driver");
            /* Abertura de conexão: */
            /* Notar que poderia ser substituida por
            uma chamada de get instance de uma conexão já aberta. 
            */
            //conexao = DriverManager.getConnection("jdbc:mariadb://172.16.7.63:3306/agenda","usuario", "usuario123");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?"+"user=root&password=root");

            System.out.print("Conexao ok\n");
            
        } catch (Exception e){
            System.out.print("Erro de conexao LoginDAO");
        }
    }
    
    public String procurar_id() {
    	
        try{        
            PreparedStatement comandoSQLp = conexao.prepareStatement("select * from login.login where id = ?");  
            comandoSQLp.setString(1, "1");
            ResultSet rs = comandoSQLp.executeQuery();
            System.out.println("Conectei a tabela login");
            
            rs.next();
            
            //System.out.println(rs.getString(2));
            
            String id = rs.getString(1);
            String name = rs.getString(2);
            String password = rs.getString(3);
            
            /* Se utilizar o padrão singleton, não fechar a conexão. */
            comandoSQLp.close();
            rs.close();
            //conexao.close();
            
            //return id +" "+name+" "+password;
            return id;
        }           
        catch (Exception e)
        {
          System.out.print("\nErro de conexao...\nFind by id usuario " + e.toString());
        }
        return null;
        
    }
	
}