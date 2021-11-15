<%@ include file="/WEB-INF/views/include.jsp"%>

<html>
<head>
<title><fmt:message key="title" /></title>
</head>
<body style="background-color: #F2F1F1;">

	<div class="container mt-4">
		<div class="card border-info">
			<div class="card-header bg-info text-white">
				<a class="btn btn-primary" href="buscaSueldo">Nueva Busqueda</a>
			</div>
			<c:if test="${empty lista}">
    		La busqueda no tiene resultados
			</c:if>
			<c:if test="${not empty lista}">
			<div class="card-body">
				<table class="table table-hover">
					<thead>
						<tr>
							<th>DNI: ${lista.getDni()} </th>
							<th>SALARIO: ${lista.getSueldo()} </th>
						</tr>
					</thead>
				</table>
			</div>
			</c:if>
		</div>
	</div>

</body>
</html>