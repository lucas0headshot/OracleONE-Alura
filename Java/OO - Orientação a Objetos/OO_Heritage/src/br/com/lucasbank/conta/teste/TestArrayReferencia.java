package br.com.lucasbank.conta.teste;

import br.com.lucasbank.conta.modelo.ContaCorrente;

public class TestArrayReferencia {

	public static void main(String[] args) {
		ContaCorrente[] contas = new ContaCorrente[5];
		
		ContaCorrente cc1 = new ContaCorrente(145, 541);
		contas[0] = cc1;
		
		ContaCorrente cc2 = new ContaCorrente(156, 651);
		contas[1] = cc2;
		
		
		
		System.out.println(contas[0]);
	}
}