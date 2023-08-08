package bank;

public class References {
	public static void main(String[] args) {
		Conta primeiraConta =  new Conta();
		primeiraConta.saldo = 200.00;
		System.out.println("Primeira conta possui o saldo de R$" + primeiraConta.saldo);
		
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 20.00;
		System.out.println("Segunda conta possui o saldo de R$" + segundaConta.saldo);
		
		
		segundaConta = primeiraConta;
		System.out.println("Referenciando a segunda com a primeira conta, agora ambas possuem o saldo de R$" + segundaConta.saldo);
	}
}