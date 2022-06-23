package threads;

//Cria uma nova Thread
public class PingPongRunnable implements Runnable {

	String palavra;
	long tempo;
	
	public PingPongRunnable(String palavra, long tempo) {
		this.palavra = palavra;
		this.tempo = tempo;
	}
	
	
	
	public static void main(String[] args) {
		
		//Cria 2 objetos do tipo PingPong acordando-os
		Runnable ping = new PingPong("ping", 1500);
		Runnable pong = new PingPong("pong", 2000);
		
		new Thread(ping, "ping").start();
		new Thread(pong, "pong").start(); 
		
		System.out.println("Ver Threads");
	
	}

	public void run() {
		try {
			for(int i = 0; i < 5; i++) //Executa os objetos
			{
				System.out.println(palavra); //Imprime a palavra 5 vzs
				Thread.sleep(tempo); //Coloca o objeto da Thread para "dormir" por determinado tempo
				
			}
		} catch (InterruptedException e) {
			return;
		}
		
	}
	
}

