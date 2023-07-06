package bytebankheredado;

public class Gerente extends Funcionario{

	public boolean iniciarSesion(String clave) {
		return clave == "Alura";
	}
}
