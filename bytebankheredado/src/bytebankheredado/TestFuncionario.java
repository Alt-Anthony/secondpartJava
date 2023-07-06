package bytebankheredado;

public class TestFuncionario {

	public static void main(String[] args) {
		
		Funcionario diego = new Funcionario();
		
		diego.setNombre("DIego");
		diego.setDocumento("4555555");
		diego.setSalario(2000);
		diego.setTipo(0);
		
		System.out.println(diego.getSalario());
		
		System.out.println("la bonificacion es "+diego.getBonificacion());
	}
}
