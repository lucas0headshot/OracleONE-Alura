package bank;

public class Conta {
	private double saldo;
	private int numero;
	private int agencia;
	private Cliente titular;
	private static int total;
	
	
	
	//Constructor
	public Conta(int numero, int agencia) {
		Conta.total++;
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = 100;
		
		System.out.println("Conta criada com sucesso!");
	}

		
	//Methods
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
	
	
	//Getters
	public double getSaldo() {
		return this.saldo;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
	
	//Setters	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
}