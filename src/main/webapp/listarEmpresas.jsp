<%@page import="br.com.alura.gerenciador.servlet.modelo.Empresa"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix = "fmt"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Listagem de empresas</title>
</head>
<body>

	<div class="container">
	<h2>Empresas:</h2>
		<ul class="list-group list-group-flush">
			<c:forEach items="${ empresas }" var="empresa">
				<li class="list-group-item">${ empresa.nome } - <fmt:formatDate value="${empresa.dataAbertura }" pattern="dd/MM/yyyy"/>
				<a href="/gerenciador/mostraempresa?id=${ empresa.id }" class="btn btn-warning">Editar</a>
				<a href="/gerenciador/removerempresa?id=${ empresa.id }" class="btn btn-danger">Remover</a>
				</li>
				
			</c:forEach>
		</ul>	
	</div>

</body>
</html>