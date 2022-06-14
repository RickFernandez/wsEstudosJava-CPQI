package estudosJavaP3;

public class GalinhaTeste {

	public static void main(String[] args) {
		
		Galinha g1 = new Galinha();
		g1.botar().botar().botar();
		System.out.println("G1 botou " + g1.ovos + " ovos");
	
		Galinha g2 = new Galinha();
		g2.botar().botar();
		System.out.println("G2 botou " + g2.ovos + " ovos");
		
		System.out.println("O total de ovos na ganja e " + Galinha.ovosDaGranja);
		System.out.println("A media de ovos na ganja e " + Galinha.mediaDeOvos(2));
//Como 'ovosDaGanja' e 'mediaDeOvos' são variáveis globais, n é necessário chamar um objeto do tipo galinha para serem inicializadas, precisa somente chamar suas classes.
	}
}
