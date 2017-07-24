package orientacao_a_objetos;

import java.text.DecimalFormat;

public class Teste_conta {
public static void main(String[] args) {
	
	DecimalFormat df = new DecimalFormat("#0.00");
	
	Contas Cliente1 = new Contas("1234");
	Cliente1.setLimite(123456d);
	Cliente1.setSaldo(123456d);

	
	Contas Cliente2 = new Contas("4321");

	Cliente2.setLimite(654321d);
	Cliente2.setSaldo(654321d);
	
	
	System.out.println(Cliente1.getNumero_conta());
	System.out.println(df.format(Cliente1.getLimite()));
	System.out.println(df.format(Cliente1.getSaldo()));
	
	System.out.println(Cliente2.getNumero_conta());
	System.out.println(df.format(Cliente2.getLimite()));
	System.out.println(df.format(Cliente2.getSaldo()));


}
}
