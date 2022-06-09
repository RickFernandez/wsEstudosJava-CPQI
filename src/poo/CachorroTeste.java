package poo;

public class CachorroTeste {

	public static void main(String[] args) {
		
		Cachorro pitbull = new Cachorro();
		
		pitbull.raca = "Pit BUll";
		pitbull.tamanho = "Grande";
		pitbull.latir();

		Cachorro viralata = new Cachorro();
		
		viralata.raca = "Vira-Lata";
		viralata.tamanho = "Medio";
		viralata.latir();
	}
}
