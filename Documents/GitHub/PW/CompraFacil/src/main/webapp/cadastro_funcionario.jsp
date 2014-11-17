<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="style_pedido.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastrar novo funcionario</title>
</head>
<body style="background-image: url('imagens/moca.jpg');">
	<a id="logout" href="login.jsp">logout</a>
	<div id="start">
	<h2>Sign Up</h2>
    <form action="cadastro_usuario" method="post">
    <label>First Name</label>
    <input type="text" name="firstname" class="span3">
    <label>Last Name</label>
    <input type="text" name="lastname" class="span3">
    <label>Username</label>
    <input type="text" name="username" class="span3">
    <label>Password</label>
    <input type="password" name="password" class="span3">
    <label><input type="checkbox" name="terms"> Estou ciente da criação do novo funcionário .</label>
    <input type="submit" value="Sign up" class="btn btn-primary pull-right">
     <button class="btn btn-primary btn-lg btn-block">Sign In</button>
    <div class="clearfix"></div>
    </form>
	
	</div>
	
</body>
</html>