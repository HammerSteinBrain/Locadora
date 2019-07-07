<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
  <title>Locadora Feliz</title>
  <meta name="description" content="website description" />
  <meta name="keywords" content="website keywords, website keywords" />
  <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
  
  <link rel="stylesheet" type="text/css" href="style/style.css" title="style" />
  <link rel="stylesheet" type="text/css" href="style/menu.css" title="style" />
</head>

<body>
  <div id="main">
    <div id="header">
      <div id="logo">
        <div id="logo_text">
          <h1><a href="#"><span class="logo_colour">Locadora Feliz</span></a></h1>
          <h2>Bem Vindo Administrador</h2>
        </div>
      </div>
      
      <nav>
		  <ul class="menu">
		        <li><a href="Home_adm.jsp">Inicio</a></li>
		        <li><a href="#">Gerenciar Reservas</a>
		        	<ul>
		        		<li><a href="_Cadastrar_Reservas.jsp">Cadastrar Reservas</a></li>
		        		<li><a href="_Editar_Reservas.jsp">Editar Reservas</a></li>
		        		<li><a href="_Remover_Reservas.jsp">Remover Reservas</a></li>                    
		       		</ul>
		        </li>
		        <li>
		        	<a href="_Alugar_Carro_Reservado.jsp">Alugar Carro Reservado</a>
		        </li>
		        <li>
		        	<a href="_Receber_carro_alugado.jsp">Receber Carro Alugado</a>
		        </li>
		        <li><a href="#">Visualizar Cituação Frota</a>
		        	<ul>
		        		<li><a href="_Cadastrar_Veiculos.jsp">Cadastrar Veiculos</a></li>                  
		       		</ul>
		        </li>
		        <li><a href="Index.jsp">Sair</a></li>                
		</ul>
	</nav>
      
    </div>
    
    <div id="site_content">
    
      <div class="sidebar">
        <!-- sidebar itens -->
        <h3>Carros Populares</h3>
        <img src="imagens/img1.jpg">
        <p></p>
        <h3>Carros Eletricos</h3>
        <img src="imagens/img2.jpg">
        <h3>Carros Classicos</h3>
        <img src="imagens/img3.jpg">
      </div>
   
	      <div id="content">
	        <!-- conteudo -->
	        <h2>Visualizar Frota</h2>
	
				<%@ page import="java.sql.*"%>
				<%@ page import="javax.sql.*"%>
	
				<table border="1">
					<tr>
						<th>Veiculo</th>
						<th>Categoria</th>
						<th>Ano</th>
						<th>Modelo</th>
						<th>Fabricante</th>
						<th>Cor</th>
						<th>Estado Conservação</th>
						<th>Quilometragem</th>
						<th>Tanque Combustivel</th>
					</tr>
	
					<%
						Class.forName("com.mysql.jdbc.Driver"); 
						java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","root"); 
						Statement st= con.createStatement(); 
						ResultSet rs=st.executeQuery("select * from veiculos"); 
						while(rs.next())
						{
					%>
						<tr>
							<td><%=rs.getString(2)%></td>
							<td><%=rs.getString(3)%></td>
							<td><%=rs.getString(4)%></td>
							<td><%=rs.getString(5)%></td>
							<td><%=rs.getString(6)%></td>
							<td><%=rs.getString(7)%></td>
							<td><%=rs.getString(8)%></td>
							<td><%=rs.getString(9)%></td>
							<td><%=rs.getString(10)%></td>
						</tr>
					<% 
						}
					%>
				</table>
		</div>
    </div>
    <div id="footer">
      <a>Copyright &copy; Locadora Feliz | 2019 | Trabalho de Engenharia de Software</a>
    </div>
  </div>
</body>
</html>
