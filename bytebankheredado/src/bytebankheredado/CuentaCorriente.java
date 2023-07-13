package bytebankheredado;

public class CuentaCorriente extends Cuenta {

	public CuentaCorriente(int i, int j) {
		// TODO Auto-generated constructor stub
	}

	public void depositar(int i) {
		// TODO Auto-generated method stub

	}

	public void transferir(int i, CuentaAhorros ca) {
		// TODO Auto-generated method stub

	}

	public void retirar(double saldo) throws SaldoInsuficienteExcepcion {
		double comision = 0.2;
		super.retirar(saldo + comision);
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;

	}

}
