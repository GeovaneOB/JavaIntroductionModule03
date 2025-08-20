package Cliente;

public class Main {
	
	public static void main(String[] args) {
		
		// Instanciando uma classe cliente.
		Cliente c1 = new Cliente("Geovane", 19);
		Cliente c2 = new Cliente("Alessandra", 19);
		
		// Usando toString().
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
	
}
