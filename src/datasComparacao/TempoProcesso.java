package datasComparacao;

import java.text.ParseException;
import java.time.Duration;
import java.time.Instant;

public class TempoProcesso {

	public static void main(String[] args) throws ParseException, InterruptedException {

		
		Instant inicio = Instant.now();
		
		Thread.sleep(2000); //Pode um processo com tempo qql que não conhecemos
		
		Instant ifinal = Instant.now();
		
		Duration duracao = Duration.between(inicio, ifinal);
		
		System.out.println("Duração em nano segundos: " + duracao.toNanos());
		
		System.out.println("Duração em mininutos: " + duracao.toNanos());
		
		///System.out.println("Duração em horas: " + duracao.toDays());
				
		
	}

}
