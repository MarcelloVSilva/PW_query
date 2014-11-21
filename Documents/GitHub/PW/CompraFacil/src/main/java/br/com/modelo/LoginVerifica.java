package br.com.modelo;

public class LoginVerifica {
	
	private String login;
	private String senha;
	private String tipo = "admin";
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public void getTipo(String tipo){
		this.tipo = tipo;
	}
	public String getTipo() {
		return tipo;
	}
}