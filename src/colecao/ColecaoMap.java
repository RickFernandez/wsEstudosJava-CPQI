package colecao;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ColecaoMap {

	public static void main(String[] args) {
		
		
		Map<String, String> pais = new HashMap<>(); //Cria um objeto do tipo Map que recebem como parametros seu TIPO e VALOR
		pais.put("BR", "Brasil");
		pais.put("RU", "Russia");
		pais.put("IN", "India");
		pais.put("CN", "China");
		System.out.println(pais);
		
		System.out.println(pais.containsKey("BR")); //Verifica se uma chave existe
		System.out.println(pais.containsValue("Brasil")); //Verifica se um valor existe
		System.out.println(pais.get("CN")); //Retorna o valor de uma chave
		pais.remove("RU"); //Remove um elemento
		System.out.println(pais);

		Set<String> keys = pais.keySet(); //Recupera todas as chaves de um Map retornando um objeto do tipo Set
		for(String key : keys) {
			System.out.println(key + ": " + pais.get(key));
		}

	}
}
