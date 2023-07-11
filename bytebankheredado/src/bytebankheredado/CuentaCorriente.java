package bytebankheredado;

public class CuentaCorriente implements Tributacion {

    public CuentaCorriente(int i, int j) {
		// TODO Auto-generated constructor stub
	}

	@Override
    public double getValorImpuesto() {
        return 2 *0.01;
    }

	public void depositar(int i) {
		// TODO Auto-generated method stub
		
	}

	public void transferir(int i, CuentaAhorros ca) {
		// TODO Auto-generated method stub
		
	}

	public char[] getSaldo() {
		// TODO Auto-generated method stub
		return null;
	}
		
	
	
}
	