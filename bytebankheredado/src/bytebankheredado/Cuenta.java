package bytebankheredado;

public abstract class Cuenta {

	protected double saldo;
	private int agencia = 1;
	private int numero;
	private Cliente titular = new Cliente();

	private static int total;

	public static int getTotal() {
		return Cuenta.total;
	}

	public Cuenta() {

	}

	public Cuenta(int agencia, int numero) {
		if (agencia <= 0) {
			System.out.println("No se permite 0");
			this.agencia = 1;
		} else {
			this.agencia = agencia;
		}
		total++;
		System.out.println("Estoy creando  una cuenta de" + this.agencia);
	}

	public abstract void depositar(double valor);

	public void retirar(double saldo) throws SaldoInsuficienteExcepcion {
		if (this.saldo < saldo) {
			throw new SaldoInsuficienteExcepcion("No tienes saldo");
		}
		this.saldo -= saldo;
		System.out.println("Retiraste " + saldo + " soles de tu cuenta, el total ahora es " + this.saldo);

	}

	public boolean transferir(double valor, Cuenta cuentaaTransferir) {
		if (this.saldo >= valor) {
			try {
				this.retirar(valor);
			} catch (SaldoInsuficienteExcepcion e) {

				e.printStackTrace();
			}
			cuentaaTransferir.depositar(valor);
			return true;
		} else {
			return false;
		}

	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}
}
