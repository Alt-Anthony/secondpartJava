package bytebankheredado;

public class Gerente extends Autenticable {
	

	public double getBonificacion() {
		System.out.println("Ejecutando desde gerente");
		return 2000;
			}

}
