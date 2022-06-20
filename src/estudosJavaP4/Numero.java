package estudosJavaP4;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Numero {

	public static void main(String[] args) throws ParseException {
		
		double saldo = 123_456.789;
		
		NumberFormat f = NumberFormat.getInstance(); // 'getInstace()' - formatação de números padrão
		System.out.println(f.format(saldo)); 
		
		f = NumberFormat.getIntegerInstance(); // 'getIntegerInstace()' - formatação de números inteiros
		System.out.println(f.format(saldo));
		
		f = NumberFormat.getPercentInstance(); // 'getPercentInstance()' - formatação de percentuais
		System.out.println(f.format(0.25));

		f = NumberFormat.getCurrencyInstance(); // 'getCurrenInstance()'  formatação para moedas
		System.out.println(f.format(saldo));
		
		f.setMaximumFractionDigits(1); // Informa quantas casas decimais o programa deve apresentar
		System.out.println(f.format(saldo));
	
	
		System.out.println("=============================");
		
		/* INTERNACIONALIZAÇÃO */
		f = NumberFormat.getCurrencyInstance(Locale.US); // Converte o valor para o formato de dólar
		System.out.println(f.format(saldo));
		
		f = NumberFormat.getCurrencyInstance(Locale.JAPAN);
		System.out.println(f.format(saldo));
		
	
	}
}
