package br.com.fiap.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.application.Atualizar;
import br.com.fiap.application.Listagem;
import br.com.fiap.to.ProdutoTO;

@WebServlet("/atualizar")
public class AtualizaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ProdutoTO produto = new ProdutoTO();
		Atualizar atualizar = new Atualizar();

		produto.setCodigo(5);
		produto.setTitulo("Caixa de Somasasdadsadsadsasdads-BT");
		produto.setPreco(515.99);
		produto.setQuantidade(40);

		
		String link = atualizar.putService(produto) == 200 ? "sucesso.jsp" : "falha.jsp";
		
		RequestDispatcher rd;
		rd = request.getRequestDispatcher(link);
		rd.forward(request, response);

	}

}
