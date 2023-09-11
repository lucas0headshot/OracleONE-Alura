package br.com.lucasbank.conta.modelo;

public class CalculadorImposto {
	private double totalImposto;
	
	
	
	//Methods
	public void registra(Tributavel tributavel) {
		this.totalImposto += tributavel.getValorImposto();
	}
	
	
	//Getters
	public double getTotalImposto() {
		return this.totalImposto;
	}
}