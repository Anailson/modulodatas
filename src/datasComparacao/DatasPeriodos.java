package datasComparacao;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;

public class DatasPeriodos {

	public static void main(String[] args) throws ParseException, InterruptedException {

		LocalDate dataAntiga = LocalDate.of(2020, 2, 7);
		
		LocalDate dataNova= LocalDate.of(2021, 4, 21);
		
		System.out.println("Data antiga é maior que a data nova: " + dataAntiga.isAfter(dataNova));
		
		
		System.out.println("Data antiga é anterior a nova: " + dataAntiga.isBefore(dataNova));
		
		System.out.println("Datas são iguais: " + dataAntiga.isEqual(dataNova));
		
		Period periodo = Period.between(dataAntiga, dataNova);
		
		System.out.println("Quantas dias: " + periodo.getDays());
		
		System.out.println("Quantos meses: " +periodo.getMonths());
		
		System.out.println("Quantos anos: " + periodo.getYears());
		
		System.out.println("Periodo é : " + periodo.getYears() + "anos :"
				+ periodo.getMonths() + "e dias: " + periodo.getDays());
		
		
	}

}
