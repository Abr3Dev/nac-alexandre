package br.com.fiap.service;

import br.com.fiap.to.ProdutoTO;

public interface ProdutoService {

	public int putService(ProdutoTO produto);

	public int postService(ProdutoTO produto);

	public int deleteService(int cod);

	public ProdutoTO getService(int cod);

}
