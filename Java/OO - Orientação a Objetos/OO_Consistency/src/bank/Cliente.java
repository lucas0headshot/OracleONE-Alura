package bank;

public class Cliente {
	private String nome;
	private String cpf;
	private String profissao;
	
	
	
	//Getters
	public String getCpf() {
		return this.cpf;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getProfissao() {
		return this.profissao;
	}
	
	
	//Setters
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
}