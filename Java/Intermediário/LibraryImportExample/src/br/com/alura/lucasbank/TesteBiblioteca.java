package br.com.alura.lucasbank;

import br.com.lucasbank.conta.modelo.*;

public class TesteBiblioteca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(156, 651);
		
		conta.deposita(100.00);
		
		
		
		System.out.println("Saldo: " + conta.getSaldo());
	}

}
