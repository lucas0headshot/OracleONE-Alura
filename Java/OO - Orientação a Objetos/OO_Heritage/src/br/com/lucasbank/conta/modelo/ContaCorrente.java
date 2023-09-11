package br.com.lucasbank.conta.modelo;

public class ContaCorrente extends Conta implements Tributavel {
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