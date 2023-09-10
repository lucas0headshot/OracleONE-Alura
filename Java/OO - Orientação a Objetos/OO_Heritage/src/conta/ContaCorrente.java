package conta;

public class ContaCorrente extends Conta implements Tributavel {
	public ContaCorrente(int numero, int agencia) {
		super(numero, agencia);
	}
	
	
	@Override
	public boolean saca(double valor) {
		return super.saca(valor + 0.2);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;	
	}


	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
}