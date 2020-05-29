package br.com.fiap.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.bo.ProdutoBO;

@WebServlet(urlPatterns = "/deletar")
public class RemoveServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ProdutoBO bo = new ProdutoBO();
		
		int remove = bo.deleteService(Integer.parseInt(req.getParameter("codigo")));
		
		String link = remove == 204 ? "sucesso.jsp" : "falha.jsp";
		
		req.setAttribute("sucesso", "Produto deletado com sucesso."); 
		req.setAttribute("falha", "Falha ao deletar o produto, tente novamente.");
		
		RequestDispatcher rd;
		rd = req.getRequestDispatcher(link);
		rd.forward(req, resp);	
	}
}
