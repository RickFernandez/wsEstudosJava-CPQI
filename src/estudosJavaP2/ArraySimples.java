package estudosJavaP2;

import java.util.Arrays;

public class ArraySimples {
	
	public static void main(String[] args) {
		
		String[] paises = {"Brasil", "Russia", "India", "China"}; //Cria um Array de Strings com o vários paises como valor
		System.out.println(paises[0]); //Imprime "Brasil" pois ele está na posição '0' do Array
		
		paises[0] = "BRASIL"; //Altera o valor do índice 0 dentro do Array
		System.out.println(paises[0]);
		System.out.println(Arrays.toString(paises)); //Imprime o Array inteiro em forma de String
		
		int posicao = Arrays.binarySearch(paises, "Russia"); //Percorre o Array 'paises' procurando se há algum valor "Russia"
		System.out.println(posicao);
		
		Arrays.sort(paises, 0, paises.length); //Ordena os itens do Array por ordem alfabética, do índice '0' até o ultimo (paises.length)
		System.out.println(Arrays.toString(paises));
	
		
		int[] impares = new int[5]; //Cria um Array de tipo primitivo e informa que ele terá 5 espaços
		// Preenche os espaços do Array
		impares[0] = 1;
		impares[1] = 3;
		impares[2] = 5;
		impares[3] = 7;
		impares[4] = 9;
		System.out.println(impares.length); // '.length' informa quantos espaços um Array possui
		
		Double[] valores = {12.35, 3456.3456};
		System.out.println(valores[0].doubleValue()); //Acessa o método do item inserido dentro do Array (neste caso, o 'doubleValue()')
		
	}
}
