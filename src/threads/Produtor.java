package threads;

import java.util.Random;

public class Produtor implements Runnable
{
	private Ponte ponte;
	private Random random = new Random();
	
	public Produtor(Ponte ponte) {
		this.ponte = ponte;
	}
	
	
	@Override
	public void run() {
		int total = 0;
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(random.nextInt(3000)); //Coloca a Thread para dormir um tempo indeterminado
				total += i; //Implementa os números gerados a variável local
				ponte.set(i); //Armazena o número gerado na ponte
				System.out.println("\t" + total);
				
			}
			catch (InterruptedException e) {}
		}
	}

}
