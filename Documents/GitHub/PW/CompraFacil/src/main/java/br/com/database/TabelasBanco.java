package br.com.database;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TabelasBanco {
		
		//Referência para uma conexão com o banco de dados.
		ConexaoBanco connection = new ConexaoBanco();
		int cont_inicio;
		
		public Boolean criarTabelaDeUsuario() {
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
				return true;
			} catch(SQLException e) {
				return isExistTable(e);
			}
		}
		
		public Boolean isExistTable(SQLException erro){
			Boolean exists = false;
	        if(erro.getSQLState().equals("X0Y32")) {
	            exists = false;
	        } else {
	            exists = true;
	        }
			return exists;
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
			String sql = "select usuario, senha,tipo from usuario";
			ResultSet rs;
			try {
				
				
				 rs = connection.conexao.createStatement().executeQuery(sql); // criando instancia do banco, para execução
				
				
			} catch(Exception e) {
				throw new RuntimeException("erro na consulta.", e);	
			}
			return rs;
		}
		
		/*public void executa(){
			if(cont_inicio==0){
					criarTabelaDeUsuario();
					incluirAdm();
					mostrarAdm();
					cont_inicio=1;
			}
		}*/
}
