package br.com.fiap.resource.dao;

import java.util.List;

import br.com.fiap.resource.to.ProdutoTO;

public interface ProdutoDAO {
	
	public List<ProdutoTO> select();
	
	public ProdutoTO select(int cod);
	
	public boolean insert(ProdutoTO produto);
	
	public boolean update(ProdutoTO produto);
	
	public void delete(int cod);

}
