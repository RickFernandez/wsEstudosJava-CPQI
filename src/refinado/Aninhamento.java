package refinado;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Aninhamento extends JFrame {

	JButton button;
	
	public Aninhamento() {
		super("Aninhamento");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(300, 300);
		
		button = new JButton("Ok");
		button.addActionListener(new ListenerAninhado());
		
		//Classe Anônima (Classe criada sem nome diretamente no método)
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Classe Anonima processa " + button.getText());
			}
		});
		
		
		getContentPane().add(button);
	
	}
	
	//Classe Aninhada (Classe criada dentro de outra classe)
	public class ListenerAninhado implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Classe Aninhada processa " + button.getText());
			
		}
		
	}
	
	public static void main(String[] args) {
		Aninhamento janela = new Aninhamento();
		
	}
}
