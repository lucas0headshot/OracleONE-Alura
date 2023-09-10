package empresa;

public class Gerente extends Funcionario implements Autenticavel {
	private Autenticador autenticador;
	
	
	
	//Constructor
	public Gerente() {
		this.autenticador = new Autenticador();
	}
	
	
	//Methods
	public double getBonificacao() {
		return super.getSalario();
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