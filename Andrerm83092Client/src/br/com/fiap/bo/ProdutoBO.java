package br.com.fiap.bo;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import br.com.fiap.to.ProdutoTO;

public class ProdutoBO {
	
	private Client client = Client.create();

	public int putService(ProdutoTO produto) {
		
		WebResource resource = client.resource("http://localhost:8080/Andrerm83092/rest/produto/"+produto.getCodigo());
		
		ClientResponse response = resource.type("application/json").put(ClientResponse.class, produto);
		
		if(response.getStatus() == 200) {
			return response.getStatus();
		}else {
			return response.getStatus();
		}
	}
	
	public int postService(ProdutoTO produto) {
		
		WebResource resource = client.resource("http://localhost:8080/Andrerm83092/rest/produto");
		
		ClientResponse response = resource.type("application/json").post(ClientResponse.class, produto);
		
		if(response.getStatus() == 201) {
			return response.getStatus();
		}else {
			return response.getStatus();
		}
	}	
	
	public ProdutoTO getService(int cod) {

		WebResource resource = client.resource("http://localhost:8080/Andrerm83092/rest/produto/" + cod);

		ClientResponse response = resource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);

		if (response.getStatus() == 200) {
			return response.getEntity(ProdutoTO.class);
		} else {
			return null;
		}
	}
	
	public ProdutoTO[] getService() {
		
		WebResource resource = client.resource("http://localhost:8080/Andrerm83092/rest/produto");
		
		ClientResponse response = resource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		
		if(response.getStatus() == 200) {
			return response.getEntity(ProdutoTO[].class);
		}else {
			return null;
		}
	}
	
	public int deleteService(int cod) {
		
		WebResource resource = client.resource("http://localhost:8080/Andrerm83092/rest/produto/"+cod);
		
		ClientResponse response = resource.delete(ClientResponse.class);
		
		if(response.getStatus() == 204) {
			return response.getStatus();
		}else {
			return response.getStatus();
		}
	}
}
