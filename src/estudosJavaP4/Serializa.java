package estudosJavaP4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

import poo.Conta;

public class Serializa {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//String[] nomes = {"Rick", "Gabriel", "Milena"};
		

		Conta conta1 = new Conta("Rick", 111_222_333.444);
		Conta conta2 = new Conta("Henrique", 111_222_333.444);
		
		// ESCRITA DE OBJETO
		FileOutputStream fos = new FileOutputStream("C:/Usuários/Henrique Soares/OneDrive - CPQi/Área de Trabalho/wsEstudosJava/myFirstPrograms/src/files/objeto.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos); //Realiza a gravação nos arquivos
		
		//oos.writeObject(nomes); //Grava o objeto 'nomes' dentro do endereço
		//oos.close(); //Fecha a ligação com o arquivo
		
		oos.writeObject(conta1);
		oos.writeObject(conta2);
		oos.close();
		
		// LEITURA
		FileInputStream fis = new FileInputStream("C:/Usuários/Henrique Soares/OneDrive - CPQi/Área de Trabalho/wsEstudosJava/myFirstPrograms/src/files/objeto.ser");
		ObjectInputStream ios = new ObjectInputStream(fis);
		
		//String[] nomes1 = (String[]) ios.readObject(); //Retorna os conteúdos do arquivo como objetos e salva os objetos dentro de um array
		//ios.close();
		//System.out.println(Arrays.toString(nomes1)); //Imprime os objetos dentro do array conventendo-os para String
		
		Conta c1 = (Conta) ios.readObject();
		Conta c2 = (Conta) ios.readObject();
		ios.close();
		c1.exibeSaldo();
		c2.exibeSaldo();
	}
}
