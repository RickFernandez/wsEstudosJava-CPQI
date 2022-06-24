package redes;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ConselhoCliente {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket socket = new Socket("127.0.0.1", 4000); //Faz uma ligação com um servidor
		Scanner s = new Scanner(socket.getInputStream()); //Cria um objeto que irá receber a mensagem enviada pelo servidor
		System.out.println("Mensagem: " + s.nextLine());
		s.close();
		
	}
}
