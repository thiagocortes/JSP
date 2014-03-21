package br.com.thiagocortes.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServTabuada
 */
@WebServlet("/ServTabuada")
public class ServTabuada extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServTabuada() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String numeros = request.getParameter("numero_1");
		int numero;
		
		if(numeros != ""){
			numero = Integer.parseInt(numeros);
			request.setAttribute("numero", numero);
			request.getRequestDispatcher("exibir_tabuada.jsp").forward(request, response);
		}
		else{
			PrintWriter printar = new PrintWriter("");
			printar.print("Você precisa prencher o campo com um numero válido.");
		}
		
		
	}

}
