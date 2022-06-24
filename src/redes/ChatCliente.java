package redes;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatCliente extends JFrame {

	private String nome;
	JTextField textoEnviar;
	Socket socket;
	PrintWriter writer;
	JTextArea receivedText;
	Scanner reader;
	
	public ChatCliente(String nome) {
		super("Chat: " + nome);
		this.nome = nome;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
		
		Font fonte = new Font("serif", Font.PLAIN, 16);
		
		textoEnviar = new JTextField();
		textoEnviar.setFont(fonte);
		
		JButton botao = new JButton("Enviar");
		botao.setFont(fonte);
		botao.addActionListener(new EnviarListener());
		
		receivedText = new JTextArea();
		receivedText.setFont(fonte);
		JScrollPane scroll = new JScrollPane(receivedText);
		
		Container envio = new JPanel();
		envio.setLayout(new BorderLayout());
		
		envio.add(BorderLayout.CENTER, textoEnviar);
		envio.add(BorderLayout.EAST, botao);
		
		getContentPane().add(BorderLayout.SOUTH, envio);
		getContentPane().add(BorderLayout.CENTER, scroll);
		
		configurarRede();
		
	}
	
	private void configurarRede() {
		try {
			socket = new Socket("127.0.0.1", 4000);
			writer = new PrintWriter(socket.getOutputStream());
			reader = new Scanner(socket.getInputStream());
			new Thread(new EscutaServidor()).start();
		} catch (Exception e) {}
	}
	
	public class EnviarListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			writer.println(nome + ": " + textoEnviar.getText()); //Envia a mensagem escrita ao servidor
			writer.flush(); //Garante que a mensagem foi enviada com sucesso
			textoEnviar.setText(""); //Limpa a área de texto após o envio
			textoEnviar.requestFocus();
			
		}
		
	}
	
	private class EscutaServidor implements Runnable {
		@Override
		public void run() {
			try {
				String text;
				while((text = reader.nextLine()) != null) {
					receivedText.append(text + "\n");
				}
			} catch (Exception e) {}
		}
	}
	
	public static void main(String[] args) {
		new ChatCliente("Henrique");
		new ChatCliente("Rick");
	}

}
