package bytebankheredado;

import bytebankheredado.modelo.Cuenta;
import bytebankheredado.modelo.CuentaAhorros;
import bytebankheredado.modelo.SaldoInsuficienteExcepcion;

public class TestCuentaExceptionSaldo {

	public static void main(String[] args) {

		Cuenta cuenta = new CuentaAhorros(123, 456);
		cuenta.depositar(210);
		try {
			cuenta.retirar(200);
			cuenta.retirar(10);
		} catch (SaldoInsuficienteExcepcion e) {
			e.printStackTrace();
		}

	}

}
