package datasComparacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatasComp {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		

		Date dataVencimentoBoleto = simpleDateFormat.parse("21/04/2021");
		
		Date dataAtualHoje = simpleDateFormat.parse("19/04/2021");
		
		/*Se a data 1 é maior que a data 2*/
		//After: Se data 1 é maior que data 2
		/*
		if (dataVencimentoBoleto.after(dataAtualHoje)) { 
			System.out.println("Boleto não vencido");
		}else {
			System.out.println("Boleto vencido - URGENTE");
		}*/
		
		//Before: Se data 1 é menor que data 2
		if (dataVencimentoBoleto.before(dataAtualHoje)) { 
		
			System.out.println("Boleto vencido - URGENTE");
		}else {
			System.out.println("Boleto não vencido");
		}
	}

}
