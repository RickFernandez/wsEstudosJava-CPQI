package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConversorTemperatura extends JFrame implements ActionListener {
	
	JTextField ftext;
	JTextField ctext;
	JButton button;
	
	public ConversorTemperatura() {
		super("Conversor de Temperatura");
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(450, 200);
		setVisible(true);

		JLabel fahrenheit = new JLabel("Fahrenheit:");
		fahrenheit.setFont(new Font("serif", Font.PLAIN, 26));
		
		JLabel celsius = new JLabel("Celsius:");
		celsius.setFont(new Font("serif", Font.PLAIN, 26));
		
		ftext = new JTextField();
		ftext.setFont(new Font("serif", Font.PLAIN, 26));
		
		ctext= new JTextField();
		ctext.setFont(new Font("serif", Font.PLAIN, 26));
		
		button = new JButton("Converter");
		button.setFont(new Font("serif", Font.PLAIN, 26));
		button.addActionListener(this);
		
		Container c = getContentPane();
		Container c2 = new JPanel();
		
		c2.setLayout(new GridLayout(2, 2, 5, 5));
		c2.add(fahrenheit);
		c2.add(ftext);
		c2.add(celsius);
		c2.add(ctext);
		
		c.add(c2);
		c.add(BorderLayout.SOUTH, button);
		
	}
	
	
	public static void main(String[] args) {
		
		new ConversorTemperatura();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			double fahrenheit = Double.parseDouble(ftext.getText());
			double celsius = (fahrenheit - 32) / 1.8;
			BigDecimal bd = new BigDecimal(celsius).setScale(4, RoundingMode.HALF_EVEN);
			ctext.setText(bd + " °C");
		
		} catch (Exception erro) {
			erro.printStackTrace();
		}

	}
}
