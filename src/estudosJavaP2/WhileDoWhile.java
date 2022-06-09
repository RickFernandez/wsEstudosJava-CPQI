package estudosJavaP2;

public class WhileDoWhile {
	
	public static void main(String[] args) {
		
		int i = 0;
		
		while (i < 5) {
			i++;
			System.out.println(i);
		}
		
		System.out.println("========= do while =========");
		
		int j = 0;
		
		do {
			System.out.println(j);
			j++;
		} while (i < 3);
	}
}
