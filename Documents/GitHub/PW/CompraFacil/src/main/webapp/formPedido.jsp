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
<title>Insert title here</title>
</head>
<body style="background-image: url('imagens/moca.jpg');">
	<div id="start">
	<form action="pedido" method="post" id="form">
	<input name="cliente" class="form-control focus" type="text" placeholder="Nome do Cliente" ></br>
		<a href="home.html" type="button" style="float: right;" class="btn btn-default">Cancelar</a>
		<a href="Compra.jsp" type="button" style="float: right;" class="btn btn-default">Iniciar</a>
	</form>
	<a href="login.jsp">logout</a>
	</div>
	
</body>
</html>