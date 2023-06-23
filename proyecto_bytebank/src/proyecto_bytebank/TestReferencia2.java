package proyecto_bytebank;

public class TestReferencia2 {

	public static void main(String[] args) {
		
		Cliente diego = new Cliente();
		diego.nombre = "Diego";
		diego.documento = "333333";
		diego.telefono = "90319234";
		
		
		Cuenta cuentadeDiego = new Cuenta();
		cuentadeDiego.agencia = 1;
		cuentadeDiego.titular = diego;
		
		System.out.println(cuentadeDiego.titular.documento);
		System.out.println(cuentadeDiego.titular);
	}
	
}
