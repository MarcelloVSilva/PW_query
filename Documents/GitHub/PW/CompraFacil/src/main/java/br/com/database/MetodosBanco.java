package br.com.database;


import java.sql.ResultSet;

/**
 * Classe para testes com um banco de dados.
 *
 * @author Grupo
 */
public class MetodosBanco {
	
	ConexaoBanco connection = new ConexaoBanco();
	public void incluirUsuarios(String usuario, String senha) {
		System.out.println("  Incluindo usuários...");
		String sql = "insert into usuario (usuario, senha) values ('"+usuario+"', '"+usuario+"')";
		try {
			connection.conexao.createStatement().execute(sql);  // criando instancia do banco, para execução
		} catch(Exception e) {
			throw new RuntimeException("Erro ao incluir o Usuario 1.", e);
		}

	}

	public void mostrarUsuarios() {
		System.out.println("  Mostrando usuarios...");
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
