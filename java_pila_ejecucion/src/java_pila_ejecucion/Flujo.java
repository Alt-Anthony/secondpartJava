package java_pila_ejecucion;

public class Flujo {

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
		for (int i = 1; i <= 5; i++) {
			System.out.println("i");
			try { // Intenta correr esto
				if (i == 3) {
					int num = 0;																																			
					int resultado = i / num;
					System.out.println(resultado);
				}

				String test = null;
				System.out.println(test.toString());

			} catch (ArithmeticException | NullPointerException exception) { // Si es asi, atrapa este error
				System.out.println("Atrapo exception");
				System.out.println(exception.getMessage());
				exception.printStackTrace();
			}

		}
		System.out.println("Fin metodo2");
	}
}
