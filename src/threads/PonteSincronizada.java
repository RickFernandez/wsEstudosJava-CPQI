package threads;

public class PonteSincronizada implements Ponte {

	private int valor = -1; //Representa o valor armazenado
	private boolean ocupada = false;
	
	@Override
	public synchronized void set(int valor) throws InterruptedException {
		while(ocupada) {
			System.out.println("Ponte cheia. Produtor aguardando...");
			wait(); //Faz a Thread aguardar enquanto a ponte estiver ocupada
		}
		
		System.out.print("Produziu " + valor);
		this.valor = valor;
		ocupada = true;
		notifyAll(); //Notifica para as Threads as alterações do programa, informando se podem ser executadas ou não
	}

	@Override
	public synchronized int get() throws InterruptedException {
		while(!ocupada) {
			System.out.println("Ponte vazia. Consmidor aguardando...");
			wait();
		}
		
		System.err.print("Consumiu " + valor);
		ocupada = false;
		notifyAll();
		return valor;
	}
}
