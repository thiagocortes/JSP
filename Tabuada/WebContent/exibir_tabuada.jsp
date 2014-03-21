<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Exibindo Tabuada</title>
</head>
<body>

	<% 
	Object numero1 = new Integer(1);
	numero1 = request.getAttribute("numero");
	int numero = (Integer)numero1;
	int resultado, i;
	%>
<h1>Tabuada do <% out.println(numero); %></h1>

<table border="1px">
	<tr>
		<th>Soma</th>
		<th>Divisão</th>
		<th>Diminur</th>
		<th>Multiplicação</th>	
	</tr>
	<tr>
		<td>
			<% 	
				for(i=1; i<=10; i++){
				resultado = numero + i;
				out.println(numero+" + " +i+ " = "+resultado+"<br>");
				}
		
			%>	
		</td>
		<td>
			<% 	
				if(numero == 0){
					out.println("Impossivel<br>dividir<br>um numero<br>por 0");
				}
				else{
					
					for(i=1; i<=10; i++){
					resultado = numero / i;
					out.println(numero+" / " +i+ " = "+resultado+"<br>");
					}
				}
			%>
		</td>
		<td>
			<% 	
				for(i=1; i<=10; i++){
				resultado = numero - i;
				out.println(numero+" - " +i+ " = "+resultado+"<br>");
				}
		
			%>
		</td>
		<td>
			<%
				for(i=1; i<=10; i++){
					resultado = numero * i;
					out.println(numero+" * " +i+ " = "+resultado+"<br>");
				}
			%>
		</td>
	</tr>
</table>
<a href="index.jsp">Voltar</a>
</body>
</html>