package datasComparacao;

import java.text.ParseException;
import java.time.Duration;
import java.time.Instant;

public class TempoProcesso {

	public static void main(String[] args) throws ParseException, InterruptedException {

		
		Instant inicio = Instant.now();
		
		Thread.sleep(2000); //Pode um processo com tempo qql que n�o conhecemos
		
		Instant ifinal = Instant.now();
		
		Duration duracao = Duration.between(inicio, ifinal);
		
		System.out.println("Dura��o em nano segundos: " + duracao.toNanos());
		
		System.out.println("Dura��o em mininutos: " + duracao.toNanos());
		
		///System.out.println("Dura��o em horas: " + duracao.toDays());
				
		
	}

}
