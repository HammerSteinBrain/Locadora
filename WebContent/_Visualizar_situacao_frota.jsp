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

				<table border="1">
					<tr>
						<th>Veiculo</th>
						<th>Ano</th>
						<th>Combustivel</th>
						<th>Situação</th>
					</tr>
					<tr>
						<td>Gol</td>
						<td>2011</td>
						<td>20 Litros</td>
						<td>ok</td>
					</tr>
					<tr>
						<td>Fox</td>
						<td>2014</td>
						<td>30 Litros</td>
						<td>Revisado</td>
					</tr>
					<tr>
						<td>Meriva</td>
						<td>2013</td>
						<td>Vazio</td>
						<td>Danificado</td>
					</tr>
					<tr>
						<td>Volvo</td>
						<td>2017</td>
						<td>20 Litros</td>
						<td>Alugado</td>
					</tr>
				</table>

			</div>
      
    </div>
    <div id="footer">
      <a>Copyright &copy; Locadora Feliz | 2018 | Trabalho de Engenharia de Software Lab</a>
    </div>
  </div>
</body>
</html>
