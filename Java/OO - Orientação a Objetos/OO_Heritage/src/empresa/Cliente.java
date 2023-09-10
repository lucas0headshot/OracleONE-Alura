package empresa;

public class Cliente implements Autenticavel {
	private Autenticador autenticador;
	
	
	
	public Cliente() {
		this.autenticador = new Autenticador();
	}
	
	
	@Override
	public boolean autentica(int senha)  {
		return this.autenticador.autentica(senha);
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
}