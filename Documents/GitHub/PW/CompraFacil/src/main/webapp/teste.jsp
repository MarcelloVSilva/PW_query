<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Administrador</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet">
    <style type="text/css">
        
    </style>
    <script src="http://code.jquery.com/jquery-1.10.2.min.js"></script>
    <script src="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
</head>
<body style="background-image: url('imagens/moca.jpg');">
<div class="navbar navbar-inverse">
    <div class="navbar-inner">
		<div class="container-fluid">
			<a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
				<span class="icon-bar"></span>
			</a>
			<a class="brand" href="#" name="top">Administrador</a>
			<div class="nav-collapse collapse">
				<ul class="nav">
					<li><a href="#"><i class="icon-home icon-white"></i> Usuários</a></li>
					<li class="divider-vertical"></li>
					<li class="active"><a href="#"><i class="icon-file icon-white"></i> Novo Funcionário</a></li>
					<li class="divider-vertical"></li>
					<li><a href="#"><i class="icon-envelope icon-white"></i> Novo Produto</a></li>
					<li class="divider-vertical"></li>
				</ul>
				<div class="btn-group pull-right">
					<a class="btn dropdown-toggle" data-toggle="dropdown" href="#">
						<i class="icon-user"></i> admin	<span class="caret"></span>
					</a>
					<ul class="dropdown-menu">
						<li><a href="#"><i class="icon-share"></i> Logout</a></li>
					</ul>
				</div>
			</div>
			<!--/.nav-collapse -->
		</div>
		<!--/.container-fluid -->
	</div>
	<!--/.navbar-inner -->
</div>
<!--/.navbar -->
<script type="text/javascript">

</script>
<a id="logout" href="login.jsp">logout</a>
	<div id="start">
	<form id="form">
		<a  href="cadastro_funcionario.jsp" style="float: left;" class="btn btn-default">Novo funcionário</a>
		<a href="novoProduto.jsp"  style="float: left;" class="btn btn-default">Novo produto</a>
	</form>
	
	</div>
	
</body>
</html>
