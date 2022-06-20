package estudosJavaP4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import poo.Conta;

public class Serializa2 {

		// MÉTODO PARA ARMAZENAR AS CONTAS
		public void armazenar (ArrayList<Conta> contas) throws IOException {
			
			//Cria um caminho para o arquivo
			try(FileOutputStream fos = new FileOutputStream("C:/Usuários/Henrique Soares/OneDrive - CPQi/Área de Trabalho/wsEstudosJava/myFirstPrograms/src/files/contas.ser")) {
				
				//Inicializa o arquivo com um objeto escritor
				try(ObjectOutputStream oos = new ObjectOutputStream(fos)) {
					oos.writeObject(contas); //Adiciona todos os objetos(contas) no arquivo
				}
			}	
		}
		
		// MÉTODO PARA RECUPERAR AS CONTAS
		public ArrayList<Conta> recuperar() throws IOException, ClassNotFoundException {
			//Cria o caminho até o arquivo
			try(FileInputStream fis = new FileInputStream("C:/Usuários/Henrique Soares/OneDrive - CPQi/Área de Trabalho/wsEstudosJava/myFirstPrograms/src/files/contas.ser")) {
				
				//Inicializa o arquivo com um objeto leitor
				try(ObjectInputStream ios = new ObjectInputStream(fis)) {
					return (ArrayList<Conta>) ios.readObject(); //Retorna um ArrayList com todos os objetos lidos no arquivo
				}
			}
			
		}
		
		public static void main(String[] args) throws IOException {
			
			ArrayList<Conta> contas = new ArrayList<>();
			
			contas.add(new Conta("Rick", 12000.23));
			contas.add(new Conta("Sandra", 11050.32));
			contas.add(new Conta("Biel", 18000.21));
			contas.add(new Conta("Sueli", 23200.09));

			Arquivo3Desafio operacao = new Arquivo3Desafio();
			operacao.armazenar(contas);


			ArrayList<Conta> contas2 = operacao.recuperar();
			for (Conta conta : contas2 ) {
				conta.exibeSaldo();
			}
		}

}
