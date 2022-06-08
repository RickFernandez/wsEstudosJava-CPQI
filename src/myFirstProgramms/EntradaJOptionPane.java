package myFirstProgramms;

import javax.swing.JOptionPane;

public class EntradaJOptionPane {
	public static void main(String[] args) {
		
		
		String nome = JOptionPane.showInputDialog("Qual o seu nome?"); //Faz abrir uma janela PopUp para que o usuário informe o nome dele, e guarda essa informação em uma variável
		String idade = JOptionPane.showInputDialog("Qual a sua idade?");
		JOptionPane.showMessageDialog(null, nome + " tem " + idade + " anos "); //Imprime as informações em uma frase, em uma janela PopUp
		System.out.println(nome + " tem " + idade + " anos ");
	} 
}
