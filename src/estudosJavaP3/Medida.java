package estudosJavaP3;

public enum Medida {
	
	MM("Milimetro"), CM("Centimetro"), M("Metro");
	
	public String titulo; //Adiciona uma String 'titulo' as constantes
	
	//Construtor que inicializa a variável 'titulo'
	Medida(String titulo) {
		this.titulo = titulo;
	}
	
}
