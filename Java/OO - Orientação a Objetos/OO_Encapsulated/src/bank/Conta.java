package bank;

public class Conta {
	private double saldo;
	private int numero;
	private int agencia;
	private Cliente titular;
	
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		
		return false;
	}
	
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public String getTitular() {
		return (this.titular == null) ? "Não possui titular" : this.titular;
	}
	
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
}