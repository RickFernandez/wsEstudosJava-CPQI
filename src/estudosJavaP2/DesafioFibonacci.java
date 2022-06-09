package estudosJavaP2;

public class DesafioFibonacci {
	
	public static void main(String[] args) {
		
		int anterior = 0;
		int proximo = 1;
		
		System.out.println(anterior);
		
		
		while (proximo < 50) {
			System.out.println(proximo);
			proximo = proximo + anterior; //Próximo nº Fibonacci
			anterior = proximo - anterior;	//Atuaza o nº anterior
		}
		
		
	}
}
