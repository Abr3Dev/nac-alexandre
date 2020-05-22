package br.com.fiap.application;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import br.com.fiap.to.ProdutoTO;

public class Listagem {
	
	private Client client = Client.create();
	
	public ProdutoTO[] getService() {
		
		WebResource resource = client.resource("http://localhost:8080/Andrerm83092/rest/produto");
		
		ClientResponse response = resource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		
		if(response.getStatus() == 200) {
//			ProdutoTO[] produto = response.getEntity(ProdutoTO[].class);
//			for (ProdutoTO p : produto) {
//				System.out.println("__________________________");
//				System.out.println("COD   : " + p.getCodigo());
//				System.out.println("NOME  : " + p.getTitulo());
//				System.out.println("PREÇO : " + p.getPreco());
//				System.out.println("QUANTIDADE : " + p.getQuantidade());
//				System.out.println("__________________________");
//			}
			return response.getEntity(ProdutoTO[].class);
		}else {
			return null;
		}
	}
	
	public ProdutoTO getService(int cod) {
		
		WebResource resource = client.resource("http://localhost:8080/LojaApp/rest/produto/"+cod);
		
		ClientResponse response = resource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		
		if(response.getStatus() == 200) {
			return response.getEntity(ProdutoTO.class);
		}else {
			return null;
		}
	}

	public static void main(String[] args) {
		
		Listagem listagem = new Listagem();
//		ProdutoTO p = listagem.getService(6);
//		listagem.getService();
//		System.out.println("__________________________");
//		System.out.println("NOME  : " + p.getTitulo());
//		System.out.println("PREÇO : " + p.getPreco());
//		System.out.println("QUANTIDADE : " + p.getQuantidade());
//		System.out.println("__________________________");
		
		for (ProdutoTO p : listagem.getService()) {
			System.out.println("__________________________");
			System.out.println("COD   : " + p.getCodigo());
			System.out.println("NOME  : " + p.getTitulo());
			System.out.println("PREÇO : " + p.getPreco());
			System.out.println("QUANTIDADE : " + p.getQuantidade());
			System.out.println("__________________________");
		}
		
		
		
	}
	
}
