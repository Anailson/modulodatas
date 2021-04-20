package datasComparacao;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DatasFaixaTempo {

	public static void main(String[] args) throws ParseException {

		//Date dataPassada = new SimpleDateFormat("dd/MM/yyyy").parse("01/02/2021");
		
		
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("2021-02-01"),LocalDate.now());//total de dias de 1 ate hoje
		
		
		System.out.println("Possui " + dias + " dias entre a faixa de data");
		
	}

}
