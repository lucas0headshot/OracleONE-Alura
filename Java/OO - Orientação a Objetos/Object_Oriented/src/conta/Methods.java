package conta;

public class Methods {
	public static void main(String[] args) {
		Conta contaDoLucas = new Conta();
		contaDoLucas.deposita(50);
		System.out.println("Foram depositados: " + contaDoLucas.saldo + "R$");
		
		boolean conseguiuSacar = contaDoLucas.saca(25);
		if (conseguiuSacar) {
			System.out.println("Saque realizado com sucesso!");
			System.out.println("Saldo atual: " + contaDoLucas.saldo);
		} else {
			System.out.println("Saldo insuficiente");
		}
	}
}