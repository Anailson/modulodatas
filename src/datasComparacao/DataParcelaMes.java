package datasComparacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataParcelaMes {

	public static void main(String[] args) {
		
		LocalDate dataBase = LocalDate.of(2020, 2, 7);
		
		for (int mes = 0; mes <= 12; mes++) {
			dataBase = dataBase.plusMonths(-1);
			
			System.out.println("Data de vencimento do boleto : "+
			dataBase.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+ " do mês: " + mes);
			
		}

	}

}
