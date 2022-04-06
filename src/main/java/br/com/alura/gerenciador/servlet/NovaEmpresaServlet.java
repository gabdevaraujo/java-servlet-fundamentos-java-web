package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.servlet.modelo.Banco;
import br.com.alura.gerenciador.servlet.modelo.Empresa;


@WebServlet("/novaempresa")
public class NovaEmpresaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Nova Empresa");
		String nomeEmpresa = request.getParameter("nome");
		String dataAbertura = request.getParameter("dataAbertura");
		Empresa empresa = new Empresa();
		
		System.out.println(dataAbertura);
		
		Date dateAb = null;
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dateAb = sdf.parse(dataAbertura);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dateAb);
		
		Banco banco = new Banco();
		banco.addEmpresa(empresa);
		
		response.sendRedirect("listarempresas");
		
		//Chamar o JSP
//		RequestDispatcher rd = request.getRequestDispatcher("/listarempresas");
//		request.setAttribute("empresa", empresa);
//		rd.forward(request, response);
	}

}
