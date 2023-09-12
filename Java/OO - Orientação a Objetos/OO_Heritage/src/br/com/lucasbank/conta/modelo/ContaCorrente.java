package br.com.lucasbank.conta.modelo;

/**
 * Classe ContaCorrente estende Conta e implementa Tributavel
 * 
 * @author Lucas
 */
public class ContaCorrente extends Conta implements Tributavel {
	/** 
	 * Constructor da classe ContaCorrente
	 * Usa constructor da classe Conta
	 * 
	 * @param numero
	 * @param agencia
	 */
	public ContaCorrente(int numero, int agencia) {
		super(numero, agencia);
	}
	
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		super.saca(valor + 0.2);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;	
	}


	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
}