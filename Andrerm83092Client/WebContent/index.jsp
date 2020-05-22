<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	<form action="atualizar" method="POST">
        <input type="text" name="titulo" placeholder="Digite o nome do produto" />
        <input type="text" name="preco" placeholder="Digite o preco do produto" />
        <button>Enviar</button>
    </form>
    
    <form action="cadastrar" method="POST">
        <input type="text" name="titulo" placeholder="Digite o nome do produto" />
        <input type="text" name="preco" placeholder="Digite o preco do produto" />
        <button>Enviar</button>
    </form>
    
    <form action="deletar" method="POST">
        <input type="text" name="titulo" placeholder="Digite o nome do produto" />
        <input type="text" name="preco" placeholder="Digite o preco do produto" />
        <button>Enviar</button>
    </form>
    <form action="listar" method="get">
        <input type="text" name="titulo" placeholder="Digite o nome do produto" />
        <input type="text" name="preco" placeholder="Digite o preco do produto" />
        <button>Enviar</button>
    </form>
</body>
</html>