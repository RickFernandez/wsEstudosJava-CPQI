package gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControleLabel extends JFrame {

	public ControleLabel() {
		super("Label");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);

		JLabel simples = new JLabel("Label Simples"); //Cria um 'label' com um texto
		simples.setToolTipText("Meu Tooltip"); //Adiciona um 'ToolTip' ao Label
		
		Font fonte = new Font("serif", Font.BOLD | Font.ITALIC, 28); //Cria uma fonte de texto
		JLabel label = new JLabel("Font Label");
		label.setFont(fonte);
		label.setForeground(Color.BLUE); //Adiciona uma cor ao Label
		
		ImageIcon icon = new ImageIcon(getClass().getResource("fotos/HelloWord.png")); //Cria um objeto, com uma imagem armazenada nele
		JLabel imagem = new JLabel(icon);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(simples);
		c.add(label);
		c.add(imagem);
	}
	
	public static void main(String[] args) {
		
		new ControleLabel();
		
		
	}
}
