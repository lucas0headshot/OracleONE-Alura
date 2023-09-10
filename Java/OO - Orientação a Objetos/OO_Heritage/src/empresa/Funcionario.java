package empresa;

public class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	
	
	
	//Constructor
//	public Funcionario(String nome, String cpf, double salario) {
//		this.nome = nome;
//		this.cpf = cpf;
//		this.salario = salario;
//		
//		System.out.println("Funcionário criado com sucesso!");
//	}
 	
	
	//Methods
	public double getBonificacao() {
		return this.salario * 0.05;
	}
	
	
	//Getters
	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public double getSalario() {
		return salario;
	}


	//Setters
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}