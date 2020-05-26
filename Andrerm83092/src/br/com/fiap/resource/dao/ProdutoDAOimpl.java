package br.com.fiap.resource.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.resource.to.ProdutoTO;

public class ProdutoDAOimpl implements ProdutoDAO{
	
	public static List<ProdutoTO> listaProduto = null;

	public ProdutoDAOimpl() {
		
		if(listaProduto == null) {
			listaProduto = new ArrayList<ProdutoTO>();
			
			ProdutoTO pto = new ProdutoTO();
			pto.setCodigo(1);
			pto.setPreco(1599.90);
			pto.setQuantidade(1);
			pto.setTitulo("PS4-Slim 2 controles");
			listaProduto.add(pto);
			
			pto = new ProdutoTO();
			pto.setCodigo(2);
			pto.setPreco(2991.90);
			pto.setQuantidade(1);
			pto.setTitulo("Smart TV LED 60\" UHD 4K LG");
			listaProduto.add(pto);
			
			pto = new ProdutoTO();
			pto.setCodigo(3);
			pto.setPreco(1799.99);
			pto.setQuantidade(1);
			pto.setTitulo("Sofá Retrátil e Reclinável com Molas Ensacadas");
			listaProduto.add(pto);
			
			pto = new ProdutoTO();
			pto.setCodigo(4);
			pto.setPreco(156.60);
			pto.setQuantidade(3);
			pto.setTitulo("Nicho de Madeira Módulos Retangulares Branco");
			listaProduto.add(pto);
			
			pto = new ProdutoTO();
			pto.setCodigo(6);
			pto.setPreco(2599.90);
			pto.setQuantidade(1);
			pto.setTitulo("The Last Of Us 2 Collector Edition Ps4");
			listaProduto.add(pto);
			
			pto = new ProdutoTO();
			pto.setCodigo(7);
			pto.setPreco(3.00);
			pto.setQuantidade(5);
			pto.setTitulo("Biscoito Recheado Trakinas");
			listaProduto.add(pto);
			
			pto = new ProdutoTO();
			pto.setCodigo(8);
			pto.setPreco(63.90);
			pto.setQuantidade(1);
			pto.setTitulo("Livro - Construindo aplicações com NodeJS - 2ª edição");
			listaProduto.add(pto);
			
			pto = new ProdutoTO();
			pto.setCodigo(9);
			pto.setPreco(93.99);
			pto.setQuantidade(1);
			pto.setTitulo("Livro - Boxe Sherlock Holmes");
			listaProduto.add(pto);
			
			pto = new ProdutoTO();
			pto.setCodigo(10);
			pto.setPreco(2599.90);
			pto.setQuantidade(1);
			pto.setTitulo("Livro - Web Services RESTful");
			listaProduto.add(pto);
			
			pto = new ProdutoTO();
			pto.setCodigo(11);
			pto.setPreco(39.92);
			pto.setQuantidade(1);
			pto.setTitulo("Livro - SCRUM: a arte de fazer o dobro do trabalho na metade do tempo");
			listaProduto.add(pto);
		}
	
	}
	
	public List<ProdutoTO> select(){
		return listaProduto;
	}
		
	public ProdutoTO select(int id){
		for (int i = 0; i < listaProduto.size(); i++) {
			if(listaProduto.get(i).getCodigo() == id) {
				return listaProduto.get(i);
			}
		}
		return null;
	}
	
	public boolean insert(ProdutoTO produto) {
		if(produto != null) {
			return listaProduto.add(produto);
		}else {
			return false;
		}
	}

	public boolean update(ProdutoTO produto) {
		
		for (int i = 0; i < listaProduto.size(); i++) {
			if(listaProduto.get(i).getCodigo() == produto.getCodigo()) {
				listaProduto.set(i,produto);
			}
		}
		return false;
	}
		
	public void delete(int cod) {	
		ProdutoTO p = select(cod);
		listaProduto.remove(p);
	}

}
