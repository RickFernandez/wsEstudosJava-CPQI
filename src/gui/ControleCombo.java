package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControleCombo extends JFrame implements ItemListener {

	JComboBox<String> combo;
	JLabel label;
	ImageIcon[] imagens = {
			new ImageIcon(getClass().getResource("fotos/Foto1.jpg")),
			new ImageIcon(getClass().getResource("fotos/Foto2.jpg")),
			new ImageIcon(getClass().getResource("fotos/Foto3.jpg")),
			new ImageIcon(getClass().getResource("fotos/Foto4.jpg"))
	};
	
	public ControleCombo() {
		
		super("Galeria de Fotos");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 550);
		setVisible(true);
		
		Container c = getContentPane();
		
		combo = new JComboBox<String>();
		combo.setFont(new Font("serif", Font.PLAIN, 26));
		combo.addItem("Grécia");
		combo.addItem("México");
		combo.addItem("Portugal");
		combo.addItem("Barcelona");
		combo.addItemListener(this);
		
		label = new JLabel(imagens[0]);
		
		c.add(BorderLayout.NORTH, combo);
		c.add(BorderLayout.CENTER, label);
		
	}
	
	public static void main(String[] args) {
		
		new ControleCombo();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
		if(e.getStateChange() == ItemEvent.SELECTED) // Recupera o evento e ve qual tipo de mudança que aconteceu('e.getStateChange()')
		{
			label.setIcon(imagens[combo.getSelectedIndex()]);
			// Pega o Label e redefine o 'icone' de acordo com o index selecionado do combo
		}
	}
}
