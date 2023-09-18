package br.com.lucasbank.conta.teste;

import javax.swing.*;

public class TestArrayPrimitivo {

	public static void main(String[] args) {
		byte[] idades = new byte[5];
		
		
		for(int i = 0; i < idades.length; i++) {
			String input = JOptionPane.showInputDialog(null, "Digite a " + (i + 1) + "ª idade");
			 
            try {
            	idades[i] = Byte.parseByte(input);
            } catch (NumberFormatException e) {
            	JOptionPane.showMessageDialog(null, "Entrada inválida! Digite um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
                i--;
            }
		}
	}
}