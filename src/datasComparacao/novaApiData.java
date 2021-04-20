package datasComparacao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class novaApiData {

	public static void main(String[] args) {

		/*Nova API de data apartir do java8*/
		
		LocalDate dataAtual = LocalDate.now();
		
		System.out.println("Data Atual: " + dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		LocalTime horaAtual = LocalTime.now();
		System.out.println("Hora atual: " + horaAtual.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
		
		
		LocalDateTime dataAtualHoraAtual = LocalDateTime.now();
		//System.out.println("Data e hora atual : " + dataAtualHoraAtual.format(DateTimeFormatter.BASIC_ISO_DATE));
		//System.out.println("Data e hora atual : " + dataAtualHoraAtual.format(DateTimeFormatter.ISO_DATE_TIME));
		System.out.println("Data e hora atual : " + dataAtualHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
	
		
		
	}

}
