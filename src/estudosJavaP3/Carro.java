package estudosJavaP3;

public class Carro {
	
	String modelo;
	int velocidadeMaxima;
	double segundosZeroCem;
	Motor motor;
	
	//Construtor vazio
	public Carro() {
		
	}
	
	// Construtor cheio (usado para inicializar os parametros do Carro)
	public Carro(String modelo, int velocidadeMaxima, double segundosZeroCem) {
		this(modelo, velocidadeMaxima, segundosZeroCem, null);
	}
	
	public Carro(String modelo, int velocidadeMaxima, double segundosZeroCem, Motor motor) {
		this.modelo = modelo;
		this.velocidadeMaxima = velocidadeMaxima;
		this.segundosZeroCem = segundosZeroCem;
		this.motor = motor;
	}

}

/*
	RESUMO - Contrutores
	
	São blocos de comando que podem ser utilizados para iniciar os objetos.
	Mesmo que vc não crie construtores, eles são criados automaticamente pelos compiladores.

*/