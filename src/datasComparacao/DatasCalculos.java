package datasComparacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DatasCalculos {

	public static void main(String[] args) throws ParseException {

		Calendar calendar = Calendar.getInstance();//pega a data atual
		
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("20-04-2021"));
		
		calendar.add(calendar.DAY_OF_MONTH, 05); //data de hoje mais 05 dias
		
		System.out.println("Somando o dia do mês: " +new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));

		
		calendar.add(Calendar.MONTH, 1);	
		System.out.println("Somando o mês: " +new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		
	}

}
