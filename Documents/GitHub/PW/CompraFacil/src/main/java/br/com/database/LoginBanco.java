package br.com.database;



import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.modelo.LoginVerifica;


public class LoginBanco {

	MetodosBanco banco = new MetodosBanco();
		
	public boolean verificar(LoginVerifica verifica) {
	    String sql = "SELECT usuario,senha,tipo FROM usuario";
	    boolean resultado = false;
	    ResultSet teste;
	    try {
	        
	    	
	    	
	    	teste = banco.criaSentenca();
			
			while (teste.next()){
				
				if(teste.getString("usuario").equals(verifica.getLogin()) && teste.getString("senha").equals(verifica.getSenha())){
					resultado = true;
					break;
				}else
				{
					resultado = true;
				}
				
			}
				
	}catch (Exception  e){
		System.out.println("Erro na Consulta" + e);
		
	}
	return resultado;
}}
