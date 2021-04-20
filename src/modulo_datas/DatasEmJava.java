package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {

	
	public static void main(String[] args) throws ParseException {
		
		Calendar calendar = Calendar.getInstance();
		
		Date date = new Date();
		
		System.out.println("Data em milisegundos: " + date.getTime());
		System.out.println("Calendar em milisegundos: " + calendar.getTimeInMillis());
		System.out.println("------------------------------------------------------------");
		
		System.out.println("Dia do mês: " + date.getDate());
		System.out.println("Calendar do mês: " + calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("------------------------------------------------------------");
		
		System.out.println("Dia da semana: " + date.getDay());
		System.out.println("Calendar da semana: " + (calendar.get(calendar.DAY_OF_WEEK ) - 1));
		System.out.println("------------------------------------------------------------");
		
		
		System.out.println("Hora do dia: " + date.getHours());
		System.out.println("Calendar do dia: " + calendar.get(calendar.HOUR_OF_DAY));
		System.out.println("------------------------------------------------------------");
		
		System.out.println("Minuto da Hora: " + date.getMinutes());
		System.out.println("Calendar minuto da Hora: " + calendar.get(calendar.MINUTE));
		System.out.println("------------------------------------------------------------");
		
		
		System.out.println("Segundos: " + date.getSeconds());
		System.out.println("Calendar Segundos: " + calendar.get(calendar.SECOND));
		System.out.println("------------------------------------------------------------");
		
		System.out.println("Ano: " + date.getYear()); //1900 + 121 - data atual  + 1900 (2021)
		
		System.out.println("Ano: " + (date.getYear() + 1900));
		System.out.println("Calendar Ano: " + calendar.get(calendar.YEAR) );
		
		System.out.println("------------------------------------------------------------");
		
		/*---------------SIMPLES DATE FORMAT----------------*/
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy  HH:mm.ss");
		
		System.out.println("Data atual em formato padrão e String: " + simpleDateFormat.format(date));
		System.out.println("Calendar Data atual em formato padrão e String: " + simpleDateFormat.format(calendar.getTime()));
		System.out.println("------------------------------------------------------------");
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");
		
		System.out.println("Data em formato para banco de dados: " + simpleDateFormat.format(calendar.getTime()));
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("Objeto Date: " + simpleDateFormat.parse("1984-05-30 "));
		
		
		simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("Objeto Date: " + simpleDateFormat.parse("30-05-1984 "));
		System.out.println("------------------------------------------------------------");
		
	}
}
