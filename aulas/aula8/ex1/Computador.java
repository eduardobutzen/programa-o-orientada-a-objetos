package aula8.ex1;

public class Computador {

	protected String Marca;
	private String Modelo;
	
	public Computador (String marca, String modelo) {
		
			this.Marca = marca;
			this.Modelo = modelo;
		
	}
	
	public String exibeModelo() {
		
		return "Modelo: " + Modelo;
		
	}
	
}