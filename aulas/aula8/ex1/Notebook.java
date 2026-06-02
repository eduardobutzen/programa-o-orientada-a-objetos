package aula8.ex1;

import java.util.Scanner;

public class Notebook extends Computador {
	
	public Notebook (String marca) {
		
		super(marca, "Portatil"); 
	}
	
	public String exibeMarca() {
		
		
		return "marca: " + Marca;
	}

	public static void main(String[] args) {

		 Scanner scanner = new Scanner(System.in);
	     System.out.print("Digite a marca do Notebook: ");
	     String marca = scanner.nextLine();

	     Notebook nb = new Notebook(marca);
	     System.out.println(nb.exibeMarca());
	     System.out.println(nb.exibeModelo());

	     scanner.close();
		
	}

}
