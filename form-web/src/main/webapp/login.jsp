<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Página Inicial</title>
<link rel="stylesheet" href="css/estilo.css">

</head>

<body>
	<fieldset>
		<form action="loginservlet" method="post">
			<legend>ACESSAR</legend>
			<img id="img-java" src="img/java.png" alt="imagem java"> <label
				for="login">Login:</label> <input class="larguraTexto" type="text"  name="login"
				id="login" placeholder="Digite seu login"> <label
				for="senha">Senha:</label> <input class="larguraTexto"
				type="password" name="senha" id="senha" placeholder="Digite sua senha">
			<input type="submit" class="bt" value="Acessar">
		</form>
	</fieldset>
</body>

</html>






