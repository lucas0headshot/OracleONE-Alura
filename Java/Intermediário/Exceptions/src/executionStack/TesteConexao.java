package executionStack;

public class TesteConexao {
	public static void main(String[] args) {
		try (Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch(Exception exception) {
			System.out.println("Exceção!");
		}
	}
}