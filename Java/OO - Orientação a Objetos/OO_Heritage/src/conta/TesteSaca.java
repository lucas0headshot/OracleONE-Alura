package conta;

public class TesteSaca {

	public static void main(String[] args) {
		Conta conta =  new ContaCorrente(156, 651);
		
		conta.deposita(200.00);
		
		try {
			conta.saca(210.00);
		} catch (Exception exception) {
			System.out.println("Exception: " + exception.getMessage());
		}
		
		
		System.out.println(conta.getSaldo());
	}
}