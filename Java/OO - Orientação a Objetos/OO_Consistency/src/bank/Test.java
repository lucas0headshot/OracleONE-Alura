package bank;

public class Test {
	public static void main(String[] args) {
		//Instancia Cliente
		Cliente cliente = new Cliente();
		
		//Seta atribuitos do Cliente
		cliente.setCpf("123.456.789-12");
		cliente.setNome("Lucas");
		cliente.setProfissao("Dev. FullStack");
		
		
		//Instancia Conta
		Conta conta = new Conta(156, 561);
		Conta conta2 = new Conta(157, 571);
		Conta conta3 = new Conta(158, 581);
		conta.deposita(1000);
		
		//Referencia Conta.titular para o Cliente lucas
		conta.setTitular(cliente);
		
		
		
		System.out.println("Conta: " + conta);
		System.out.println("Cliente: " + cliente.getNome());
		System.out.println("Titular da conta: " + conta.getTitular().getNome());
		
		System.out.println("Atualmente, existem " + Conta.getTotal() + " contas instanciadas");
	}
}