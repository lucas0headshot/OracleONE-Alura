package empresa;

public class TesteSistema {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setSenha(156);
		
		
		Administrador adm = new Administrador();
		adm.setSenha(155);
		
		
		Cliente cliente = new Cliente();
		cliente.setSenha(156);
		
		SistemaInterno sistemaInterno = new SistemaInterno();
		sistemaInterno.autentica(gerente);
		sistemaInterno.autentica(adm);
		sistemaInterno.autentica(cliente);           
	}
}