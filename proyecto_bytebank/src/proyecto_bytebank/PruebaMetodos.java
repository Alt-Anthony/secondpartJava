package proyecto_bytebank;

public class PruebaMetodos {

	public static void main(String[] args) {
		
		Cuenta miCuenta = new Cuenta();
		miCuenta.saldo = 300;
		miCuenta.depositar(200);
		 
		System.out.println(miCuenta.saldo);
		
		miCuenta.retirar(100);	
		System.out.println(miCuenta.saldo);
		
		Cuenta cuentadeJimena = new Cuenta();
		cuentadeJimena.depositar(1000);
		cuentadeJimena.transferir(400, miCuenta);
		System.out.println(miCuenta.saldo);
		System.out.println(cuentadeJimena.saldo);
		
		if (cuentadeJimena.transferir(400, miCuenta)) {
			System.out.println("Transferencia exitosa");
		}
	}
	
}
