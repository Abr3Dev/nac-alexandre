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
		<label>Atualizar</label>
        <input type="number" name="codigo" value="12" placeholder="Digite o código do produto" />
        <input type="text" name="titulo" placeholder="Digite o nome do produto" />
        <input type="text" name="preco" value="1.98" placeholder="Digite o preco do produto" />
        <input type="number" name="quantidade" value="98" placeholder="Digite a quantidade do produto" />
        <button>Enviar</button>
    </form>
    
    <form action="cadastrar" method="POST">
        <input type="number" name="codigo" placeholder="Digite o código do produto" />
        <input type="text" name="titulo" placeholder="Digite o nome do produto" />
        <input type="text" name="preco" placeholder="Digite o preco do produto" />
        <input type="number" name="quantidade" placeholder="Digite a quantidade do produto" />
        <button>Enviar</button>
    </form>
    
    <form action="deletar" method="POST">
        <input type="number" name="codigo" placeholder="Digite o código do produto" />
        <input type="text" name="titulo" placeholder="Digite o nome do produto" />
        <input type="text" name="preco" placeholder="Digite o preco do produto" />
        <input type="number" name="quantidade" placeholder="Digite a quantidade do produto" />
        <button>Enviar</button>
    </form>
    <form action="listar" method="get">
        <button>Mostrar Lista</button>
    </form>
</body>
</html>