package proyecto_bytebank;

public class Carro{
    private int ano;
    private String modelo;
    private double precio;
    
    public Carro(int ano, String modelo, double precio) {
        this.ano = ano;
        this.modelo = modelo;
        this.precio = precio;
    }
    public Carro(String modelo, double precio){
        this.ano = 2017;
        this.modelo = modelo;
        this.precio = precio;
    }
    public int getAno() {
    	return ano;
    }

    //getters e setters omitidos        

}
