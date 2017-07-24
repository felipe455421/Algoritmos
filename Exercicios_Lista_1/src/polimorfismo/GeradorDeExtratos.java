package polimorfismo;

import java.text.DecimalFormat;

public class GeradorDeExtratos extends ContaBanco{
	
	static DecimalFormat df = new DecimalFormat("#0.00");
	
	
	public static String geraExtrato(ContaBanco cb){
		
		return "Titular da conta: "+ cb.getNome() + "\n" +
		"Numero da conta: " + cb.getNmrConta() + "\n" +
		"Saldo disponivel: " + df.format(cb.getSaldo());
		
		
	}


}
