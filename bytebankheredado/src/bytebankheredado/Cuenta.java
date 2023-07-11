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
		System.out.println("Se van creando: " + total + " cuentas");
	}

	public abstract void depositar(double valor);

	public boolean retirar(double saldo) {
		if (this.saldo >= saldo) {
			this.saldo -= saldo;
			return true;
		}
		return false;
	}

	public boolean transferir(double valor, Cuenta cuentaaTransferir) {
		if (this.saldo >= valor) {
			this.retirar(valor);
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
