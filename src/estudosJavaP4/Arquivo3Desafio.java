package estudosJavaP4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import poo.Conta;

public class Arquivo3Desafio {

	// Criando um caminho para o arquivo
	private Path path = Paths.get("C:/Usuários/Henrique Soares/OneDrive - CPQi/Área de Trabalho/wsEstudosJava/myFirstPrograms/src/files/contas.txt");
	
	// Versão da escrita
	private Charset utf8 = StandardCharsets.UTF_8;

	// MÉTODO QUE ARMAZENA AS CONTAS NO ARQUIVO
	public void armazenar (ArrayList<Conta> contas) throws IOException {
		
		// Inicializando o arquivo com um objeto escritor
		try(BufferedWriter writer = Files.newBufferedWriter(path, utf8)) {
			// Percorrendo o Array de contas e adicionando cada conta ao arquivo
			for (Conta conta : contas) {
				writer.write(conta.getCliente() + ";" + conta.getSaldo() + "\n");
			}
		}	
	}
	
	// MÉTODO QUE RECUPERA AS CONTAS ADICIONADAS
	public ArrayList<Conta> recuperar() throws IOException {
		// Criando um ArrayList para retornar as contas
		ArrayList<Conta> contas = new ArrayList<>();
		//Inicializa o arquivo com o objeto leitor
		try (BufferedReader reader = Files.newBufferedReader(path, utf8)) {
			String line = null;
			//Faz a leitura no arquivo e armazena cada conteúdo na variável 'line'
			while((line = reader.readLine()) != null) {
				String[] t = line.split(";"); //Faz a quebra dos conteúdos, separando nomes e saldos das contas
				Conta conta = new Conta(t[0], Double.parseDouble(t[1])); // Para cada linha lida no Arquivo, é criada uma nova Conta
				contas.add(conta);
			}
		}
		return contas;
	}
	
	public static void main(String[] args) throws IOException {
		
		// Criando um Array com as contas
		ArrayList<Conta> contas = new ArrayList<>();
		
		contas.add(new Conta("Rick", 12000.23));
		contas.add(new Conta("Sandra", 11050.32));
		contas.add(new Conta("Biel", 18000.21));
		contas.add(new Conta("Sueli", 23200.09));

		Arquivo3Desafio operacao = new Arquivo3Desafio();
		operacao.armazenar(contas); //Armazena todas as contas dentro do objeto 'operacao'
		
		// Cria um ArrayList(contas2) que recebe o valor de recuperação das contas armazenadas no objeto 'operacao'
		ArrayList<Conta> contas2 = operacao.recuperar();
		// Percorre o Array(contas2) e cada valor é salvo em uma variável(conta)
		for (Conta conta : contas2 ) {
			conta.exibeSaldo();
		}
	}

}

/*
	DESAFIO I/O
	
	Criar um programa com 2 métodos:
	
	1- Método que grava uma lista de contas, em arquivo sequencial;
	2- Método que lê esse arquivo, carregando os objetos do tipo conta novamente; 



*/