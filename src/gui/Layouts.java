package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layouts extends JFrame {

	public Layouts() {
		super("Layouts");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);

		Container c = getContentPane(); //Recupera o container com layouts de janelas do Java
		c.setLayout(new FlowLayout()); //Define um layout(FlowLayout) para a janela

		
		c.add(BorderLayout.NORTH, new JButton("1"));
		c.add(BorderLayout.SOUTH, new JButton("2"));
		c.add(BorderLayout.CENTER,new JButton("3"));
		c.add(BorderLayout.EAST, new JButton("4"));
		c.add(BorderLayout.WEST, new JButton("5"));
		
		
	}
	
	public static void main(String[] args) {
		
		new Layouts();
		
	}
}
