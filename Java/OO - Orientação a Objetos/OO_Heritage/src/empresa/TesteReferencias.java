package empresa;

public class TesteReferencias {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setNome("Lucas");
		gerente.setSalario(1200.00);
		
		Funcionario funcionario = new Funcionario();
		funcionario.setSalario(600.00);
		
		
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gerente);
		controle.registra(funcionario);
		
		
		System.out.println(controle.getSoma());
	}
}