package proyecto_bytebank;

public class PruebaCarro {
	public static void main(String[] args) {
		
		Carro carro = new Carro(2013, "Gol", 35000.0);
		
		Carro carro2 = new Carro("Uno", 2000.0);
		Carro carro3 = new Carro("dps",2222);
		
		
		System.out.println(carro.getAno());
		System.out.println(carro2.getAno());
		System.out.println(carro3.getAno());
	}
}
