package java_pila_ejecucion;

public class Flujo {

	public static void main(String[] args) {
		System.out.println("Inicio  main");
		metodo1();
		System.out.println("Fin main");
	}

	private static void metodo1() {
		System.out.println("Inicio metodo1");
		try {
			metodo2();
		} catch (MiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Fin metodo1");
	}

	private static void metodo2() throws MiException {
		System.out.println("Incio metodo2");
		throw new MiException("Mi excepcion fue lanzada");

	}
}
