package erros;

import java.util.InputMismatchException;
import java.util.Scanner;

// TRATAMENTO DE EXCEÇÕES

public class DividePorZero {
	
	public static void dividir(Scanner s) 
		throws InputMismatchException, ArithmeticException
	{
		System.out.print("Numero: ");
		int a = s.nextInt();
		
		System.out.print("Divisor: ");
		int b = s.nextInt();
		
		System.out.println(a / b);
		
	}

	public static void main(String[] args) {
		

		Scanner s = new Scanner(System.in);
		boolean continua = true;
		
		do {
			
			try {
				dividir(s);
				continua = false;
			}
			catch(InputMismatchException | ArithmeticException e1) {
				System.err.println("Numero Invalido");
				
				e1.printStackTrace(); 
				
				s.nextLine(); //Descarta o valor invalido que foi informado e libera novamente ao usuario para que digite outro valor
			}
			finally {
				System.out.println("Finally Executado...");
			}
		} while (continua);
	}

}


/*
	EXCEPTIONS
	
	try -- informa ao programa um código para ser executado
	 
	catch -- informa ao programa que você capturou um erro, podendo descrever códigos para tratar esses erros

	finally -- o programa SEMPRE executará o código dentro do 'finally' independente se houver erros ou não

	throws -- informa ao programa quais as possibilidades de exceções que podem ocorrer na hora da execução

	atributo '.err' imprime uma mensagem de erro
	
	.printStackTrace(); -- Imprime no sistema uma lista com os erros encontrados ao executar o programa
*/