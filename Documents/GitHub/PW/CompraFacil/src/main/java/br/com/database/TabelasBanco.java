package br.com.database;

import java.sql.Connection;
import java.sql.ResultSet;

public class TabelasBanco {
		
		//Referência para uma conexão com o banco de dados.
		private Connection conexao;
		

		
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

		public void criarTabelaDeUsuario() {
			System.out.println("  Criando tabela de usuário...");
			String sql = "" +
			"create table usuario (" +
			"  usuario varchar(50) not null," +
			"  senha varchar(50) not null," +
			"  tipo varchar(50) not null," +
			"  constraint pk_usuario primary key (usuario) " +
			")";
			try { 
				
				conexao.createStatement().execute(sql); // criando instancia do banco, para execução 
				
			} catch(Exception e) {
				throw new RuntimeException("Erro ao criar a tabela de usuário.", e);
			}
		}
		
		public void incluirAdm() {
			System.out.println("  Incluindo admin...");
			String sql = "insert into usuario (usuario, senha, tipo) values ('admin', 'admin', 'admin')";
			try {
				conexao.createStatement().execute(sql);  // criando instancia do banco, para execução
			} catch(Exception e) {
				throw new RuntimeException("Erro ao incluir o Usuario 1.", e);
			}

		}
		
		public void mostrarAdm() {
			System.out.println("  Mostrando adm...");
			String sql = "select usuario, senha from usuario";
			try {
				
				
				ResultSet rs = conexao.createStatement().executeQuery(sql); // criando instancia do banco, para execução
				
				
				while (rs.next()) {
					String usuario = rs.getString("usuario");
					String senha = rs.getString("senha");
					
					System.out.println("    " + usuario + 
									   " - " + senha);
					
					
				}
				
			} catch(Exception e) {
				throw new RuntimeException("Erro ao mostrar os usuários da tabela.", e);
			}
		}		
}
