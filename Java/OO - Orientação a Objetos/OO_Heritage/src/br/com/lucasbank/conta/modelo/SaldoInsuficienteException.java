package br.com.lucasbank.conta.modelo;

/**
 * Classe de exceção SaldoInsuficienteException estende Exception
 * Checked
 * 
 * @author Lucas
 */
public class SaldoInsuficienteException extends Exception {
	/**
	 * Constructor da classe SaldoInsuficienteException
	 * Usa constructor de Msg da classe Exception
	 * 
	 * @param msg
	 */
	public SaldoInsuficienteException(String msg) {
		super(msg);
	}
}