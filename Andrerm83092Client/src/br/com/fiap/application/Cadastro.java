package br.com.fiap.application;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import br.com.fiap.to.ProdutoTO;

public class Cadastro {

	private Client client = Client.create();
	
	public int postService(ProdutoTO produto) {
		
		WebResource resource = client.resource("http://localhost:8080/Andrerm83092/rest/produto");
		
		ClientResponse response = resource.type("application/json").post(ClientResponse.class, produto);
		
		if(response.getStatus() == 201) {
			return response.getStatus();
		}else {
			return response.getStatus();
		}
	}	
	
	public static void main(String[] args) {
		
		ProdutoTO produto = new ProdutoTO();
		Cadastro cadastro = new Cadastro();
		
		produto.setCodigo(6);
		produto.setTitulo("Caixa de Som");
		produto.setPreco(350.90);
		produto.setQuantidade(20);
		
		System.out.println("STATUS DO CADASTRO : " + cadastro.postService(produto));
		
		
		
	}

}
