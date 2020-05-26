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
            <label onclick="Atualizar()">Atualizar</label>
            <label onclick="Cadastrar()">Cadastar</label>
            <label onclick="Deletar()">Deletar</label>
        </div>
    <br/>

	<form action="atualizar" method="POST" id="form-atualizar">
		<label>Atualizar</label>
        <input type="number" name="codigo" placeholder="Digite o código do produto" />
        <input type="text" name="titulo" placeholder="Digite o nome do produto" />
        <input type="text" name="preco" placeholder="Digite o preco do produto" />
        <input type="number" name="quantidade" placeholder="Digite a quantidade do produto" />
        <br/>
        <button>Enviar</button>
    </form>

    <form action="cadastrar" method="POST" id="form-cadastrar">
        <label>Cadastrar</label>
        <input type="number" name="codigo" placeholder="Digite o código do produto" />
        <input type="text" name="titulo" placeholder="Digite o nome do produto" />
        <input type="text" name="preco" placeholder="Digite o preco do produto" />
        <input type="number" name="quantidade" placeholder="Digite a quantidade do produto" />
        <br/>
        <button>Enviar</button>
    </form>
    
    <form action="deletar" method="POST" id="form-deletar">
        <label>Deletar</label>
        <input type="number" name="codigo" placeholder="Digite o código do produto" />
        <br/>
        <button>Enviar</button>
    </form>

    <form action="listar" method="get" id="form-button-mostrar-lista">
        <button>Mostrar Lista</button>
        <table>
    	<c:forEach var="itens" items = "${listagem }"> 
    	<tr>
    		<td>${itens.codigo}</td> 
    		<td>${itens.titulo}</td>
    		<td>${itens.preco}</td>
    		<td>${itens.quantidade}</td>
		</tr>
    	</c:forEach>
    	</table>
    </form>
    </div>
    <script src="styles/js.js"></script>
</body>
</html>