var atualizar    = document.getElementById("form-atualizar");
var cadastrar    = document.getElementById("form-cadastrar");


window.onload = function() {
    this.cadastrar.style.display    = "block";
    this.atualizar.style.display 	= "none";
};

function Atualizar(){
    cadastrar.style.display = "none";
    atualizar.style.display = "block";
}

function Cadastrar(){
    cadastrar.style.display = "block";
    atualizar.style.display = "none";
}