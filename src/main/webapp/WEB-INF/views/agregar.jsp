<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/views/include.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div class="container mt-4 col-lg-4">
		<div class="card border-info">
			<div class="card-header bg-info">
				<h4>Crear Empleado</h4>
			</div>
			<div class="card-body">
				<form method="POST">
					<label>Dni</label>
					<input type="text" minlength="9" maxlength="9" name="dni" required class="form-control" value="" pattern="(([X-Z]{1})([-]?)(\d{7})([-]?)([A-Z]{1}))|((\d{8})([-]?)([A-Z]{1}))">
					<label>Nombre</label>
					<input type="text" name="nombre" required class="form-control" value="">
					<label>Categoria</label>
					<input type="number" min="1" max="9" name="categoria" required class="form-control" value="">
					<label>Antiguedad</label>
					<input type="number" min="1" max="100" name="anyos" required class="form-control" value="">
					<label>Sexo</label>
					<input type="text" name="sexo" required class="form-control" value="">
					<br>
					<input type="submit" value="crear" class="btn btn-success">
					<a href="mostrar" class="btn btn-success">Regresar</a>
				</form>
			</div>
		</div>
	</div>
	
</body>
</html>