package herança;

//Quando uma classe tem o modificador 'final' ela NÃO poderá ser herdada
public final class Galinha extends Animal {
	
	public Galinha() {
		super(5, "Milho");
	}
	
	//Quando um método é 'final' nenhuma outra classe poderá alterar este método
	final void fazerBarulho() {
		System.out.println("Co, Co!");
	}
}
