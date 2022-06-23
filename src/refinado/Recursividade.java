package refinado;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Recursividade {

	//Método recursivo (Método que retorna ele mesmo)
	public static int soma(int x) {
		if(x == 0) {
			return x;
		}
		else {
			System.out.println(x);
			return x + soma(x - 1); // 3 + (2 + (1))
		}
	}
	
	public static int potencia(int x, int e) {
		if(e == 1) {
			System.out.println(x);
			return x;
		}
		else {
			int y = x * potencia(x, e-1);
			System.out.println(y);
			return y;
			
		}
	}
	
	public static void listar(Path path) {
		if(Files.isReadable(path)) {
			System.out.println(path.toAbsolutePath());
		}
		else {
			System.err.println(path.toAbsolutePath());
			try {
				DirectoryStream<Path> stream = Files.newDirectoryStream(path);
				for (Path p : stream) {
					listar(p);
				}
			}
			catch (Exception e) {}
		}
	}
	
	public static void main(String[] args) {
		//System.out.println(soma(10));
		//System.out.println(potencia(3, 4));
		listar(Paths.get("C:/Users/Henrique Soares/OneDrive - CPQi/Área de Trabalho/wsEstudosJava/myFirstPrograms/src/"));
	}
}
