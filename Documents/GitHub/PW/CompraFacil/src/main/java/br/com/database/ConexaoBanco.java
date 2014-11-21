package br.com.database;

import java.sql.Connection;

/**
 * Classe para se obter a conexao com o banco
 * e e que contem também o método para fechar a conexao.
 *
 * @author Grupo
 */
public class ConexaoBanco {
	//criaçao da conexao
	public Connection conexao;
	
	public void obterConexaoComOBancoDeDados() {
		System.out.println("  Obtendo conexão com o banco de dados...");
		//URL de conexão com o banco de dados Derby em memória.
		String url = "jdbc:derby:memory:banco-de-dados;create=true";
		try {
			conexao = java.sql.DriverManager.getConnection(url);	// estabelecendo conexao com o banco
		} catch(Exception e) {
			throw new RuntimeException("Erro ao obter uma conexão com o banco de dados.", e);
		}
	}
	
	public void fecharConexaoComOBancoDeDados() {
		System.out.println("  Fechando conexão com o banco de dados...");
		try {

			conexao.close();
			
		} catch(Exception e) {
			throw new RuntimeException("Erro ao fechar conexão com o banco de dados.", e);
		}
	}
	
	public ConexaoBanco(){
		obterConexaoComOBancoDeDados();
	}
}
