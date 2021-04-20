package datasComparacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class parcelasDatas {
	
	public static void main(String[] args) throws ParseException {
		
		//SIMULANDO PARCELAS DE COMPRAS EM 12 PARCELAS
		
		Date dateInicial = new SimpleDateFormat("dd/MM/yyyy").parse("20/04/2021"); //data inicial da compra
		
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dateInicial);
		
		for (int parcela = 0; parcela <= 12; parcela++) {
			calendar.add(calendar.MONTH, 1); // add mês a cada interação do for
			
			System.out.println("Parcela número: " + parcela + "Vencimento é em: " 
			+ new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
			
		}
		
		
		
	}

}
