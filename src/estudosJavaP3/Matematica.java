package estudosJavaP3;

public class Matematica {
	
	// Método que realiza a soma de diversos valores informados
	double soma(double ... numeros) // Os '...' colocados nos parametros informa ao programa que ele pode receber diversos valores (no caso seriam os 'numeros') 
	{
		double total = 0;
		for(double n : numeros) // Realiza um Foreach percorrendo o Array de numeros informados
		{
			total += n; // Reaiza a soma dos valores encontrados no Array
		}
		return total;
	}
	
	// Método que calcula a média da soma entre 2 números
	double media(int x, int y) {
		System.out.println("media(int x, int y)");
		return (x + y) / 2;
	}
	
	// Método para calclar a média de duas strings
	double media(String x, String y) {
		System.out.println("media(String x, String y)");
		//Faz a conversão das Strings para números inteiros
		int ix = Integer.parseInt(x);
		int iy = Integer.parseInt(y);
		return (ix + iy) / 2;
	}
	
	// Método que calcula a média de uma quantidade ilimitada de números informados
	double media(double ... numeros) 
	{
		System.out.println("media(double ... numeros)");
		return this.soma(numeros) / numeros.length; //Realiza a soma dos números dentro do Array e depois faz uma divisão pela quantidade de espaços que este Array tem (numeros.length)
	}
}

/*
	RESUMO - Métodos Sobrecarregados e Argumentos Variáveis ('...')
	
	Pode-se ter diversos Métodos com o mesmo nome, porém, com suas escritas diferentes. De acordo com os parâmetros informados, o programa decidirá qual método se encaixa melhor para realizar a opração
*/