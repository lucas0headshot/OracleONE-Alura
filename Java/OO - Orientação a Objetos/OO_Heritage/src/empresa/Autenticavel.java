package empresa;

public abstract interface Autenticavel {	
	//Methods
	public abstract boolean autentica(int senha);
	
	
	//Setters
	public abstract void setSenha(int senha);
}