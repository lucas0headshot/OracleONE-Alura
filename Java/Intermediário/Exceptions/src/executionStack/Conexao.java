package executionStack;

public class Conexao implements AutoCloseable {
	public Conexao() {
		System.out.println("Conexão aberta!");
	}
	
	
	public void leDados() {
		System.out.println("Recebeu dados!");
		throw new IllegalStateException();
	}


	@Override
	public void close() {
		System.out.println("Conexão fechada!");
	}
}