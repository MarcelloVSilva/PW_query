<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="style_compra.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>


</head>
<body style="background-image: url('imagens/moca.jpg');">
<!--Aqui está o codigo java que pega a sessao contendo o nome do funcionario logado-->
<%
String user=(String) session.getAttribute("user");
session.getAttribute(user);
String cliente=(String) session.getAttribute("cliente");
session.getAttribute(cliente);%>
<div id="start">
	<img height="50%" src='imagens/camisa1.jpg' draggable="true"/>
	<label>49,90</label>
	<img height="50%" src='imagens/camisa2.jpg' draggable="true"/>
	<label>49,90</label>
	<img height="50%" src='imagens/camisa1.jpg' draggable="true"/>
	<label>49,90</label>
	<img height="50%" src='imagens/camisa2.jpg' draggable="true"/>
	<label>49,90</label>
	<img height="50%" src='imagens/camisa2.jpg' draggable="true"/>
	<label>49,90</label>
	<img height="50%" src='imagens/camisa1.jpg' draggable="true"/>
	<label>49,90</label>
	<img height="50%" src='imagens/camisa2.jpg' draggable="true"/>
	<label>49,90</label>
	<img height="50%" src='imagens/camisa1.jpg' draggable="true"/>
	<label>49,90</label>
	</div>
	<div id="carrinho">
	<p>Funcionario:  <%=user%>   <p>
	<p>Cliente:  <%=cliente%>   <p>
	<a id="cancela_compra" href="home.html">Cancelar compra</a>
	</div>
<a class="btn-primary" href="login.jsp">logout</a>


</body>
</html>