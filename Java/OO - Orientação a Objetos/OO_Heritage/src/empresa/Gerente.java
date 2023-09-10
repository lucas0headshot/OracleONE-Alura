package empresa;

public class Gerente extends Funcionario implements Autenticavel {
	private Integer senha;
	
	
	
	//Methods
	public double getBonificacao() {
		return super.getSalario();
	}

	
	@Override
	public boolean autentica(int senha)  {
		return this.senha.equals(senha);
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}
}