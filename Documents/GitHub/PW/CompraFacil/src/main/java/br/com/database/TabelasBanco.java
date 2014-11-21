package br.com.database;

import java.sql.ResultSet;

public class TabelasBanco {
		
		//Referência para uma conexão com o banco de dados.
		ConexaoBanco connection = new ConexaoBanco();
		
		public void criarTabelaDeUsuario() {
			System.out.println("  Criando tabela de usuário...");
			String sql = "" +
			"create table usuario (" +
			"  usuario varchar(50) not null," +
			"  senha varchar(50) not null," +
			"  tipo varchar(50) ," +
			"  constraint pk_usuario primary key (usuario) " +
			")";
			try { 
				
				connection.conexao.createStatement().execute(sql); // criando instancia do banco, para execução 
				
			} catch(Exception e) {
				throw new RuntimeException("Erro ao criar a tabela de usuário.", e);
			}
		}
		
		public void incluirAdm() {
			System.out.println("  Incluindo admin...");
			String sql = "insert into usuario (usuario, senha, tipo) values ('admin', 'admin', 'admin')";
			try {
				connection.conexao.createStatement().execute(sql);  // criando instancia do banco, para execução
			} catch(Exception e) {
				throw new RuntimeException("Erro ao incluir o Usuario 1.", e);
			}

		}
		
		public void mostrarAdm() {
			System.out.println("  Mostrando adm...");
			String sql = "select usuario, senha from usuario";
			try {
				
				
				ResultSet rs = connection.conexao.createStatement().executeQuery(sql); // criando instancia do banco, para execução
				
				
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

		public ResultSet verificaLoguin(){
			String sql = "select usuario, senha from usuario";
			ResultSet rs;
			try {
				
				
				 rs = connection.conexao.createStatement().executeQuery(sql); // criando instancia do banco, para execução
				
				
			} catch(Exception e) {
				throw new RuntimeException("erro na consulta.", e);	
			}
			return rs;
		}
		
		
		
}
