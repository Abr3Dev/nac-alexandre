package br.com.fiap.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.application.Cadastro;
import br.com.fiap.to.ProdutoTO;

@WebServlet(urlPatterns = "/cadastrar")
public class CadastroServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ProdutoTO produto = new ProdutoTO();
		Cadastro cadastro = new Cadastro();
		
		produto.setCodigo(Integer.parseInt(req.getParameter("codigo")));
		produto.setTitulo(req.getParameter("titulo"));
		produto.setPreco(Double.parseDouble(req.getParameter("preco")));
		produto.setQuantidade(Integer.parseInt(req.getParameter("quantidade")));
		
		String link = cadastro.postService(produto) == 201 ? "sucesso.jsp" : "falha.jsp";
		
		RequestDispatcher rd;
		rd = req.getRequestDispatcher(link);
		rd.forward(req, resp);
	}
}
