package java_pila_ejecucion;

public class FlujoConTratamiento {

	public static void main(String[] args) {
		System.out.println("Inicio  main");
		metodo1();
		System.out.println("Fin main");
	}

	private static void metodo1() {
		System.out.println("Inicio metodo1");
		metodo2();
		System.out.println("Fin metodo1");
	}

	private static void metodo2() {
		System.out.println("Incio metodo2");
		ArithmeticException exception = new ArithmeticException("surgio un error");
		throw exception;

	}

}
