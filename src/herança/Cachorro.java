package herança;

public class Cachorro extends Animal {
	
	double peso;
	
	public Cachorro() {
		super(25, "Ração");
	
		//this.peso; --- Se refere ao atributo da própria classe
		//super.peso; --- Se refere ao atribuo da 'Super' classe
		
	}
	
	void fazerBarulho() {
		System.out.println("Au, Au!");
	}
}
