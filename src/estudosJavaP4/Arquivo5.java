package estudosJavaP4;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo5 {

	public static void main(String[] args) throws IOException {
		
		Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories(); //Pega todos os diretórios raiz dentro do computador
		for(Path path : dirs) {
			System.out.println(path);
		}
		
		// LISTAR O CONTEÚDO DE UM DIRETÓRIO
		Path dir = Paths.get("C:/Usuários");
		try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
			
			for (Path path : stream) {
				System.out.println(path.getFileName());
			}
		} catch (IOException | DirectoryIteratorException e) {
			e.printStackTrace();
		}
		
		//PARTIÇÕES
		FileSystem fs = FileSystems.getDefault();//Cria um objeto que armzena as unidade de armazenamento disponíveis no PC
		for (FileStore store : fs.getFileStores()) //Percorre o Array separando cada unidade de armazenamento
		{
			System.out.println("\nUnidade: " + store.toString()); //Retorna as unidades de armazenamento
			System.out.println("Total: " + store.getTotalSpace()); //Retorna o espaço de armazenamento das unidades
			System.out.println("Disponivel: " + store.getUsableSpace()); //Retorna o espaço disponível de armazenamento
			System.out.println("Utilizada: " + (store.getTotalSpace() - store.getUsableSpace()));
		}
	}
}
