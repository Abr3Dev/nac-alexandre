<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<link rel="stylesheet" href="styles/style.css">
</head>
<body>

	<div class="form-mold">
		<div>
			<label onclick="Buscar()">Buscar</label>
			<label onclick="Atualizar()">Atualizar</label> 
			<label onclick="Cadastrar()">Cadastar</label>
		</div>
		<br />
	
		<form action="buscar" method="get" id="form-buscar">
			<label>Buscar por Código</label> 
			<input type="number" name="codigo" placeholder="Digite o código do produto" />
			<br />
			<button>Enviar</button>
		</form>
		
		<form action="atualizar" method="POST" id="form-atualizar">
			<label>Atualizar</label> 
			<input type="number" name="codigo" placeholder="Digite o código do produto" /> 
			<input type="text" name="titulo" placeholder="Digite o nome do produto" /> 
			<input type="text" name="preco" placeholder="Digite o preco do produto" />
			<input type="number" name="quantidade" placeholder="Digite a quantidade do produto" /> 
			<br />
			<button>Enviar</button>
		</form>

		<form action="cadastrar" method="POST" id="form-cadastrar">
			<label>Cadastrar</label> 
			<input type="number" name="codigo"placeholder="Digite o código do produto" />
			<input type="text"name="titulo" placeholder="Digite o nome do produto" /> 
			<input type="text" name="preco" placeholder="Digite o preco do produto" />
			<input type="number" name="quantidade" placeholder="Digite a quantidade do produto" /> 
			<br />
			<button>Enviar</button>
		</form>

		<form action="listar" method="get" id="form-button-mostrar-lista">
			<button>Mostrar Lista</button>
		</form>
		<div class="list">
		<c:choose>
			<c:when test="${listagem != null}">
				<table cellpadding="0" cellspacing="0" border="0">
					<tr class="title-table">
						<td>Código</td>
						<td>Título</td>
						<td>Preço</td>
						<td>Quantidade</td>
						<td>Deletar</td>
					</tr>
					<c:forEach var="itens" items="${listagem }">
						<tr class="tbl-content">
							<td>${itens.codigo}</td>
							<td>${itens.titulo}</td>
							<td>${itens.preco}</td>
							<td>${itens.quantidade}</td>
							<td><form action="deletar" method="POST" id="form-deletar">
									<input type="hidden" name="codigo" value="${itens.codigo }" />
									<button class="style-button">Deletar</button>
								</form></td>
						</tr>
					</c:forEach>
				</table>
			</c:when>
		</c:choose>
		<c:choose>
			<c:when test="${busca != null}">
				<table cellpadding="0" cellspacing="0" border="0">
					<tr class="title-table">
						<td>Código</td>
						<td>Título</td>
						<td>Preço</td>
						<td>Quantidade</td>
						<td>Deletar</td>
					</tr>
					<tr class="tbl-content">
						<td>${busca.codigo}</td>
						<td>${busca.titulo}</td>
						<td>${busca.preco}</td>
						<td>${busca.quantidade}</td>
						<td><form action="deletar" method="POST" id="form-deletar">
								<input type="hidden" name="codigo" value="${busca.codigo }" />
								<button class="style-button">Deletar</button>	
							</form>
						</td>
					</tr>
				</table>
			</c:when>
		</c:choose>
		</div>
	</div>
	<script src="styles/js.js"></script>
</body>
</html>