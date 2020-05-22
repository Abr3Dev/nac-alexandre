package br.com.fiap.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import br.com.fiap.resource.to.ProdutoTO;

@Path("/produto")
public class ProdutoResource {
	
	private ProdutoBO produtoBo = new ProdutoBO();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<ProdutoTO> buscar() {
		return produtoBo.listar();
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public ProdutoTO buscar(@PathParam("id") int cod) {
		return produtoBo.listar(cod);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(ProdutoTO produto, @Context UriInfo urinfo) {
		produtoBo.cadastrar(produto);
		UriBuilder builder = urinfo.getAbsolutePathBuilder();
		builder.path(Integer.toString(produto.getCodigo()));
		return Response.created(builder.build()).build();
	}
	
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualizar(ProdutoTO produto,@PathParam("id")int cod) {
		
		produto.setCodigo(cod);
		produtoBo.atualizar(produto);
		return Response.ok().build();
		
	}
	
	@DELETE
	@Path("/{id}")
	public void remover(@PathParam("id") int cod) {
		produtoBo.excluir(cod);
	}
		
}
