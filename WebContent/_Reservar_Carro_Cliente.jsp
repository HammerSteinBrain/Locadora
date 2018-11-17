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
      
      <form action="Servlet_Cliente" method="post" name="request" id="request">
        <!-- mtos conteudos chatos -->

		<h2>Opções de Veiculos para locação disponiveis</h2>
		<br>
		<img src="imagens/volvo.jpg">
		<br>
		Nome: Volvo<br>
		Categoria: SUV<br>
		Ano: 2017<br>
		Placa: KLO-5485<br>
		Modelo: Generic-for-this-trab<br>
		Cor: Branco<br>
		Estado de Conservação: Usado<br>
		Quilometragem: 120.000 km<br>
		Tanque de combustivel: 20 Litros restantes<br>
		
		<button name="volvo" type="submit" id="volvo" value="volvo" class="btn btn-purple">Efetuar Reserva</button><p></p>
		
		<img src="imagens/camaro.jpg">
		<br>
		Nome: Camaro<br>
		Categoria: Popular<br>
		Ano: 2017<br>
		Placa: KYO-5005<br>
		Modelo: Generic-for-this-trab<br>
		Cor: Prata<br>
		Estado de Conservação: Usado<br>
		Quilometragem: 100.000 km<br>
		Tanque de combustivel: 30 Litros restantes<br>
		
		<button name="camaro" type="submit" id="camaro" value="camaro" class="btn btn-purple">Efetuar Reserva</button><p></p>
		
		<img src="imagens/uninho.jpg">
		<br>
		Nome: UNO<br>
		Categoria: Popular<br>
		Ano: 2017<br>
		Placa: TRB-1324<br>
		Modelo: Mile Fire<br>
		Cor: Branco<br>
		Estado de Conservação: Usado<br>
		Quilometragem: 20.000 km<br>
		Tanque de combustivel: 40 Litros restantes<br>
		
		
		<button name="uno" type="submit" id="uno" value="uno" class="btn btn-purple">Efetuar Reserva</button><p></p>
		
		<p>Para mais detalhes consulte nossas lojas!</p>
	</form>
      </div>
    </div>
	
    <div id="footer">
      <a>Copyright &copy; Locadora Feliz | 2018 | Trabalho de Engenharia de Software Lab</a>
    </div>
	
  </div>
</body>
</html>
