package bytebankheredado;

public class SaldoInsuficienteExcepcion extends RuntimeException{

	public SaldoInsuficienteExcepcion(String msg) {
		super(msg);
	}
	
}
