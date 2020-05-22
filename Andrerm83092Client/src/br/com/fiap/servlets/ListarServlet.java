package br.com.fiap.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.application.Listagem;
import br.com.fiap.to.ProdutoTO;


@WebServlet(urlPatterns = "/listar")
public class ListarServlet extends HttpServlet{


	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Listagem listagem = new Listagem();
		
		for (ProdutoTO p : listagem.getService()) {
			System.out.println("__________________________");
			System.out.println("COD   : " + p.getCodigo());
			System.out.println("NOME  : " + p.getTitulo());
			System.out.println("PREÇO : " + p.getPreco());
			System.out.println("QUANTIDADE : " + p.getQuantidade());
			System.out.println("__________________________");
		}
	}
}
