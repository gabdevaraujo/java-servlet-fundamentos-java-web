<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Nova empresa</title>
</head>
<body>
	<div class="container">
		
		<c:if test="${not empty empresa}">
			<p>Empresa <b>${ empresa.getNome() }</b> cadastrada com sucesso!</p>
		</c:if>
	
		<c:if test="${empty empresa}">
			<p>Nenhuma empresa cadastrada!</p>
		</c:if>
	
	</div>
	
</body>
</html>