package br.com.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.database.MetodosBanco;

@WebServlet("/cadastro_usuario")
public class ServletCadastroUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuario = request.getParameter("username");
		String senha = request.getParameter("password");
		MetodosBanco banco = new MetodosBanco();
	//	banco.obterConexaoComOBancoDeDados();
	//	banco.criarTabelaDeUsuario();
		banco.incluirUsuarios(usuario,senha);
		banco.mostrarUsuarios();
		
		
		request.getRequestDispatcher("homeAdm.jsp").forward(request, response);
	}
	

}
