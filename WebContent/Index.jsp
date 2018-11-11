<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
	<title>Locadora Feliz</title>
		<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
		<link href="style/login.css" rel="stylesheet" type="text/css">
		
		<script src="scripts/login.js" type="text/javascript"></script>
	</head>
	
	<body class="geral">
		<strong></strong><div id="form" align="center" class="formlogin"> 
		  <form action="LoginCheck" method="post" name="login" id="login">
			<div class="margem">
				<div id="user_div" onMouseOver="ativarcampo(this)" onMouseOut="liberarcampo(this)"> 
				  <span id="user_div_span" class="dica">Digite sua identificação de usuario!</span> 
				  <img src="imagens/user.jpg" name="user_img" width="24" height="24" border="0" align="middle"> 
				  <input name="uname" type="text" size="50" maxlength="50" id="user" onMouseOver="this.focus()" class="cxtext">
				</div>
				<div id="pwd_div" onMouseOver="ativarcampo(this)" onMouseOut="liberarcampo(this)"> 
				  <span id="pwd_div_span" class="dica">Digite sua senha de acesso!</span> 
				  <img src="imagens/key.jpg" name="user_img" width="24" height="24" border="0" align="middle"> 
				  <input name="password" type="password" size="50" maxlength="50" id="pwd" onMouseOver="this.focus()" class="cxtext">
				</div>
				<div id="enter_img_div" onMouseOver="ativarcampo(this)" onMouseOut="liberarcampo(this)"> 
				  <span id="enter_img_div_span" class="dica">Clique uma vez aqui para realizar sua autenticação!</span> 
				  <img src="imagens/aut.jpg" name="enter_img" width="24" height="24" border="0" align="middle" onClick="javascript:document.login.submit()"> 
				</div>
			</div>
		  </form>
		</div>
	</body>
</html>