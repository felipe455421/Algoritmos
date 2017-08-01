package _1;

import java.text.DecimalFormat;

public class Teste {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#0.00");
		
		ContaCorrente contc = new ContaCorrente(100);
		contc.setSaldo(1000d);
		ContaCorrenteEspec conte = new ContaCorrenteEspec(100);
		conte.setSaldo(1000d);
		System.out.println(df.format(contc.getSaldo()) +"\n"+ df.format(conte.getSaldo()));
		contc.saque(100);
		conte.saque(100);
		System.out.println(df.format(contc.getSaldo()) +"\n"+ df.format(conte.getSaldo()));
	
	}
}
