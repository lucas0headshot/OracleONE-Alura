package br.com.lucasbank.conta.teste;

import br.com.lucasbank.conta.modelo.*;

public class TesteObject {
	public static void main(String[] args) {
		Object contaCorrente = new ContaCorrente(156, 651);
		Object contaPoupanca = new ContaPoupanca(157, 751);
		
		
		
		System.out.println(contaCorrente);
		System.out.println(contaPoupanca);
	}
}