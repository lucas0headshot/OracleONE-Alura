package executionStack;

public class TesteContaComExcecaoChecked {
	public static void main(String[] args) {
		Conta conta = new Conta();
		
		try {
			conta.doposita();
		} catch (Exception exception) {
			System.out.println("Exceção lançada e tratada!");
		}
	}
}