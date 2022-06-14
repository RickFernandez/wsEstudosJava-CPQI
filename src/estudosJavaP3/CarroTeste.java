package estudosJavaP3;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro ferrari = new Carro(); //'Carro()' seria um bloco construtor utilizado para iniciar um objeto 'ferrari' do tipo Carro
		
		// Inicializando um objeto através do construtor vazio
		ferrari.modelo = "Ferrari F8";
		ferrari.velocidadeMaxima = 350;
		ferrari.segundosZeroCem = 3.2;
		System.out.println("Ferrari: " + ferrari.modelo);
		System.out.println("Ferrari velocidade maxima: " + ferrari.velocidadeMaxima);
		System.out.println("Ferrari segundos de zero a cem: " + ferrari.segundosZeroCem);
		
		// Criando um objeto motor
		Motor v12 = new Motor();
		v12.tipo = "V12";
		v12.potencia = 660;
		ferrari.motor = v12; // Adicionando um motor a ferrari
		
		
		System.out.println("Ferrari tipo motor: " + ferrari.motor.tipo);
		System.out.println("Ferrari potencia motor: " + ferrari.motor.potencia);
		
		//Inicializando um objeto através do construtor cheio
		Carro bmw = new Carro("BMW i8", 200, 5);
		System.out.println("BMW: " + bmw.modelo);
		System.out.println("BMW velocidade maxima: " + bmw.velocidadeMaxima);
		System.out.println("BMW segundos de zero a cem: " + bmw.segundosZeroCem);
		
		Motor v8 = new Motor();
		v8.tipo = "V8";
		v8.potencia = 500;
		bmw.motor = v8;
		
		System.out.println("BMW tipo motor: " + bmw.motor.tipo);
		System.out.println("BMW potencia motor: " + bmw.motor.potencia);
		
		Carro bugatti = new Carro("Bugatti Veyron", 430, 2.2, new Motor("W16", 1200));
		System.out.println("Bugatti: " + bugatti.modelo);
		System.out.println("Bugatti velocidade maxima: " + bugatti.velocidadeMaxima);
		System.out.println("Bugatti segundos de zero a cem: " + bugatti.segundosZeroCem);

		System.out.println("Bugatti tipo motor: " + bugatti.motor.tipo);
		System.out.println("Bugatti potencia motor: " + bugatti.motor.potencia);
	}
}
