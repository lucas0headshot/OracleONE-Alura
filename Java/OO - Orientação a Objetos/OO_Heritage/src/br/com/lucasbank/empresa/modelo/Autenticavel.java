package br.com.lucasbank.empresa.modelo;

public abstract interface Autenticavel {	
	//Methods
	public abstract boolean autentica(int senha);
	
	
	//Setters
	public abstract void setSenha(int senha);
}