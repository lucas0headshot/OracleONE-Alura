package empresa;

public class Gerente extends Funcionario {
	private Integer senha;
	
	
	
	//Constructor
//	public Gerente(String nome, String cpf, double salario) {
//		this.nome = nome;
//		this.cpf = cpf;
//		this.salario = salario;
//		
//		System.out.println("Funcionário criado com sucesso!");
//	}
 	
	
	//Methods
//	public double getBonificacao() {
//		return this.salario * 0.1;
//	}
	
	public boolean autentica(int senha) {
		return this.senha.equals(senha);
	}
	
	
	//Getters


	//Setters
	public void setSenha(Integer senha) {
		this.senha = senha;
	}
}