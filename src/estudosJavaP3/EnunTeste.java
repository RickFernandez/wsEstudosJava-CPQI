package estudosJavaP3;

public class EnunTeste {

	public static final double PI = 3.14; //Cria uma constante(final), publica e global(relacionada a classe e n ao objeto -static)

	public static void main(String[] args) {
		
		System.out.println(peçasXadrez.BISPO);
		
		for(peçasXadrez pç : peçasXadrez.values()) {
			System.out.println(pç);
		}
		
		System.out.println(Medida.M.titulo); //Retorna o titulo da constante 'M' dentro da Enum 'Medida'
		
		//Faz um Foreach percorrendo a Enum e retorna todos os valores encontrados(através do 'Media.values()')
		for(Medida m : Medida.values()) {
			System.out.println(m + " : " + m.titulo);
		}
	}
}
