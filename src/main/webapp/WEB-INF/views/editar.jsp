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
				<h4>Actualizar Empleado</h4>
			</div>
			<div class="card-body">
				<form method="POST">
					<label>Nombre</label>
					<input type="text" name="nombre" class="form-control" value="${empleado.getNombre()}">
					<label>Categoria</label>
					<input type="number" min="1" max="9" name="categoria" class="form-control" value="${empleado.getCategoria()}">
					<label>Antiguedad</label>
					<input type="number" min="1" max="100" name="anyos" class="form-control" value="${empleado.getAnyos()}">
					<label>Sexo</label>
					<input type="text" name="sexo" class="form-control" value="${empleado.getSexo()}">
					<br>
					<input type="submit" value="Actualizar" class="btn btn-success">
					<a href="index.jsp" class="btn btn-success">Regresar</a>
				</form>
			</div>
		</div>
	</div>
	
</body>
</html>