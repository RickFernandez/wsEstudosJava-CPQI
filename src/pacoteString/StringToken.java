package pacoteString;

public class StringToken {

	public static void main(String[] args) {
		
		String s = "HTML; CSS; JS; JAVA; JQuery";
		
		String[] tokens = s.split(";"); // '.split()' faz a quebra de palavras em uma String
		System.out.println(tokens.length + " tokens");
		
		for(String t : tokens) {
			System.out.println(t);
		}

	}

}
