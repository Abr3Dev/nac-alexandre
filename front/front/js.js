var deletar      = document.getElementById("form-deletar");
var atualizar    = document.getElementById("form-atualizar");
var cadastrar    = document.getElementById("form-cadastrar");


window.onload = function() {
    this.deletar.style.display      = "none";
    this.cadastrar.style.display    = "none";
    this.mostrarLista.style.display = "none";
};

function Atualizar(){
    cadastrar.style.display = "none";
    deletar.style.display   = "none";
    atualizar.style.display = "block";
}

function Deteletar(){
    cadastrar.style.display = "none";
    deletar.style.display   = "block";
    atualizar.style.display = "none";
}

function Cadastrar(){
    cadastrar.style.display = "block";
    deletar.style.display   = "none";
    atualizar.style.display = "none";
}