import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Pets pets = new Pets (null, 1, null, null, null);

		Scanner sc = new Scanner (System.in);
		
		for(int i = 0; i < 2; i++) {
			System.out.println("====== PET " + (i+1) + " ======");
			System.out.println("Informe o nome do Pet: \n");
			pets.setNome(sc.nextLine());
			System.out.println("Informe a idade do Pet: \n");
			pets.setIdade(sc.nextInt());
			sc.nextLine();
			System.out.println("Informe a raça do Pet: \n");
			pets.setRaca(sc.nextLine());
			System.out.println("Informe o porte do Pet: ");
			pets.setPorte(sc.nextLine());
			System.out.println("Informe a alimentacao do Pet: ");
			pets.setAlimentacao(sc.nextLine());
				
			System.out.println(pets.toString());
		}
	}
}
