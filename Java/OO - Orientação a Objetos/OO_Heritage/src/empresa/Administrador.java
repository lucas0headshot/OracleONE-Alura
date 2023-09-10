package empresa;

public class Administrador extends Funcionario implements Autenticavel {
	private Integer senha;
	
	
	
	@Override
	public double getBonificacao() {
		return 50;
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