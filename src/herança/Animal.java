package herança;

public abstract class Animal {
	
	//private int serial; -- Cria um atributo privado, acessado somente por esta classe
	// protected int serial; -- Cria um atributo protegido, acessado somente por subclasses
	double peso;
	String comida;
	
	
	
	public Animal(double peso, String comida) {
		this.peso = peso;
		this.comida = comida;
	}
	
	void dormir() {
		System.out.println("zZzzzZZZZzzZz");
	}
	
	//Método abstrato
	abstract void fazerBarulho();
	
}

/*
	CLASSE ABSTRATA
	
	- Uma classe abstrata não pode ser instanciada;
	- Pode possuir métodos abstratos ou implementados;
	- Sempre que um método for abstrato, as classes (concretas) herdeiras são obrigadas a implementar esses métodos;
*/