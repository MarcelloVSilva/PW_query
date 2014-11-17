package br.com.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.database.LoginBanco;
import br.com.database.MetodosBanco;
import br.com.database.TabelasBanco;
import br.com.modelo.LoginVerifica;

@WebServlet("/logado")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		LoginBanco verifica = new LoginBanco();
		LoginVerifica login = new LoginVerifica();
		TabelasBanco banco = new TabelasBanco();
		banco.obterConexaoComOBancoDeDados();
		banco.criarTabelaDeUsuario();
		banco.incluirAdm();
		login.setLogin(request.getParameter("usuario"));
		login.setSenha(request.getParameter("senha"));
		
		if (verifica.verificar(login) == true ){
			
			
			request
			.getRequestDispatcher("formPedido.jsp")
			.forward(request, response);
	         
		}else{
			
			request
			.getRequestDispatcher("login.jsp")
			.forward(request, response);
		}
         
        
        
	}

}