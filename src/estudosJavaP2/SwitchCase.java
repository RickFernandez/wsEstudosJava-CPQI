package estudosJavaP2;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("O seu gato é macho<M> ou femea<F>?");
		String sexo = sc.nextLine();
		
		switch (sexo) {
		case "M": {
			System.out.println("Macho");
			break;
		}
		case "F": 
			System.out.println("Femea");
			break;
		default: 
			System.out.println("Outro");
		}
		
		
	}
}
