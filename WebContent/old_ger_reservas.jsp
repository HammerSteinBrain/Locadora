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
			        		<li><a href="#">Editar Reservas</a></li>
			        		<li><a href="#">Remover Reservas</a></li>                    
			       		</ul>
			        </li>
			        <li><a href="#">Alugar Carro Reservado</a>
			        	<ul>
			        		<li><a href="#">Web Design</a></li>
			        		<li><a href="#">SEO</a></li>
			        		<li><a href="#">Design</a></li>                    
			       		</ul>
			        </li>
			        <li><a href="#">Receber Carro Alugado</a>
			        	<ul>
			        		<li><a href="#">Web Design</a></li>
			        		<li><a href="#">SEO</a></li>
			        		<li><a href="#">Design</a></li>                    
			       		</ul>
			        </li>
			        <li><a href="#">Visualizar Cituação Frota</a>
			        	<ul>
			        		<li><a href="#">Web Design</a></li>
			        		<li><a href="#">SEO</a></li>
			        		<li><a href="#">Design</a></li>                    
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
        <h1>Gerenciar Reservas</h1>
		
		<div id="DataGridView" style="width:600px; height:600px; background-color:gray">
		
		</div>
		<br>
		
		<a href="#" class="btn btn-green">Cadastrar Reservas</a>
		<a href="#" class="btn btn-green">Editar Reservas</a>
		<a href="#" class="btn btn-green">Remover Reservas</a>
		
      </div>
    </div>
    <div id="footer">
      <a>Copyright &copy; Locadora Feliz | 2018 | Trabalho de Engenharia de Software Lab</a>
    </div>
  </div>
</body>
</html>
