package proyecto_bytebank;

class Cuenta {
	double saldo;
	int agencia;
	int numero;
	Cliente titular = new Cliente();


	public void depositar(double valor) {
		this.saldo += valor;
	}

	public boolean retirar(double saldo) {
		if (this.saldo >= saldo) {
			this.saldo -= saldo;
			return true;
		}
		return false;
	}

	public boolean transferir(double valor, Cuenta cuentaaTransferir) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			cuentaaTransferir.depositar(valor);
			return true;
		} else {
			return false;
		}

	}
}
