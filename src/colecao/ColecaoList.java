package colecao;

import java.util.ArrayList;
import java.util.List;

public class ColecaoList {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<>();
		
		list.add("Futebol");
		list.add("Basquete");
		list.add("Tenis");
		list.add("Volei");
		list.add("Natacao");
		list.add("Hockey");
		list.add("Boxe");
		list.add("Futebol");
				
		System.out.println(list);
		
		for(int i = 0; i < list.size(); i++) {
			String letra = list.get(i);
			list.set(i, letra.toUpperCase());
		}
		
		System.out.println(list);
		System.out.println(list.indexOf("BOXE")); //Acha um elemento dentro da lista, retornando seu index
		System.out.println(list.subList(2, 4)); //Faz uma sub-lista dentro da lista
		list.subList(2, 4).clear();
		System.out.println(list);
		
	}
}

/*
	LIST
	
	- Trabalha de forma similar a um Array
	- Pode conter elementos duplicados

*/