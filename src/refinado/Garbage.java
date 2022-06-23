package refinado;

import java.util.ArrayList;
import java.util.List;

public class Garbage {

	// Método que sobrecarrega a memória
	public static long carregaMemoria() {
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < 100_000; i++) {
			list.add(i);
		}
		
		return Runtime.getRuntime().freeMemory(); // Retorna a quantidade de memória livre
	}
	
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		
		Runtime rt = Runtime.getRuntime();
		int MB = 1_048_576; //total de bytes em 1MB
		double total = rt.maxMemory() / MB; // Total de memória que possui
		
		double inicio = total - (carregaMemoria() / MB); // Memória disponível após ser carregada
		
		rt.runFinalization(); //Realiza a finalização dos métodos e objetos da memória
		rt.gc(); //Força a execução do Garbage-Colector
		
		double fim = total - (rt.freeMemory() / MB); // Calcula a quantidade de memória livre após a limpeza
		
		System.out.println("Total de Memoria: " + total + "MB");
		System.out.println("Inicio: " + inicio + "\nFim: " + fim);
	}
}
