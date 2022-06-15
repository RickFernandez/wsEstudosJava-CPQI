package estudosJavaP4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo2 {

	public static void main(String[] args) throws IOException {

		// Cria um path/ caminho para o arquivo
		Path path = Paths.get("C:/Usuários/Henrique Soares/OneDrive - CPQi/Área de Trabalho/wsEstudosJava/myFirstPrograms/src/files/texto.txt");
		
		//Cria uma variável com a versão de escrita
		Charset utf8 = StandardCharsets.UTF_8;
		
		// ESCRITA
		
		// Faz a ligação com o arquivo através de um objeto escritor 'w' passando o caminho e a versão da escrita (path, utf8)
		try(BufferedWriter w = Files.newBufferedWriter(path, utf8)) {
			w.write("Ola\n"); //Conteúdo a ser inserido no arquivo
			w.write("Mundo\n");
			w.write("=)\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// LEITURA
		try(BufferedReader reader = Files.newBufferedReader(path, utf8)) {
			String line = null;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}

}
