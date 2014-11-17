package br.com.database;



import java.sql.Connection;
import java.sql.ResultSet;

import br.com.modelo.LoginVerifica;


public class LoginBanco {
	
	public boolean verificar(LoginVerifica verifica) {
		
		MetodosBanco banco = new MetodosBanco();
		boolean resultado = false;
	    ResultSet sql;
	    
	    try {
	        
	    	sql = banco.verificaLoguin();
			
	    	while (sql.next()) {
				if(sql.getString("usuario").equals(verifica.getLogin()) && sql.getString("senha").equals(verifica.getSenha())){
					resultado = true;
					break;
				}else
				{
					resultado = false;
				}
				
			}
				
	}catch (Exception  e){
		System.out.println("Erro na verificacao" + e);
		
	}
	return resultado;
}}
