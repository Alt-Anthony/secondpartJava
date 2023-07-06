package bytebankheredado;

public class Gerente extends Funcionario {

	public boolean iniciarSesion(String clave) {
		return clave == "Alura";
	}
	
	
	// esto es sobreescritura de metodo
	public double getBonificacion() {
		return super.getSalario()+super.getBonificacion();
	}
}
