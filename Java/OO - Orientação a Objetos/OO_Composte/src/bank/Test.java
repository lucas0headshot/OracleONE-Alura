package bank;

public class Test {
	public static void main(String[] args) {
		//Instancia Cliente
		Cliente lucas = new Cliente();
		//Define valor pros atributos do Cliente
		lucas.nome = "Lucas Ronchi";
		lucas.cpf = "111.111.111.11";
		lucas.profissao = "Dev";
		
		
		//Instancia Conta
		Conta contaDoLucas = new Conta();
		contaDoLucas.deposita(1000);
		
		//Referencia Conta.titular para o Cliente lucas
		contaDoLucas.titular = lucas;
		
		
		
		System.out.println("Conta: " + contaDoLucas);
		System.out.println("Cliente: " + lucas);
		System.out.println("Titular da conta: " + contaDoLucas.titular.nome);
	}
}