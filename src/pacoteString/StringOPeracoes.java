package pacoteString;

public class StringOPeracoes {
 
	public static void main(String[] args) {
		
		
		String s1 = "Ola";
		String s2 = s1 + "Mundo";
		String s3 = new String("Java Virtual Machine");
		
		char[] array = {'J', 'a', 'v', 'a'};
		String s4 = new String(array);
		
		//OPERAÇÃO BÁSICA
		int tamanho = s1.length();
		char letra = s1.charAt(0); //0 a length()-1
		String texto = s1.toString();
		
		//LOCALIZAÇÃO
		int posicao = s3.indexOf("Virtual");
		System.out.println(posicao);

		int ultima = s3.lastIndexOf("a");
		System.out.println(ultima);
		
		boolean vazia = s3.isEmpty();
		System.out.println(vazia);
		
		//COMPARAÇÃO
		String xti = "XTI";
		boolean x = xti.equals("xti");
		boolean y = xti.equalsIgnoreCase("xti"); //Faz a comparação ignorando letras maiúsculas e minúsculas
		System.out.println(x);
		System.out.println(y);
		
		boolean comeca = xti.startsWith("XT");
		boolean termina = xti.endsWith("TI");
		
		int menos = "amor".compareTo("bola"); //-1 pois 'amor' vem antes de 'bola' (pq começa com A) logo é menor
		System.out.println(menos);
		
		String so = "Olhe, olhe!";
		boolean o = so.regionMatches(/*true,*/ 6, "Olhe", 0, 4);//Compara se na String 'so' à partir da posição 6 possui um texto "Olhe" do index 0 ao 4 (Ao passar o true no inicio, ele ignora letras maiusculas e minusculas)
		System.out.println(o);
		
		
		//EXTRAÇÃO DE DADOS
		String l = "O Brasil e Lindo";
		String sl = l.substring(11); //Vai pegar uma 'substring' a partir da posição 11
		String ssl = l.substring(2, 8); //Pega o texto entre as posições 2 e 8
		System.out.println(sl);
		System.out.println(ssl);
		
		ssl = l.concat(" que Maravilha!");
		System.out.println(ssl);
		
		sl = l.replace("s", "z");
		System.out.println(sl);
		

		sl = l.replaceFirst(" ", "X");
		System.out.println(sl);
		
		sl = l.replaceAll(" ", "_");
		System.out.println(sl);
		
		System.out.println("        Espaços        ".trim()); //Remove os espaços em branco antes e depois da String (n remove se houver algum no meio)
	}
}	
