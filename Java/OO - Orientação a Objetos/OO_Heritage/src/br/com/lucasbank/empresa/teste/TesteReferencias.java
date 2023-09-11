package br.com.lucasbank.empresa.teste;

import br.com.lucasbank.empresa.modelo.*;

public class TesteReferencias {
	public static void main(String[] args) {
		Funcionario gerente = new Gerente();
		gerente.setNome("Lucas");
		gerente.setSalario(1200.00);
		
		Funcionario gerente2 = new Gerente();
		gerente2.setSalario(600.00);
		
		
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gerente);
		controle.registra(gerente2);
		
		
		System.out.println(controle.getSoma());
	}
}