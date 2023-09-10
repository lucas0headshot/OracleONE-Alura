package empresa;

public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario lucas = new Gerente();
		
		System.out.println("Bonificação: " + lucas.getBonificacao());
	}
}