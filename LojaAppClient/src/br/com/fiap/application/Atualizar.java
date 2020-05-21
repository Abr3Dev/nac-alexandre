package br.com.fiap.application;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import br.com.fiap.to.ProdutoTO;

public class Atualizar {
	private Client client = Client.create();
	
	public int putService(ProdutoTO produto) {
				
		WebResource resource = client.resource("http://localhost:8080/LojaApp/rest/produto/"+produto.getCodigo());
		
		ClientResponse response = resource.type("application/json").put(ClientResponse.class, produto);
		
		if(response.getStatus() == 200) {
			return response.getStatus();
		}else {
			return response.getStatus();
		}
	}	

}
