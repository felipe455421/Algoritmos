package orientacao_a_objetos;

import java.text.DecimalFormat;

public class Teste_conta {
public static void main(String[] args) {
	
	DecimalFormat df = new DecimalFormat("#0.00");
	
	Contas Cliente1 = new Contas("1234");
	Cliente1.limite = 123456d;
	Cliente1.saldo = 123456d;

	
	Contas Cliente2 = new Contas("4321");

	Cliente2.limite = 654321d;
	Cliente2.saldo = 654321d;
	
	
	System.out.println(Cliente1.numero_conta);
	System.out.println(df.format(Cliente1.limite));
	System.out.println(df.format(Cliente1.saldo));
	
	System.out.println(Cliente2.numero_conta);
	System.out.println(df.format(Cliente2.limite));
	System.out.println(df.format(Cliente2.saldo));


}
}
