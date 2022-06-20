package estudosJavaP4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Arquivo4 {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("C:/Usuários/Henrique Soares/OneDrive - CPQi/Área de Trabalho/wsEstudosJava/myFirstPrograms/src/files/fonte.txt");
		
		/*System.out.println(Files.exists(path)); //Verifica se o caminho para o arquivo existe
		System.out.println(Files.isDirectory(path)); //Verifica se este arquivo é um diretório
		System.out.println(Files.isRegularFile(path)); //Verifica se o arquivo é um arquivo regular
		System.out.println(Files.isReadable(path)); //Verifica se o arquivo pode ser lido
		System.out.println(Files.isExecutable(path)); //Verifica se o arquivo pode ser execuado
		System.out.println(Files.size(path)); //Verifica o tamanho do arquivo
		System.out.println(Files.getLastModifiedTime(path)); //Retorna a ultima vez que o arquivo foi modificado
		System.out.println(Files.getOwner(path)); //Retorna o dono do arquivo
		System.out.println(Files.probeContentType(path)); //Retorna o tipo do arquivo
		
		 DELETE
		Files.delete(path); //Deleta um arquivo/ diretório
		Files.deleteIfExists(path); //Deleta apenas se o arquivo existir
		*/
		
		// CREATE
		Files.deleteIfExists(path);
		Files.createFile(path);
		Files.write(path, "Meu Texto".getBytes());
		
		// COPY
		Path copy = Paths.get("C:/Usuários/Henrique Soares/OneDrive - CPQi/Área de Trabalho/wsEstudosJava/myFirstPrograms/src/files/copia.txt");
		
		Files.copy(path, copy, StandardCopyOption.REPLACE_EXISTING); //Faz uma copia de um arquivo passando o método 'StandardCopyOption.REPLACE_EXISTING' fazendo com que substitua o arquivo 'copy' caso ele ja exista
		
		// MOVE
		Path move = Paths.get("C:/Usuários/Henrique Soares/OneDrive - CPQi/Área de Trabalho/wsEstudosJava/myFirstPrograms/src/files/move/copia.txt");
		
		Files.createDirectories(move.getParent());
		Files.move(path, move, StandardCopyOption.REPLACE_EXISTING);
		
	}

}
