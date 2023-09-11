package conta;

public abstract class Conta {
	protected double saldo;
	private int numero;
	private int agencia;
	private Cliente titular;
	private static int total = 0;
	
	
	
	//Constructor
	public Conta(int numero, int agencia) {
		Conta.total++;
		this.numero = numero;
		this.agencia = agencia;
		
		System.out.println("Conta criada com sucesso!");
	}
	
	
	//Methods
	public abstract void deposita(double valor);
	
	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
		
		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
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