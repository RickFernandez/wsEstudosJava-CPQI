package estudosJavaP4;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Datas2 {

	public static void main(String[] args) throws ParseException {
		
		Calendar c = Calendar.getInstance();
		c.set(2003, Calendar.AUGUST, 04);
		Date date = c.getTime();
		System.out.println(date);
		
		/* FORMATAÇÃO DE DATAS */ System.out.println("=================================");
		DateFormat f = DateFormat.getDateInstance();
		System.out.println(f.format(date));
		
		
		/* FORMATAÇÃO DE HORAS */ System.out.println("=================================");
		f = DateFormat.getTimeInstance();
		System.out.println(f.format(date));
		
		/* FORMATAÇÃO DE DATA E HORAS */ System.out.println("=================================");
		f = DateFormat.getDateTimeInstance();
		System.out.println(f.format(date));
		
		
		
		/* ESTILOS */ System.out.println("=================================");
		f = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(f.format(date));
		f = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(f.format(date));
		f = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(f.format(date));
		f = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(f.format(date));
		
		Date data2 = f.parse("04/08/2003");
		System.out.println(data2);
		

		/* SimpleDateFormat */ System.out.println("=================================");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(date));
		System.out.println(sdf.parseObject("10/10/2010"));
		
		
		
		
		
		
		
		
		
		
		
	}
}
