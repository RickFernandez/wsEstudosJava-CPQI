package estudosJavaP3;

public class MatematicaTeste {

	public static void main(String[] args) {
		
		Matematica m = new Matematica();
		
		System.out.println(m.soma(5, 3, 2));
		
		System.out.println(m.media(5, 3));
	
		System.out.println(m.media("50", "30"));
		
		System.out.println(m.media(5, 3, 50, 40));
	}
}
