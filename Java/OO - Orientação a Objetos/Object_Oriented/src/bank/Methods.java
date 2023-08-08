package bank;

public class Methods {
	public static void main(String[] args) {
		//Instancia Conta
		Conta contaDoLucas = new Conta();

		contaDoLucas.deposita(50);
		System.out.println("Foram depositados: " + contaDoLucas.saldo + "R$ na conta " + contaDoLucas);
		
		
		if (contaDoLucas.saca(25)) {
			System.out.println("--------------------");
			System.out.println("Saque realizado com sucesso!");
			System.out.println("Saldo atual: " + contaDoLucas.saldo + "R$");
		} else {
			System.out.println("Saldo insuficiente");
		}
		
		
		//Instancia outra Conta
		Conta contaDoRapha = new Conta();
		
		contaDoRapha.deposita(100);
		
		if(contaDoRapha.transfere(100, contaDoLucas)) {
			System.out.println("--------------------");
			System.out.println("Rapha transfereriu 100R$ para " + contaDoLucas + "(Você)!");
			System.out.println("Saldo atual: " + contaDoLucas.saldo + "R$");
		}
	}
}