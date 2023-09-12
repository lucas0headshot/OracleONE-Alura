package br.com.lucasbank.conta.modelo;

/**
 * Classe ContaPoupanca estende Conta
 * 
 * @author lucas 
 */
public class ContaPoupanca extends Conta {
	/**
	 * Constructor da ContaPoupanca
	 * Usa constructor da Conta
	 * 
	 * @param numero
	 * @param agencia
	 */
	public ContaPoupanca(int numero, int agencia) {
		super(numero, agencia);
	}
	
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;	
	}
}