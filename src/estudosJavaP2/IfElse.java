package estudosJavaP2;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o seu nome?");
		String nome = sc.nextLine();
		
		System.out.println(nome + " qual a sua idade?");
		int idade = sc.nextInt();
		
		if (idade >= 18) {
			System.out.println("Voce e maior de idade, pode entrar!");
		} else {
			System.out.println("Nao permitimos a entrada de menores de idade...");
		}
		
	}
}
