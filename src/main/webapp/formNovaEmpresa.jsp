<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="novaempresa" var="linkServletNovaEmpresa"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>

	<div class="container">
		<form action="${linkServletNovaEmpresa}" method="post">
		<div class="mb-3">
			<label for="nome" class="form-label">Empresa</label>
			<input type="text" class="form-control" id="nome" name="nome">
		</div>
		<div class="mb-3">
			<label for="nome" class="form-label">Data de Abertura</label>
			<input type="text" class="form-control" id="dataAbertura" name="dataAbertura">
		</div>
		<button type="submit" class="btn btn-primary">Salvar</button>
		</form>
	</div>	

</body>
</html>

