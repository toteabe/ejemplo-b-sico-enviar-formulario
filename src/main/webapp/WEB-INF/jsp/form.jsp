<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario</title>
</head>
<body>

	<form action="/formulario" method="POST">
		<label>Nombre:</label>
		&nbsp;<input name="nombre"/>
		<br/>
		<label>Apellidos:</label>
		&nbsp;<input name="apellidos" />
		<br/>
		<input type="submit" value="Enviar"/>
	</form>

</body>
</html>