var atualizar    = document.getElementById("form-atualizar");
var cadastrar    = document.getElementById("form-cadastrar");
var buscar       = document.getElementById("form-buscar");


window.onload = function() {
	this.buscar.style.display       = "none";
    this.cadastrar.style.display    = "block";
    this.atualizar.style.display 	= "none";
};

function Atualizar(){
	buscar.style.display    = "none";
    cadastrar.style.display = "none";
    atualizar.style.display = "block";
}

function Cadastrar(){
	buscar.style.display    = "none";
    cadastrar.style.display = "block";
    atualizar.style.display = "none";
}

function Buscar(){
	buscar.style.display    = "block";
    cadastrar.style.display = "none";
    atualizar.style.display = "none";
}