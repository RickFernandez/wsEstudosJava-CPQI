package refinado;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflexao {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, InvocationTargetException {
		
		String nome = "poo.Conta";
		
		Class classe = Class.forName(nome); // Cria uma classe a partir do nome da classe armazenada em 'nome'
		System.out.println(classe.getSimpleName()); // Pega o nome simplificado da Classe
		
		Field[] f = classe.getFields(); // Recupera os campos(públicos) da classe e armazena em um objeto
		for (Field field : f) {
			System.out.println(field);
		}
		
		Method[] m = classe.getDeclaredMethods(); // Recupera os métodos da classe
		for (Method method : m) {
			System.err.println(method.getName());
		}
		
		Constructor[] c = classe.getConstructors();
		for (Constructor constructor : c) {
			System.out.println(constructor);
		}
	
		// Cria um objeto do tipo Conta
		Object o = classe.newInstance();
		
		// Recupera e aciona os métodos da Classe no objeto instanciado
		Method md = classe.getMethod("deposita", double.class);
		Method me = classe.getMethod("exibeSaldo");
		md.invoke(o, 120);
		me.invoke(o);
		
		Constructor co = classe.getConstructor(String.class, double.class);
		Object obj = co.newInstance("Henrique", 123_456.789);
		me.invoke(obj);
	
	}
}
