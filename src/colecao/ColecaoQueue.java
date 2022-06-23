package colecao;

import java.util.LinkedList;
import java.util.Queue;

public class ColecaoQueue {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		fila.add("Ricardo");
		fila.add("Henrique");
		fila.offer("Gabriel");
		//Tanto '.add' quanto '.offer' adicionam elementos as Queues
		System.out.println(fila);
		
		System.out.println(fila.peek()); //Retorna qual o próximo elemento da Fila
		System.out.println(fila.poll()); //emove o elemento no inicio da fila e retorna o elemento removido
		System.out.println(fila);

		/* OUTROS MÉTODOS DISPONÍVEIS */
		LinkedList<String> f = (LinkedList<String>) fila;
		f.addFirst("Caio"); //Adiciona um elemento no início da fila
		f.addFirst("Juliana"); //Adiciona um elemento no fim da fila
		System.out.println(fila);


	}
}

/*
	QUEUE

	- Seguem o padrão FIFO (First In - First Out)

*/