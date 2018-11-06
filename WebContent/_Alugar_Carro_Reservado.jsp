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

  <script src="scripts/imprimir.js" type="text/javascript"></script>
  
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
			        	<a href="#">Alugar Carro Reservado</a>
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
      
      <div id='printableArea'>
        <!-- conteudo -->
        <h1>Alugar Carro Reservado</h1>

		<form name="Servlet_ADM" action="Servlet_ADM" method="post">
			Nome do cliente:<br>
			<input type="text" name="nome_cliente"><br>
			CPF:<br>
			<input type="text" name="cpf"><br>
			Telefone:<br>
			<input type="text" name="telefone"><br>
			
			Carro:<br>
			<input type="text" name="carro"><br>
			Hora Retirada:<br>
			<input type="text" name="hr_retirada"><br>
			Hora devolução:<br>
			<input type="text" name="hr_devolucao"><br>
			Valor total da Reserva:<br>
			<input type="text" name="vlr_total_res"><br>
			Valor Pago antecipadamente:<br>
			<input type="text" name="vl_pgto_anteci"><br>
			Valor Pago na Devolução:<br>
			<input type="text" name="vl_pgto_devolucao"><br>
			
			<input type="submit" name="gerar_contrato" value="Gerar Contrato de Aluguel" class="btn btn-purple"><br>
			<input type="reset" class="btn btn-purple" value="Limpar"><br>
			
			<input id ="bot01" type="button" value="Imprimir Contrato" class="btn btn-green"><br>
		</form>

		<br>
	
      </div>
    </div>
    
    <div id="footer">
      <a>Copyright &copy; Locadora Feliz | 2018 | Trabalho de Engenharia de Software Lab</a>
    </div>
  </div>
</body>
</html>
