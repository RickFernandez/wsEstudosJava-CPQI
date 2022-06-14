package pacoteString;

public class StringMutavel {

	public static void main(String[] args) {

		StringBuffer s0 = new StringBuffer();
		StringBuilder s1 = new StringBuilder("Java");
		
		System.out.println(s1.length()); //Tamanho da String
		System.out.println(s1.capacity()); //Capacidade de Strings que cabem na variável
		System.out.println(s1);
		System.out.println(s1.reverse()); //Faz a inversão de caracteres da String
		
		s1.append(" Trabalhando "); // Faz a concatenação de novos textos na String
		char[] c = {'c', 'o', 'm'};
		s1.append(c).append(" Textos ");
		System.out.println(s1);
		
		String url = new StringBuilder("www.google.com").delete(0, 4).toString(); // '.delete(<inicio>, <fim>)' remove uma parte da String
		System.out.println(url);
		
	}

}
