package br.com.lucasbank.conta.modelo;

public class ContaPoupanca extends Conta {
	public ContaPoupanca(int numero, int agencia) {
		super(numero, agencia);
	}
	
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;	
	}
}