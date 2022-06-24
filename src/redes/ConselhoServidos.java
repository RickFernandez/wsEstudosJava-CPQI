package redes;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ConselhoServidos {

	
	public static void main(String[] args) throws IOException {
		
		ServerSocket server = new ServerSocket(4000); //Conecta o servidor na porta 4000
			while(true) {
				Socket socket = server.accept(); //Faz com que o servidor fique aguardando a chegada de um novo cliente
				
				try (PrintWriter w = new PrintWriter(socket.getOutputStream())) //Cria um objeto Escritor que vai enviar uma mensagem ao cliente
				{
					w.println("Aprenda Java e seja Contratado!");
					
				}
			}
		
	}
}
