package br.com.fiap.application;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;



public class Remocao {

private Client client = Client.create();
	
	public int deleteService(int cod) {
				
		WebResource resource = client.resource("http://localhost:8080/Andrerm83092/rest/produto/"+cod);
		
		ClientResponse response = resource.delete(ClientResponse.class);
		
		if(response.getStatus() == 204) {
			return response.getStatus();
		}else {
			return response.getStatus();
		}
	}	
	
	public static void main(String[] args) {
		
		Remocao remocao = new Remocao();
		int status = remocao.deleteService(5);
		
		try {
			
			if(status == 204) {
				System.out.println("Produto excluído com sucesso!");
			}else {
				System.out.println("HTTP STATUS : " + status);
			}
			
		}catch (NullPointerException ex) {
			
		}
	}

}
