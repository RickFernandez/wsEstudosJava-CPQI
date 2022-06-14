package estudosJavaP3;

public class Galinha {

	public static int ovosDaGranja; //vairável global
	public int ovos; //total de ovos do objeto galinha
	
	public Galinha botar() {
		this.ovos++;
		Galinha.ovosDaGranja++;//retorna a variavel com 'Galinha.' ao invés de 'this.' pois é uma variável da classe, e não de um objeto
		return this;
	}
	
	public static double mediaDeOvos(int galinhas) {
		return Galinha.ovosDaGranja / galinhas;
	}
}

/*
	RESUMO - Métodos e Variáveis estáticos
	
	Um método ou uma variável estática faz referência a uma Classe, e não a um objeto, tornando-se global ao invés de local.
	Sempre que quiser chamar uma variável global, deve-se utilizar '<nome da classe>.<variável>' (ex linha 10).

*/