package br.com.lucasbank.conta.teste;

import br.com.lucasbank.conta.modelo.*;

public class TesteTributaveis {
	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente(158, 851);
		contaCorrente.deposita(100.00);
		
		
		SeguroVida seguro = new SeguroVida();
		
		
		CalculadorImposto calculadorImposto = new CalculadorImposto();
		calculadorImposto.registra(contaCorrente);
		calculadorImposto.registra(seguro);
		
		
		
		System.out.println(calculadorImposto.getTotalImposto());
	}
}