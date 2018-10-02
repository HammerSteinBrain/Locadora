<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <title>Locadora Feliz</title>
  <meta name="description" content="website description" />
  <meta name="keywords" content="website keywords, website keywords" />
  <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
  <link rel="stylesheet" type="text/css" href="style/style.css" title="style" />
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
      <div id="menubar">
        <ul id="menu">
          <!-- put class="selected" in the li tag for the selected page - to highlight which page you're on -->
          <li><a href="Home_adm.jsp">Home</a></li>
		  <li class="selected"><a href="ger_reservas.jsp">Gerenciar Reservas</a></li>
          <li><a href="alugar_carro_reservado.jsp">Alugar Carro Reservado</a></li>
          <li><a href="receber_carro_alugado.jsp">Receber Carro Alugado</a></li>
          <li><a href="visualizar_situacao_frota.jsp">Visualizar Situação da Frota</a></li>
        </ul>
      </div>
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
