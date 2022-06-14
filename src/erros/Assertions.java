package erros;

import java.util.Scanner;

public class Assertions {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Informe um numero de 0 a 10");
		int numero = s.nextInt();
		
		assert (numero >= 0 && numero <= 10) : "Numero invalido " + numero; //Criando uma assertion passando as regras que devem ser seguidas e após os ':' uma mensagem de erro
		System.out.println(numero);
	}

}

/*
	ASSERTIONS
	
	- Para utilizar as Assertions é necessário ativá-las.
		1. Vai no botão de Run e clique na seta;
		2. Run configurations;
		3. Arguments;
		4. Em 'VM Arguments' escreva "-ea" para ativar e "-da" para desabilitar;
	Ajuda na criação do seu programa, informando possíveis erros que você mesmo pode criar

*/