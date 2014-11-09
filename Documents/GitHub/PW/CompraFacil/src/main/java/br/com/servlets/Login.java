package br.com.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logado")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuario = request.getParameter("user");
		String senha = request.getParameter("senha");
		
		String login = validaLogin(usuario, senha);
		//*************** teste sessão *****************
		// Armazena o nome do funcionario logado
		 
		HttpSession session=request.getSession(true);
		session.setAttribute("user",usuario);
		//***************fim sessão **********************
		if(login.equals("err")){
			request.setAttribute("falha", "Usuario e/ou senha incorretos");
			request.getRequestDispatcher("login.jsp").forward(request, response);
			
		}
		else if(login.equals("func")){
			request.getRequestDispatcher("home.html").forward(request, response);
		}
		else if(login.equals("admin")){
			request.getRequestDispatcher("homeAdm.jsp").forward(request, response);
		}
	}
	
	public String validaLogin(String user, String senha){
		if(user.equals("func") && senha.equals("func")){
			return "func";
		}
		else if(user.equals("admin") && senha.equals("admin123")){
			return "admin";
		}
			return "err";

	}

}
