package colecao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ColecaoUtilitario {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Guarana");
		list.add("Uva");
		list.add("Manga");
		list.add("Coco");
		list.add("Banana");
		list.add("Laranja");
		System.out.println(list);
		
		Collections.sort(list); //Organiza todos os itens em ordem alfabética
		System.out.println(list);

		Collections.reverse(list); //Inverte a ordem de todos os itens
		System.out.println(list);

		Collections.shuffle(list); //Organiza os itens em ordem aleatória
		System.out.println(list);

		Collections.addAll(list, "Cupuacu", "Acai", "Laranja"); //Adiciona novos itens diretamente a lista
		System.out.println(list);

		System.out.println(Collections.frequency(list, "Laranja")); //Mostra quantas vezes o item aparece na lista

		List<String> list2 = Arrays.asList("Acerola", "Goiaba");
		System.out.println(Collections.disjoint(list, list2)); //Verifica se as coleções não possuem elementos iguais
		
		
		Collections.sort(list);
		int indice = Collections.binarySearch(list, "Guarana"); //Pesquisa o indice de um elemento dentro da Collection
		System.out.println(indice);
		
		Collections.fill(list, "Laranja"); //Preenche todas as posições com uma determinada palavra
		System.out.println(list);
		
		//COLEÇÃO NÃO MODIFICÁVEL
		Collection<String> constante = Collections.unmodifiableCollection(list); //Cria uma collection constante
	}
}
