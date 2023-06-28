package conta;

public class criaConta {
	public static void main(String[] args) {
		conta primeiraConta =  new conta();
		primeiraConta.saldo = 200.00;
		System.out.println("Primeira conta possui o saldo de R$" + primeiraConta.saldo);
		
		
		conta segundaConta = new conta();
		segundaConta.saldo = 20.00;
		System.out.println("Segunda conta possui o saldo de R$" + segundaConta.saldo);
		
		
		segundaConta = primeiraConta;
		System.out.println("Referenciando a segunda com a primeira conta, agora ambas possuem o saldo de R$" + segundaConta.saldo);
	}
}