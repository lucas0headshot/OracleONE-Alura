package empresa;

public class Gerente extends Funcionario {
	private Integer senha;
	
 	
	
	//Methods
	public double getBonificacao() {
		return super.getBonificacao() +  super.getSalario();
	}
	
	public boolean autentica(int senha) {
		return this.senha.equals(senha);
	}
	
	
	//Getters


	//Setters
	public void setSenha(Integer senha) {
		this.senha = senha;
	}
}