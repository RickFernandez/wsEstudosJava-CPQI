package estudosJavaP2;

import java.io.Console;
import java.util.Random;
import java.util.Scanner;

/*
	JOGO DE DADOS
	
	OBjetivo:
	
	- Criar um dado;
	- Sortear um número;
	- Pegar o palpite do usuário;
	- Caso o palpite seja igual ao valor sorteado, imprime na tela "Parabéns, você acertou!"
	- Caso o palpite seja diferente, imprime na tela "QUe pena, você errou"


*/


public class JogoDeDados {
	
	public static void main(String[] args) {
		
		//Criação dos dados
		int[] dado1 = {1, 2, 3, 4, 5, 6};
		int[] dado2 = {1, 2, 3, 4, 5, 6}; 
		
		Random r = new Random(); //Cria um bjeto sorteador
		
		//Sorteando os valores o valor
		int valorDado1 = r.nextInt(dado1.length);
		int valorDado2 = r.nextInt(dado2.length);
		
		//Valor total dos dois dados
		int valorTotal = valorDado1 + valorDado2;
		
		//Informando as regras do jogo ao usuário
		System.out.println("======== BEM VINDO AO JOGO DOS DADOS ========");
		System.out.println("O jogo consiste em 2 dados que sortearao numeros aleatorios");
		System.out.println("O seu objetivo e advinhar qual o valor total da soma dos dois valores sorteados!");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o seu palpite?");
		int palpite = sc.nextInt();
		System.out.println(palpite);
		
		if (palpite == valorTotal) {
			System.out.println("Parabens, voce acertou!!!! =)");
		}
		else {
			System.out.println("Que pena, voce errou... O valor sorteado foi " + valorTotal);
		}
		
	}
}

