package redes;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChatServer {
	
	List<PrintWriter> writers = new ArrayList<>();
	
	public ChatServer() {
		ServerSocket server;
		
		try {
			server = new ServerSocket(4000);
			while(true) {
				Socket socket = server.accept();
				new Thread(new EscutaCliente(socket)).start();
				PrintWriter p = new PrintWriter(socket.getOutputStream());
				writers.add(p);
			}
			
		 } catch (IOException e) {}
		
		
	}
	
	private void forwardMenssage(String text) {
		for (PrintWriter w : writers) {
			try {
				w.println(text);
				w.flush();
			} catch (Exception e) {}	
		}
	}
	
 	private class EscutaCliente implements Runnable {

		Scanner leitor;
		
		public EscutaCliente(Socket socket) {
			try {
				leitor = new Scanner(socket.getInputStream());
			} catch (IOException e) {}
		}

		@Override
		public void run() {
			String text;
			try {
				while((text = leitor.nextLine()) != null) {
					System.out.println(text);
					forwardMenssage(text);
				}
			} catch (Exception e) {}
		}
		
		
	}
	
	public static void main(String[] args) {
		new ChatServer();
	}
}
