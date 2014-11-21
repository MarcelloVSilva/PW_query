package br.com.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.database.ConexaoBanco;
import br.com.database.MetodosBanco;
import br.com.database.TabelasBanco;
import br.com.modelo.LoginVerifica;

@WebServlet("/logado")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		LoginVerifica login = new LoginVerifica();
		TabelasBanco iniciarbanco = new TabelasBanco();
		if(iniciarbanco.criarTabelaDeUsuario()){
			iniciarbanco.criarTabelaDeUsuario();
			iniciarbanco.incluirAdm();
			iniciarbanco.mostrarAdm();
		}
		
		// iniciando banco de dados e gerando tabela e login de adm
		
		java.sql.ResultSet teste = iniciarbanco.verificaLoguin();
		//
		
		login.setLogin(request.getParameter("usuario"));
		login.setSenha(request.getParameter("senha"));
		
		//request
		//.getRequestDispatcher("formPedido.jsp")
		//.forward(request, response);
		
		try{
			
		while(teste.next()){
			
		System.out.println(	teste.getString("usuario") );
		System.out.println(	teste.getString("senha") );
		if(teste.getString("usuario").equals(login.getLogin()) && teste.getString("senha").equals(login.getSenha()) && teste.getString("tipo").equals(login.getTipo())){
			
			request
			.getRequestDispatcher("homeAdm.jsp")
			.forward(request, response);
		}
		
		else{
			
			
			request
			.getRequestDispatcher("home.html")
			.forward(request, response);
		
		 }

			}
		}catch(Exception e){
			System.out.println(e);
			}
         
        
	}

}