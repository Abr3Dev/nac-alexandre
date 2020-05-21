package br.com.fiap.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.application.Remocao;


@WebServlet(urlPatterns = "/deletar")
public class RemoveServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Remocao remocao = new Remocao();
		
		int remove = remocao.deleteService(5);
		
		String link = remove == 204 ? "sucesso.jsp" : "falha.jsp";
		
		RequestDispatcher rd;
		rd = req.getRequestDispatcher(link);
		rd.forward(req, resp);
		
	}
}
