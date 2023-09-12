package br.com.lucasbank.conta.modelo;

/**
 * Classe CalculadorImposto
 * 
 * @author Lucas
 */
public class CalculadorImposto {
	private double totalImposto;
	
	
	
	/**
	 * Método registra() da classe CalculadorImposto
	 * Calcula valor total de imposto
	 * 
	 * @param tributavel
	 */
	public void registra(Tributavel tributavel) {
		this.totalImposto += tributavel.getValorImposto();
	}
	
	
	//Getters
	public double getTotalImposto() {
		return this.totalImposto;
	}
}