package threads;

//Cria uma nova Thread
public class PingPong extends Thread {

	String palavra;
	long tempo;
	
	public PingPong(String palavra, long tempo) {
		this.palavra = palavra;
		this.tempo = tempo;
	}
	
	//Método 'run()' é o que executa os objetos da Thread
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
	
	public static void main(String[] args) {
		
		//Cria 2 objetos do tipo PingPong acordando-os
		new PingPong("ping", 1500).start();
		new PingPong("pong", 2000).start();
		System.out.println("Ver Thread");
	
	}
}
