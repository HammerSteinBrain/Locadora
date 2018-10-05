<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<title>Locadora Feliz</title>
	  
	<meta name="description" content="site para o trabalho de engenharia lab" />
	  
	<meta name="keywords" content="locadora, alugar, carros" />
	  
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
          <h2>Bem Vindo Cliente</h2>
        </div>
      </div>
      
      <nav>
			  <ul class="menu">
			        <li><a href="Home_Cliente.jsp">Inicio</a></li>
			        <li>
			        	<a href="_#">Reservar Carro</a>
			        </li>
			        <li>
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
        <!-- mtos conteudos chatos -->
        <h1>Bem vindo ao site Locadora Feliz</h1>
        <p>Temos diversos veiculos para todos os gostos, estilos e bolsos</p>
		<img src="imagens/img5.jpg">
		<br>
		
		<h2>Opções de Veiculos para locação disponiveis</h2>
         <select name="cars">
			  <option value="volvo">Volvo</option>
			  <option value="saab">Saab</option>
			  <option value="fiat">Fiat</option>
			  <option value="audi">Audi</option>
		</select>
		<br>
		
		
		<br>
		Nome: Volvo<br>
		Categoria: SUV<br>
		Ano: 2017<br>
		Placa: KLO-5485<br>
		Modelo: Generic-for-this-trab<br>
		Cor: Pink<br>
		Estado de Conservação: Usado<br>
		Quilometragem: 120.000 km<br>
		Tanque de combustivel: 20 Litros restantes<br>
		
		
		<br><a href="#" class="btn btn-purple" >Efetuar Reserva</a>
		<a href="#" class="btn btn-red" >Cancelar</a>
		
		<p>Para mais detalhes consulte nossas lojas!</p>
		
      </div>
    </div>
	
    <div id="footer">
      <a>Copyright &copy; Locadora Feliz | 2018 | Trabalho de Engenharia de Software Lab</a>
    </div>
	
  </div>
</body>
</html>
