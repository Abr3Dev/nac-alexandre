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
			pto.setPreco(200.99);
			pto.setQuantidade(3);
			pto.setTitulo("microondas");
			listaProduto.add(pto);
			
			pto = new ProdutoTO();
			pto.setCodigo(2);
			pto.setPreco(101.10);
			pto.setQuantidade(10);
			pto.setTitulo("batedeira");
			listaProduto.add(pto);
			
			pto = new ProdutoTO();
			pto.setCodigo(3);
			pto.setPreco(1999.99);
			pto.setQuantidade(10);
			pto.setTitulo("TV 40\"");
			listaProduto.add(pto);
			
			pto = new ProdutoTO();
			pto.setCodigo(4);
			pto.setPreco(50.00);
			pto.setQuantidade(100);
			pto.setTitulo("mouse óptico");
			listaProduto.add(pto);
			
			pto = new ProdutoTO();
			pto.setCodigo(5);
			pto.setPreco(11.99);
			pto.setQuantidade(30);
			pto.setTitulo("bola");
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
