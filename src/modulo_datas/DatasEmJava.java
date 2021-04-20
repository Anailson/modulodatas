package modulo_datas;

import java.util.Date;

public class DatasEmJava {

	
	public static void main(String[] args) {
		
		
		Date date = new Date();
		
		System.out.println("Data em milisegundos: " + date.getTime());
		
		
		System.out.println("Dia do mês: " + date.getDate());
		
		System.out.println("Dia da semana: " + date.getDay());
		
		System.out.println("Hora do dia: " + date.getHours());
		
		System.out.println("Minuto da Hora: " + date.getMinutes());
		
		System.out.println("Segundos: " + date.getSeconds());
		
		System.out.println("Ano: " + date.getYear()); //1900 + 121 - data atual  + 1900 (2021)
		
		System.out.println("Ano: " + (date.getYear() + 1900));
		
	}
}
