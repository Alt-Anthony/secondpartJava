package bytebankheredado;

public class Gerente extends Funcionario {

	public boolean iniciarSesion(String clave) {
		return clave == "Alura";
	}
	
	
	// esto es sobreescritura de metodo
	public double getBonificacion() {
		System.out.println("Ejecutando desde gerente");
		return super.getSalario()+ this.getSalario()*0.5	;
	}

}
