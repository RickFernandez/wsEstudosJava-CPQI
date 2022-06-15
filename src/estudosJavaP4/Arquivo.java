package estudosJavaP4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("C:/Usuários/Henrique Soares/OneDrive - CPQi/Área de Trabalho/wsEstudosJava/myFirstPrograms/src/files/texto.txt"); //Cria / pega o caminho de um arquivo
		System.out.println(path.toAbsolutePath()); //Mostra o caminho absoluto do arquivo
		System.out.println(path.getParent()); //Mostra o pai do arquivo
		System.out.println(path.getRoot()); //Mostra a raiz do arquivo
		System.out.println(path.getFileName()); //Mostra o nome do arquivo
		
		// CRIAÇÃO DE DIRETÓRIOS
		Files.createDirectories(path.getParent());
	
		// ESCREVER E LER ARQUIVOS
		byte[] bytes = "Hello Word".getBytes(); //Converte o texto em Bytes e armazera em um Array
		Files.write(path, bytes); //Cria, limpa e escreve dentro do arquivo
		
		byte[] retorno = Files.readAllBytes(path);
		System.out.println(new String (retorno)); //Retorna o conteúdo escrito no arquivo em formato de String
	
	}

}
