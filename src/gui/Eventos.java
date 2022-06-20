package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Eventos extends JFrame implements ActionListener {

	JButton botao;
	
	public Eventos() {
		super("Eventos");
	
		botao = new JButton("Clique Aqui"); //Inicia um botão
		botao.addActionListener(this); //Adiciona um evento de clique
		getContentPane().add(botao); //Insere ele na janela
		
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		new Eventos();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		botao.setText("FOI CLICADO"); //evento que ocorre quando o botão é clicado (troca de texto)
	}
}
