package estudosJavaP2;

import java.util.ArrayList;

public class ListaDeArray {
	
	public static void main(String[] args) {
		
		
		ArrayList<String> cores = new ArrayList<>(); //Cria uma ArrayList do tipo 'String'
		
		cores.add("Vermelho"); //Adiciona um elemento ao ArrayList
		cores.add(0, "Branco"); //Adiciona um elemento, porém, com a sua posição especificada
		cores.add("Azul");
		cores.add("Verde");
		System.out.println(cores);
		
		System.out.println(cores.size()); //Informa o tamanho do array
		System.out.println(cores.get(2)); //Recupera o elemento do array de um determinado local
		System.out.println(cores.indexOf("Verde")); //Retorna a posição/ index de um determinado elemento do array
		
		cores.remove("Branco"); //Remove um elemento do array
		System.out.println(cores);
		System.out.println(cores.contains("Amarelo")); //Verifica se há um elemento específico no array
	}
}
