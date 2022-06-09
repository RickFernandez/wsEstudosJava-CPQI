package poo;

public class Matematica {
	
	/**
	 * @param numero
	 * @return - a raiz quadrada do numero segunda a equação de Pell
	 */
	int raiz(int numero) {
		int raiz = 0, impar = 1;
		
		while(numero >= impar) {
			numero -= impar;
			impar += 2; //Próximo nº impar
			++raiz;
		}
		
		return raiz;
	}
	
	
	/**
	 * @param um
	 * @param dois
	 * @return - o maior dos dois numeros
	 */
	int maior(int um, int dois) {
		if(um > dois) {
			return um;
		} else {
			return dois;
		}
	}
	
	double soma(double um, double dois) {
		double s = um + dois;
		return s;
	}
}
