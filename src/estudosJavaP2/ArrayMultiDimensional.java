package estudosJavaP2;

import java.util.Random;

public class ArrayMultiDimensional {

	public static void main(String[] args) {
		
		//Array de uma dimensão
		String[] uma = {"Ricardo", "Sandra", "Beatriz", "Lawrence", "Laura", "Juliana"};
		System.out.println(uma);
		
		//Array de duas dimensões
		String[][] duas = 
			{
				{"Ricardo", "M", "DF"}, //Dimensão 1
				{"Sandra", "F", "MG"}, //Dimensão 2
			};
		
		System.out.println(duas[0][0]); //Acessa o primeiro elemento da primeira dimensão do Array ("Ricardo")
		System.out.println(duas[1][0]); //Acessa o primeiro elemento da segunda dimensão do Array ("Sandra")
		
		System.out.println(duas.length); //Imprime 2 (2 elementos/ dimensões)
		System.out.println(duas[0].length); //Imprime 3 (3 elementos dentro da primeira dimensão do array)
		
		duas[1][0] = "SANDRA"; //Altera o valor do primeiro elemento('[0]') da segunda dimensão('[1]')
		
		
		
		
		//=================== SORTEADOR DE CARTAS ===================
		String[] faces = {"A","1","2","3","4","5","6","7","8","9","10","Q","J","K"};
		String[] nipes = {"Ouros","Espadas","Copas","Paus"};
		
		Random r = new Random(); //Cria um objeto 'r' que sorteia um número aleatório
		
		int indiceFace = r.nextInt(faces.length); //Cria uma variável que sorteio um índice aleatório dentro do Array 'faces'
		String face = faces[indiceFace]; //Converte o indice da face sorteada para o seu valor em uma String
		
		int indiceNipe = r.nextInt(nipes.length);
		String nipe = nipes[indiceNipe];
		
		String carta = face + " de " + nipe; //Cria uma variavel 'carta' que recebe a face e nipe sorteados
		System.out.println(carta);
	}
}
