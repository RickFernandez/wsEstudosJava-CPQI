package herança;

public class AnimalTeste {
	
	public static void barulho(Animal animal) {
		animal.fazerBarulho();
	}

	public static void main(String[] args) {
		
		Animal toto = new Cachorro();		
		Animal popo = new Galinha();
		
		barulho(toto);
		barulho(popo);
		

		System.out.println("===================");
		
		//instaceof - utilizado para saber o tipo dos objetos
		System.out.println(toto instanceof Cachorro);
		System.out.println(popo instanceof Animal);

		System.out.println("===================");
		
		if(toto instanceof Cachorro) {
			System.out.println("Toto e um Cachorro");
		}
		else {
			System.out.println("Nao sei o que o Toto e");
		}
		
	}

}
