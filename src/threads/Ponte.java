package threads;

public interface Ponte {

	// MÉTODOS QUE ARMAZENAM E RECUPERAM OS OBJETOS ARQUIVADOS NA PONTE
	
	public void set(int valor) throws InterruptedException;
	
	public int get() throws InterruptedException;
}
