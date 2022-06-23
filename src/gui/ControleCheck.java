package gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ControleCheck extends JFrame {

	JTextField texto;
	JCheckBox bold, italic;
	
	public ControleCheck() {
		super();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	
		texto = new JTextField("Veja a Fonte Mudar", 12);
		texto.setFont(new Font("serif", Font.PLAIN, 26));
	
		bold = new JCheckBox("Bold");
		bold.addItemListener(new CheckListener());
		
		italic = new JCheckBox("Italic");
		italic.addItemListener(new CheckListener());
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(texto);
		c.add(bold);
		c.add(italic);
	
	}
	
	class CheckListener implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(bold.isSelected() && italic.isSelected()) {
				texto.setFont(new Font("serif", Font.BOLD | Font.ITALIC, 26));
			
			} else if(bold.isSelected()) {
				texto.setFont(new Font("serif", Font.BOLD, 26));
			
			} else if(italic.isSelected()) {
				texto.setFont(new Font("serif", Font.ITALIC, 26));
			
			} else {
				texto.setFont(new Font("serif", Font.PLAIN, 26));
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		new ControleCheck();
		
		
	}
}
