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
			        		<li><a href="#">Remover Reservas</a></li>                    
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
			        		<li><a href="_Visualizar_situacao_frota.jsp">Visualizar Frota</a></li>               
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
        
        <h1>Remover Reservas</h1>
		
		<form>
			Codigo da Reserva:<br>
			<input type="text" name="nome_cliente">
			<a href="#" class="btn btn-purple" >Procurar pelo codigo</a>
			<br>
			Nome do cliente:<br>
			<input type="text" name="nome_cliente"><br>
			CPF:<br>
			<input type="text" name="cpf"><br>
			Telefone:<br>
			<input type="text" name="telefone"><br>
			Hora Inicio da Reserva:<br>
			<input type="text" name="hr_ini_reserva"><br>
			Termino Previsto da reserva:<br>
			<input type="text" name="term_reserva"><br>
			Valor total previsto:<br>
			<input type="text" name="vlr_total_prev"><br>
			Carro:<br>
			<input type="text" name="carro">
		</form>
		<br>
		
		<a href="#" class="btn btn-red" >DELETAR Reserva</a>
		<a href="#" class="btn btn-green">Limpar</a>
		
      </div>
    </div>
    <div id="footer">
      <a>Copyright &copy; Locadora Feliz | 2018 | Trabalho de Engenharia de Software Lab</a>
    </div>
  </div>
</body>
</html>
