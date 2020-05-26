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

@WebServlet(urlPatterns = "/atualizar")
public class AtualizaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse response)
			throws ServletException, IOException {
		
		ProdutoTO produto = new ProdutoTO();
		Atualizar atualizar = new Atualizar();

		produto.setCodigo(Integer.parseInt(req.getParameter("codigo")));
		produto.setTitulo(req.getParameter("titulo"));
		produto.setPreco(Double.parseDouble(req.getParameter("preco")));
		produto.setQuantidade(Integer.parseInt(req.getParameter("quantidade")));

		
		String link = atualizar.putService(produto) == 200 ? "sucesso.jsp" : "falha.jsp";
		
		RequestDispatcher rd;
		req.setAttribute("sucesso", "Atualização concluida com sucesso."); 
		req.setAttribute("falha", "Falha ao atualizar, tente novamente.");
		rd = req.getRequestDispatcher(link);
		rd.forward(req, response);

	}

}
