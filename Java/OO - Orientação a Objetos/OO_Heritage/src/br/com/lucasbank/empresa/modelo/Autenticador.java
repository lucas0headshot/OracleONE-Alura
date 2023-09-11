package br.com.lucasbank.empresa.modelo;

public class Autenticador {
	private Integer senha;
	
	
	
	public boolean autentica(int senha)  {
		return this.senha.equals(senha);
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
}