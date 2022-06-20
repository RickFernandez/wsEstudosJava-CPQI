package estudosJavaP4;

import java.util.Calendar;
import java.util.Date;

public class Datas {

	public static void main(String[] args) {
		
		/* 01/01/1970 - hoje */
		System.out.println(System.currentTimeMillis());
		
		Date agora = new Date(); //Objeto do time 'Date'
		System.out.println(agora); //Retorno do objeto onde mostra o horário do dia atual
		
		Date data = new Date(1_000_000_000_000L);
		System.out.println(data); //Qual foi a data após 1 trilhão de mili-segundos depois de 01/01/1970
		
		/* MÉTODOS */
		data.getTime(); //Recupera o tempo atual em ms
		data.setTime(0); //Define um tempo em ms
		System.out.println(data.compareTo(agora)); //Compara duas datas, e caso 'data' seja menor do que 'agora', retorna -1, igual = 0 e maior = 1 
	
		/* MANIPULAÇÃO DE DATAS */
		Calendar c = Calendar.getInstance(); // new GregorianCalendar();
		c.set(2003, Calendar.AUGUST, 4); //Seta uma data
		System.out.println(c.getTime()); // getTime() - retorna o objeto do tipo 'Calendar'
		System.out.println(c.get(Calendar.YEAR)); //Ano
		System.out.println(c.get(Calendar.MONTH)); //Mês - conta de 0-11
		System.out.println(c.get(Calendar.DAY_OF_YEAR)); //Dia do ano
		System.out.println(c.get(Calendar.DAY_OF_MONTH)); //Dia do mês

		c.set(Calendar.YEAR, 2000); //Altera o ano
		System.out.println(c.get(Calendar.YEAR));

		c.clear(Calendar.MINUTE); //Limpa o campo de minuto
		c.clear(Calendar.SECOND); //Limpa o campo de segundo
		System.out.println(c.getTime());

		c.add(Calendar.DAY_OF_MONTH, 1); //Adiciona 1 dia do mês na data
		c.add(Calendar.YEAR, -1); 
		System.out.println(c.getTime());
		

		c.roll(Calendar.DAY_OF_MONTH, 30); // '.roll' funciona como um '.add' porém, ao chegar nos útimos dias do mês ele volta a contar do dia 01 em vez de pular para o próx mês
		System.out.println(c.getTime());
		
		
		
		
		/* SAUDAÇÃO */
		Calendar c1 = Calendar.getInstance();
		int hora = c1.get(Calendar.HOUR_OF_DAY);
		
		if(hora <= 12) {
			System.out.println("Bom Dia!");
		
		} else if (hora > 12 && hora < 18) {
			System.out.println("Boa Tarde!");
		
		} else {
			System.out.println("Boa Noite!");
		}
		
		
	}
}
