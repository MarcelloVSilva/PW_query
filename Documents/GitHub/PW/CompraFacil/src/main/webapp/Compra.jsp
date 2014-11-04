<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="style_compra.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script>
 var myItem = simpleCart.add({ name: "Cool Thing" , price: 4, quantity: 1 });

simpleCart.quantity(); // 1

myItem.remove();

simpleCart.quantity(); // 0

</script>
</head>
<body style="background-image: url('imagens/moca.jpg');">
<!--Aqui está o codigo java que pega a sessao contendo o nome do funcionario logado-->
<%
String user=(String) session.getAttribute("user");
session.getAttribute(user);
String cliente=(String) session.getAttribute("cliente");
session.getAttribute(cliente);%>

<script src="simpleCart.js"></script>


<div id="start">
	<div id="start" class="simpleCart_shelfItem addDemoAnimation">
		<div class="tooltip">
			<span class="item_price">$35.99</span>
 			<a class="item_add" href="javascript:;"> Add to Cart </a>
		</div>
	<img height="50%" src='imagens/camisa2.jpg'  alt="Sample Product" class="item_image item_add"/>
  	<span class="item_name"></span>
  </div>
  <div id="start" class="simpleCart_shelfItem addDemoAnimation">
		<div class="tooltip">
			<span class="item_price">$45.99</span>
 			<a class="item_add" href="javascript:;"> Add to Cart </a>
		</div>
	<img height="50%" src='imagens/camisa1.jpg'  alt="Sample Product" class="item_image item_add"/>
  	<span class="item_name"></span>
  </div>
  <div id="start" class="simpleCart_shelfItem addDemoAnimation">
		<div class="tooltip">
			<span class="item_price">$35.99</span>
 			<a class="item_add" href="javascript:;"> Add to Cart </a>
		</div>
	<img height="50%" src='imagens/camisa2.jpg'  alt="Sample Product" class="item_image item_add"/>
  	<span class="item_name"></span>
  </div>
  <div id="start" class="simpleCart_shelfItem addDemoAnimation">
		<div class="tooltip">
			<span class="item_price">$45.99</span>
 			<a class="item_add" href="javascript:;"> Add to Cart </a>
		</div>
	<img height="50%" src='imagens/camisa1.jpg'  alt="Sample Product" class="item_image item_add"/>
  	<span class="item_name"></span>
  </div>
  <div id="start" class="simpleCart_shelfItem addDemoAnimation">
		<div class="tooltip">
			<span class="item_price">$35.99</span>
 			<a class="item_add" href="javascript:;"> Add to Cart </a>
		</div>
	<img height="50%" src='imagens/camisa2.jpg'  alt="Sample Product" class="item_image item_add"/>
  	<span class="item_name"></span>
  </div>
  <div id="start" class="simpleCart_shelfItem addDemoAnimation">
		<div class="tooltip">
			<span class="item_price">$45.99</span>
 			<a class="item_add" href="javascript:;"> Add to Cart </a>
		</div>
	<img height="50%" src='imagens/camisa1.jpg'  alt="Sample Product" class="item_image item_add"/>
  	<span class="item_name"></span>
  </div>
  <div id="start" class="simpleCart_shelfItem addDemoAnimation">
		<div class="tooltip">
			<span class="item_price">$35.99</span>
 			<a class="item_add" href="javascript:;"> Add to Cart </a>
		</div>
	<img height="50%" src='imagens/camisa2.jpg'  alt="Sample Product" class="item_image item_add"/>
  	<span class="item_name"></span>
  </div>
	</div>
	<div id="carrinho">
	<p>Funcionario:  <%=user%>   <p>
	<p>Cliente:  <%=cliente%>   <p>
	<span class="simpleCart_quantity"></span> items - <span class="simpleCart_total"></span>
	<span class="simpleCart_items"></span>
	<a id="logout" href="login.jsp">logout</a>
	</div>
</body>
</html>