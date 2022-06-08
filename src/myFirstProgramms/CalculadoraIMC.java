package myFirstProgramms;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculadoraIMC {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// ========== COLETA DE DADOS ==========
		
		System.out.println("Por favor, informe o seu nome:");
		String nome = sc.nextLine(); //Coleta o nome do usuário
		
		System.out.println(nome + " informe o seu peso:");
		double peso = sc.nextDouble(); //Coleta o peso do usuário
		
		System.out.println(nome + " agora informe a sua altura:");
		double altura = sc.nextDouble();
		
		System.out.println(nome);
		System.out.println(peso);
		System.out.println(altura);
		
		// ========== CÁLCULO ==========
		
		double imc = (peso / (altura * altura)); //Faz o cálculo do IMC
		BigDecimal bd = new BigDecimal(imc).setScale(2, RoundingMode.HALF_EVEN); //Arredonda o valor do IMC, levando em consideração 2 casas decimais (setScale[2]) 
		System.out.println(nome + " o valor do seu IMC é: " + bd.doubleValue());
		
		//Faz as restrições de acordo com o valor do IMC calculado
		if (imc < 18.5) {
			System.out.println("Voce esta abaixo do peso.");
		} else if (imc < 24.9) {
			System.out.println("Voce esta no peso ideial. Parabens!");
		} else if (imc < 29.9) {
			System.out.println("Voce esta levemente acima do peso.");
		} else if (imc < 34.9) {
			System.out.println("Voce esta com uma obesidade moderada.");
		} else if (imc < 39.0) {
			System.out.println("Voce esta com uma obesidade severa.");
		}else if (imc < 49.0) {
			System.out.println("Voce esta com uma obesidade merbida.");
		}else if (imc >= 50.0) {
			System.out.println("Voce esta com uma super-obesidade. Tome Cuidado!!!.");
		}
	}
}

/*
	========= REGRAS IMC =========


	CALCULADORA DE IMC (ÍNDICE DE MASSA CORPORAL)
	
	IMC = PESO / (ALTURA)²
	
	° IMC < 18,5 = abaixo do peso
	° IMC >= 18,5 && < 24,9 = Peso adequado
	° IMC >= 25,0 && < 29,9 = Sobre peso
	° IMC >= 30,0 && < 34,9 = Obesidade de grau 1 ou Moderada
	° IMC >= 35,0 && < 39,0 = Obesidade de grau 2 ou Severa
	° IMC >= 40,0 && < 49,0 = Obesidade grau 3 ou Móbida
	° IMC >= 50,0 = Super-Obesidade
*/