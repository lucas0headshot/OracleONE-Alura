package conta;

public class ContaCorrente extends Conta {
	public ContaCorrente(int numero, int agencia) {
		super(numero, agencia);
	}
	
	@Override
	public boolean saca(double valor) {
		return super.saca(valor + 0.2);
	}
}