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
	<link rel="stylesheet" type="text/css" href="style/responsiveslides.css" title="style" />
	
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
	<script src="scripts/responsiveslides.min.js" type="text/javascript"></script>
	  
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
			        <li><a href="#">Inicio</a></li>
			        <li>
			        	<a href="_Reservar_Carro_Cliente.jsp">Reservar Carro</a>
			        </li>
			        <li>
			        <li><a href="Index.jsp">Sair</a></li>                
			</ul>
	 </nav>
      
    </div>
	
    <div id="site_content">
    
	  <ul class="rslides">
		  <li><img src="imagens/1.jpg"></li>
		  <li><img src="imagens/2.jpg"></li>
		  <li><img src="imagens/3.jpg"></li>
	  </ul>
	  
	  <script>
		  $(function() {
		    $(".rslides").responsiveSlides({maxwidth: 800, speed: 800});
		  }
		  );
	 </script>
	  
      <div id="content">
        <!-- mtos conteudos chatos -->
        <h1>Bem vindo ao site Locadora Feliz</h1>
        <p>Temos diversos veiculos para todos os gostos, estilos e bolsos</p>
		<img src="imagens/img5.jpg">
		<h2>Melhor compatibilidade com os Browsers</h2>
        <ul>
          <li>Internet Explorer</li>
          <li>FireFox</li>
          <li>Google Chrome</li>
        </ul>
      </div>
    </div>
	
    <div id="footer">
      <a>Copyright &copy; Locadora Feliz | 2019 | Trabalho de Engenharia de Software</a>
    </div>
	
  </div>
</body>
</html>
