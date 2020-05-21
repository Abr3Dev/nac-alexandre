package br.com.fiap.resource;

import java.util.List;

import br.com.fiap.resource.dao.ProdutoDAOimpl;
import br.com.fiap.resource.to.ProdutoTO;

public class ProdutoBO {
	
	private ProdutoDAOimpl pd = null;
	
	public List<ProdutoTO> listar(){
		pd = new ProdutoDAOimpl();
		return pd.select();
	}
	
	public ProdutoTO listar(int idProduto){
		pd = new ProdutoDAOimpl();
		return pd.select(idProduto);
	}
	
	public boolean cadastrar(ProdutoTO produto) {
		pd = new ProdutoDAOimpl();
		return pd.insert(produto);
	}
	
	public boolean atualizar(ProdutoTO produto) {
		pd = new ProdutoDAOimpl();
		return pd.update(produto);
	}
	
	public void excluir(int cod) {
		pd = new ProdutoDAOimpl();
		pd.delete(cod);
	}
	
}
