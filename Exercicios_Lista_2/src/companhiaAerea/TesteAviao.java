package companhiaAerea;

import java.text.DecimalFormat;
import java.util.Arrays;

public class TesteAviao {
public static void main(String[] args) {
	DecimalFormat df = new DecimalFormat(",000.00");
	
	Companhia com = new Companhia();
		
	Boing boin1 = new Boing(50, 100);
	Boing boin2 = new Boing(50, 100);
	Monomotor mono1 = new Monomotor(4, 200);
	Monomotor mono2 = new Monomotor(4, 200);
	Monomotor mono3 = new Monomotor(4, 200);
	Bimotor Bimo1 = new Bimotor(16, 300);
	Bimotor Bimo2 = new Bimotor(16, 300);
	
	com.setBoings(Arrays.asList(boin1, boin2));
	com.setMonomotores(Arrays.asList(mono1, mono2, mono3));
	com.setBimotores(Arrays.asList(Bimo1, Bimo2));
	
	
	System.out.println("O faturamento total é: R$ " + df.format(com.retornaFaturamentoPassagens()));
	
}
}
