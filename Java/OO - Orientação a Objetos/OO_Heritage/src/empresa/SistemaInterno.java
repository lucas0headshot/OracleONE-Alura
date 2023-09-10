package empresa;

public class SistemaInterno {
	private Integer senha = 156;
	
	
	
	public void autentica(Autenticavel functionarioAutenticavel) {
		System.out.println(functionarioAutenticavel.autentica(this.senha) ? "Acesso liberado!" : "Acesso negado!");
	}
}