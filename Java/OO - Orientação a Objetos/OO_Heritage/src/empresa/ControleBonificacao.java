package empresa;

public class ControleBonificacao {
	private double soma = 0.00;
	
	
	
	//Methods	
	public void registra(Funcionario funcionario) {
		this.soma += funcionario.getBonificacao();
	}
	
	
	//Getters
	public double getSoma() {
		return soma;
	}
}