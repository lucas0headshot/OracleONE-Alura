package br.com.lucasbank.empresa.teste;

import br.com.lucasbank.empresa.modelo.*;

public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario lucas = new Gerente();
		
		System.out.println("Bonificação: " + lucas.getBonificacao());
	}
}