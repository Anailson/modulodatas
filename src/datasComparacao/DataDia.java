package datasComparacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataDia {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.now();//mostra a data atual
		System.out.println("Data atual :" + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("Dia da semana: " + localDate.getDayOfWeek().name());
		
		System.out.println("Dia do mês: " + localDate.getDayOfMonth());
		
		System.out.println("Dia do ano: " + localDate.getDayOfYear());
		
		System.out.println("Mês: " + localDate.getMonth());
		
		System.out.println("Ano: " + localDate.getYear());
		
		
	}

}
