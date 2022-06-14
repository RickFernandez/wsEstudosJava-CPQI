package estudosJavaP3;

public enum Medida {
	
	MM("Milímetro"), CM("Centímetro"), M("Metro");
	
	public String titulo; //Adiciona uma String 'titulo' as constantes
	
	//Construtor que inicializa a variável 'itulo'
	Medida(String titulo) {
		this.titulo = titulo;
	}
	
}
