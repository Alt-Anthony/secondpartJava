package bytebankheredado;

import bytebankheredado.modelo.Funcionario;
import bytebankheredado.modelo.Gerente;

public abstract class TestReferencias {
	public static void main(String[] args) {
		
		
		// ELemento mas generico puede ser adaptado
		// al elemento mas especifico
		Funcionario funcionario = new Gerente();
		funcionario.setNombre("Diego");
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Jimena");
		
		funcionario.setSalario(2000);
		gerente.setSalario(10000);
		
		
	}
}
