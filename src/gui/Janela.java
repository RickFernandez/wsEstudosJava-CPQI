package gui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela extends JFrame {

	public Janela() {

		super("Minha Janela");
		JButton botao = new JButton("Clique"); //Cria um botao
		
		getContentPane().add(botao); //Inicia o botão dentro da janela
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Define o fechamento da janela e do programa assim que o usuário clicar no X
		setSize(300, 300); //Define o tamanho
		setVisible(true); //Define a visibilidade da janela (true = visivel)
		
	}
	
	public static void main(String[] args) {
		
		new Janela();
		
	}
}
