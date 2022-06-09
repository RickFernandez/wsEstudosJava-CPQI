package estudosJavaP1;

import java.util.Scanner;

public class Operadores {
	public static void main(String[] args) {
		
		
		// 2+3 --- operador binário
		// -2 --- operador unário
		// true ? "sim" : "não" --- operador ternário
		
		
		//============ OPERADORES MATEMÁTICOS ============
			double x = 7 + 3;
			System.out.println(x);
			
			String y = "7" + "3";
			System.out.println(y);
			
			double z = 7 % 3;
			System.out.println(z);
			
			double a = -(+3);
			System.out.println(a);
			
			int b = 6;
			int c = ++b; // '++b' = pré incrmento ----- 'b++' = pós incremento
			System.out.println(c);
			
			
		//============ OPERADORES DE COMPARAÇÃO ============
			int d = 6;
			System.out.println(d == 6);
			System.out.println(d != 6);
			
			String e = "6";
			System.out.println(e instanceof String);
			
			
		//============ OPERADORES LÓGICOS ============	
			int f = 6;
			System.out.println((f >= 1) && (f <= 5)); // retorna 'true' se as 2 operações forem verdadeiras
			System.out.println((f >= 1) || (f <= 10)); // retorna 'true' se 1 das operações forem verdadeiras
			System.out.println(! (f >= 1)); // inverte o resultado da operação (se for 'true', ele retorna 'false')
			
			
		//============ OPERADORES DE ATRIBUIÇÃO ============
			int g = 6;
			g += 3; // g = g + 3;
			System.out.println(g);
			
			
		//============ OPERADORES ESPECIAIS ============
			int idade = 15;
			String h = (idade >= 18) ? "Maior de Idade" : "Menor de Idade"; // Se '(condição) faça-(?) <instrução> se não-(:) <instrução>;'
			System.out.println(h);
	
			String pais = "Brasil";
			String cidade = "SP";
			/* 
			 	Pode-se criar as variáveis do seguinte modo:
			  	String pais = "Brasil", cidade = "SP";
			 
			 */
			
	
		//============ CÁLCULO DE UM CÍRCULO ============
			
			System.out.println("=============================");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Por favor, informe o valor do raio do circulo:");
			double raio = sc.nextDouble();
			
			//Diâmetro = 2r
			//double raio = 10;
			double diametro = 2 * raio;
			
			System.out.println("Diametro = " + diametro);
			
			//Circunferência = 2 PI r
			double pi = Math.PI; // Math.PI pega pega o valor de PI
			double circunferencia = 2 * pi * raio;
			System.out.println("Circunferencia = " + circunferencia);
			
			//Área = PI r²
			double area = pi * (raio * raio);
			System.out.println("Raio = " + area);
		
	}	
}

/*
	TIPOS DE OPERADORES
		
		-MATEMÁTICOS
			+
			-
			*
			/
			%
			++
			--
		
		
		-DE COMPARAÇÃO
			>
			<
			<=
			>=
			==
			!=
			instaceof
		
		
		-LÓGICOS 
			&& (and - e)
			|| (or - ou)
			!  (nop - não)
		
		
		-DE BITS (BITWISE)
			&
			&=
			|
			|=
			^
			^|
			~
			>>=
			<<=
			>>>=
		
		
		-DE ATRIBUIÇÃO
			+=
			-=
			*=
			/=
			%=
			
			
		-ESPECIAIS
		?: (Operador Ternário)
		, (separação de Expressões)
		() (Chamada de Método)
		(cast) (Coerção Unária)
*/