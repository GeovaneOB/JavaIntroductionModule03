package Objetos;

public class Main {

	public static void main(String[] args) {
		
		Veiculos v1 = new Veiculos ("ABNT3", "Preto", 4, 5000.0, 220, 2100.0);
		Livros l1 = new Livros ("A hora da estrela", "Clarice Lispector", "9780811219495", 87, 50.00);
		
		System.out.println(v1.toString());
		System.out.println(l1.toString());
	}

}
