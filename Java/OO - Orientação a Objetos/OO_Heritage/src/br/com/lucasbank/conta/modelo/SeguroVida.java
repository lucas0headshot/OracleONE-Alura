package br.com.lucasbank.conta.modelo;

public class SeguroVida implements Tributavel {
	@Override
	public double getValorImposto() {
		return 156;
	}
}