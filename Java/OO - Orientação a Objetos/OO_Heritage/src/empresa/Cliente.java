package empresa;

public class Cliente implements Autenticavel {
	private Integer senha;
	
	
	
	@Override
	public boolean autentica(int senha)  {
		return this.senha.equals(senha);
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}
}