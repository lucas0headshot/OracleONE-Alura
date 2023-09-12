package br.com.lucasbank.conta.modelo;

/**
 * Classe SeguroVida implementa Tributavel
 * 
 * @author Lucas 
 */
public class SeguroVida implements Tributavel {
	@Override
	public double getValorImposto() {
		return 156;
	}
}