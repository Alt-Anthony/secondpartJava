package bytebankheredado;

public class CuentaCorriente extends Cuenta {

	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean retirar(double saldo) {
		double comision = 0.2;
		return super.retirar(saldo + comision);
	}

	@Override
	public void depositar(double valor) {
		super.saldo += valor;
		
	}
	
	
}
	