package br.com.fiap.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.bo.ProdutoBO;
import br.com.fiap.to.ProdutoTO;

@WebServlet(urlPatterns="/buscar")
public class BuscarServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ProdutoTO produto = new ProdutoTO();
		ProdutoBO bo = new ProdutoBO();
		
		produto.setCodigo(Integer.parseInt(req.getParameter("codigo")));
		req.setAttribute("busca", bo.getService(produto.getCodigo()));
		
		
		RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
		rd.forward(req, resp);
	}

}
