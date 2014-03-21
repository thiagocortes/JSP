<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/css.css">
<title>Tabuada</title>
</head>
<body>
	<div class="entrada">
		<form action="ServTabuada" method="POST">
			<label>
				<span><h1>Digite um Numero</h1></span><br>
				<input type="number" name="numero_1"><br>
				<input type="submit" value="calcular">
			</label>
		
		</form>
	</div>
</body>
</html>