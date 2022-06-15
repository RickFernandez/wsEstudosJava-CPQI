package estudosJavaP4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressaoRegular {

	public static void main(String[] args) {

		String padrao = "Java";
		String texto = "Java";
		boolean b = texto.matches(padrao);
		//boolean b = "Java".matches("Java");
		//System.out.println(b);
		
		b = "Java".matches("(?i)java");
		//System.out.println(b);
		
		b = "@".matches(".");
		//b = "@#".matches("..");
		//System.out.println(b);
		
		b = "2".matches("\\d");
		//b = "23".matches("\\d\\d");
		//System.out.println(b);
		
		String cep = "\\d\\d\\d\\d\\d-\\d\\d\\d";
		b = "05665-010".matches(cep);
		//System.out.println(b);
		b = "05665-010".matches("\\d{5}-\\d{3}");
		//System.out.println(b);
		
		
		b = "Pier21".matches("^Pier.*");
		//System.out.println(b);
		b = "Pier21".matches(".*21$");
		//System.out.println(b);
		
		b = "Tekm Java aqui".matches(".*Java.*");
		//System.out.println(b);
		b = "Tem Java aqui".matches("^Tem.*aqui$");
		//System.out.println(b);
		

		b = "A".matches("[a-z]");
		//System.out.println(b);
		b = "2".matches("[0-9]");
		//System.out.println(b);

		b = "true".matches("[tT]rue");
		//System.out.println(b);

		b = "Rick".matches("[A-Z][a-z]*");
		//System.out.println(b);
		

		b = "rickfernandez@gmail.com".matches("\\w+@\\w+\\.\\w{2,3}");
		//System.out.println(b);
		
		
		
		String doce = "Qual e o Doce mais doCe que o doce?";
		Matcher matcher = Pattern.compile("(?i)doce").matcher(doce);
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
		/*
		  -Matcher matcher - cria um objeto 'matcher' utilizado para fazer várias verificações em um texto;
		  -Pattern.compile(regex).matcher(variável) - cria uma expressão regular de verificação e através do objeto matcher, faz a validaçao dessa expressão no texto escolhido
		  -while(matcher.find()) - enquanto o objeto encontrar no texto a expressão imposta, ele irá recuperar o resultado através do método 'group()'
		
		*/
		System.out.println("===================================");
		
		
	String r = doce.replaceAll("(?i)doce", "DOCINHO"); //Substitui toda a ocorrencia encontrada pela expressão regular (doce) por 'docinho'
	System.out.println(r);
	
	String rato = "O rato roeu a roupa do rei de Roma";
	r = rato.replaceAll("r[aeiou]", "XX");
	System.out.println(r);
	
	
	
	System.out.println("===================================");
	
	String url = "www.xti.com.br/clientes-2022.html";
	//OBJETIVO: trocar a url para o seguinte padrão: "http://www.xti.com.br/2022/clientes.jsp"
	
	String re = "www.xti.com.br/\\w{2,}-\\d{4}.html"; //Cria uma expressão regular para a URL atual
	b = url.matches(re); //Verifica se a expressão bate com a url
	System.out.println(b);
	
	re = "(www.xti.com.br)/(\\w{2,})-(\\d{4}).html"; //Cria variáveis dentro da expressão -- cada '(conteúdo)' é uma variável
	
	r = url.replaceAll(re, "http://$1/$3/$2.jsp"); //Faz a substituição da url antiga pela nova, reutilizando as variáveis criadas ($1, $2, $3)
	System.out.println(r);
	}

}

/*
	EXPRESSÕES REGULARES

	- Sensíveis a letras maiúsculas e minúsculas;

======================================================

	MODIFICADORES
	
	(?i) - Ignora maiúsculas e minúsculas;
	(?x) - Comentários;
	(?m) - Multilinhas;
	(?s) - Dottal;
	
======================================================

	METACARACTERES
	
	. - qualquer caractere
	\d - Dígitos 		[0-9]
	\D - Não é dígito 	[^0-9]
	\s - Espaços 		[ \t\n\x0B\f\r]
	\S - Não é espaço 	[^\s]
	\w - Letra 			[a-zA-Z_0-9]
	\W - Não é letra
	
======================================================

	QUANTIFICADORES
	
	X{n} 	X, exatamente n vezes
	X{n,}	X, pelo menos n vezes
	X{n, m}	X, pelo menos n mas não mais do que m vezes
	X? 		X, 0 ou 1 vez
	X* 		X, 0 ou + vezes
	X+ 		X, 1 ou + vezes

======================================================

	METACARACTER DE FRONTEIRA
	
	^	Inicia
	$	Finnaliza
	|	ou

======================================================

	AGRUPADORES
	
	[...]			Agrupamento
	[a-z]			Alcance
	[a-e][i-u]		União
	[a-z&&[aeiou]]	Interseção
	[^abc]			Exceção
	[a-z&&[^m-p]]	Subtração
	\x				Fuga literal
	
	
	
	
	
	
*/