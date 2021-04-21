package datasComparacao;

import java.time.LocalDate;

public class DataLocalDateParcelas {

	public static void main(String[] args) {
		
		LocalDate dataBase = LocalDate.parse("2020-07-04");
		
		System.out.println("Mais de 5 dias: " + dataBase.plusDays(5));
		
		System.out.println("Mais de 5 semanas: " + dataBase.plusWeeks(5));
		
		System.out.println("Mais de 5 anos: " + dataBase.plusYears(5));
		
		System.out.println("Menis de 1 ano: " + dataBase.minusYears(1));

	}

}
