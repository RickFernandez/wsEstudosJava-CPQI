package threads;

public class ContaConjunta {
	
	private int saldo = 100;
	
	public int getSaldo() {
		return saldo;
	}
	
	public synchronized void sacar(int valor, String cliente) //Cria um método sincronizado, onde apenas 1 Thread conseguirá executar ele
	{
		if (saldo >= valor) {
			int saldoOriginal = saldo;
			System.out.println(cliente + " vai sacar"); //Agardando processamente da solicitação de saque
			try {
				System.out.println(cliente + " esperando");
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {} 
			saldo -= valor;
			String msg = cliente + " sacou " +valor + " [Saldo Original=" + saldoOriginal +  ", Saldo final=" + saldo + "]";
			System.out.println(msg);
			
		} else {
			System.out.println("Saldo insuficiente para " + cliente);
		
		}
	}
}
