package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ControleTextArea extends JFrame implements ActionListener {

	JTextArea texto;
	
	public ControleTextArea() {
		
		super("Editor de Textos");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 300);
		setVisible(true);
		
		texto = new JTextArea(); //Cria um textArea
		texto.setFont(new Font("serif", Font.PLAIN, 26));
		texto.append("Ola Mundo");
		
		JScrollPane scroll = new JScrollPane(texto); //Assim que necessário, o programa cria um Scoll na tela
		
		JButton botao = new JButton("Abrir Arquivo");
		botao.setFont(new Font("erif", Font.PLAIN, 26));
		botao.addActionListener(this);
		
		Container c = getContentPane();
		c.add(BorderLayout.CENTER, scroll);
		c.add(BorderLayout.SOUTH, botao);
		
	}
	
	public static void main(String[] args) {
		
		new ControleTextArea();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JFileChooser c = new JFileChooser(); //Cria um objeto seletor de arquivo
		c.showOpenDialog(this); //Faz com que ele abra a pasta de arquivos
		File file = c.getSelectedFile(); //Adiciona o arquivo selecionado a um objeto
		
		try {
			Path path = Paths.get(file.getAbsolutePath()); //Recupera o caminho
			Files.readAllBytes(path); //Faz a leitura dos bytes
			String retorno = new String(Files.readAllBytes(path)); //Converse de byte para String
			texto.setText(retorno); //Adiciona a String no textArea
			
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(this, "Erro ao tentar abrir o Arquivo");
		}
	}
}
