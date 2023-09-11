package conta;

public class Test {
	public static void main(String[] args) throws SaldoInsuficienteException {
		ContaCorrente contaCorrente = new ContaCorrente(156, 651);
		contaCorrente.deposita(100.00);
		
		ContaPoupanca contaPoupanca = new ContaPoupanca(157, 751);
		contaPoupanca.deposita(100.00);
		
		
		contaCorrente.transfere(90.00, contaPoupanca);
		
		
		
		System.out.println("ContaCorrente: " + contaCorrente.getSaldo());
		System.out.println("ContaPoupança: " + contaPoupanca.getSaldo());
	}
}