package br.com.lucasbank.conta.especial;

import br.com.lucasbank.conta.modelo.Conta;


/**
 * Classe ContaEspecial estende Conta
 * 
 * @author Lucas
 */
public class ContaEspecial extends Conta {
	/** 
	 * Constructor da classe ContaEspecial
	 * Usa constructor da classe Conta
	 * 
	 * @param numero
	 * @param agencia
	 */
	public ContaEspecial(int numero, int agencia) {
		super(numero, agencia);
	}

	
	@Override
	public void deposita(double valor) {	
	}
}