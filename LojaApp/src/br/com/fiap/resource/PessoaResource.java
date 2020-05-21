package br.com.fiap.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/dados")
public class PessoaResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)	
	public String[][] buscar() {
		
		String[][] p = {{"Carlos","121223"},{"Marcos","45364536"},{"Otavio","392982983"},{"Jorge","3847378"}};
		
		return p;
	}
	

}
