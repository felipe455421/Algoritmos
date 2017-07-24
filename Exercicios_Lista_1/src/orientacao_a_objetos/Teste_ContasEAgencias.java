package orientacao_a_objetos;

import java.text.DecimalFormat;

public class Teste_ContasEAgencias {
public static void main(String[] args) {
	
	DecimalFormat df = new DecimalFormat("#0.00");

	Contas conta = new Contas("1234");
	Agencias A = new Agencias("4321");
	
	conta.agencia = A;
		
	conta.limite = 123456d;
	conta.saldo = 123456d;
	

	
	System.out.println(conta.numero_conta);
	System.out.println(df.format(conta.limite));
	System.out.println(df.format(conta.saldo));

	System.out.println(conta.agencia.numero_agencia);
}
}