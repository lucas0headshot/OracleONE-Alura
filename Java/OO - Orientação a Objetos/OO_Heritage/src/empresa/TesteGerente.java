package empresa;

public class TesteGerente {
	public static void main(String[] args) {
		Gerente lucas = new Gerente();
		lucas.setNome("Lucas");
		lucas.setCpf("12345678910");
		lucas.setSalario(1200.00);
		lucas.setSenha(123);
		
		System.out.println(lucas.getNome());
		System.out.println(lucas.autentica(123) ? "Autenticado com sucesso!" : "Autenticação falhou!");
		System.out.println("Bonificação: " + lucas.getBonificacao());
	}
}