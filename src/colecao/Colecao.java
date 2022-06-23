package colecao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecao {

	public static void main(String[] args) {
		
		Collection<String> c = new ArrayList<>();
		
		c.add("A");
		c.add("B");
		c.add("C");
		System.out.println(c.toString());
		System.out.println(c.isEmpty()); //Verifica se a collection está vazia
		System.out.println(c.contains("A")); //Verifica se há um elemento dentro da collection
		
		c.remove("A");
		System.out.println(c.toString());
		
		/* GRUPOS DE ELEMENTOS */
		Collection<String> c2 = Arrays.asList("D", "E"); //Converte um Array em uma Collection
		c.addAll(c2);
		System.out.println(c.toString());
		System.out.println(c.containsAll(c2)); //Verifica se dentro de 'c' tem todos os elementos de 'c2'
		c.removeAll(c2);
		System.out.println(c.toString());
		
		/* PERORRER OS ELEMENTOS */
		for(String string : c) {
			System.out.println(string);
		}
		
		String[] s = c.toArray(new String[c.size()]); //Converte uma Collection em um Array
		System.out.println(Arrays.toString(s));
		
		c.clear();
		System.out.println(c);
	}
}
