package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layouts2 extends JFrame {

	public Layouts2() {
		super("Layouts2");
		
		//Cria um BorderLayout
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		//Cria um GridLayout e adiciona os butões
		Container c2 = new JPanel();
		c2.setLayout(new GridLayout(4, 1));
		c2.add(new JButton("Ok"));
		c2.add(new JButton("Cancel"));
		c2.add(new JButton("Setup..."));
		c2.add(new JButton("Help"));
		
		//Adiciona o botão de centro e o GridLayout dentro do BorderLayout
		c.add(BorderLayout.CENTER, new JButton("Centro"));
		c.add(BorderLayout.EAST, c2);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new Layouts2();
		
		
	}
}

/*
c.setLayout(new BorderLayout(10, 10)); //Define o layout da tela com um  espaçamento de 10px entre os elementos
c.add(BorderLayout.NORTH, new JButton("N"));
c.add(BorderLayout.SOUTH, new JButton("S"));
c.add(BorderLayout.CENTER, new JButton("C"));
c.add(BorderLayout.EAST, new JButton("E"));
c.add(BorderLayout.WEST, new JButton("W"));


c.setLayout(new GridLayout(2, 3)); //Define um GridLayout com 2 linhas e 3 colunas 
c.add(new JButton("1"));
c.add(new JButton("2"));
c.add(new JButton("3"));
c.add(new JButton("4"));
c.add(new JButton("5"));
c.add(new JButton("6"));
*/
