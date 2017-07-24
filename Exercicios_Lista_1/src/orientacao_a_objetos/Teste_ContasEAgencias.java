package orientacao_a_objetos;

import java.text.DecimalFormat;

public class Teste_ContasEAgencias {
public static void main(String[] args) {
	
	DecimalFormat df = new DecimalFormat("#0.00");

	Contas conta = new Contas("1234");
	Agencias A = new Agencias("4321");
	
	conta.setAgencia(A);
		
	conta.setLimite(123456d);
	conta.setSaldo(123456d);
	

	
	System.out.println(conta.getNumero_conta());
	System.out.println(df.format(conta.getLimite()));
	System.out.println(df.format(conta.getSaldo()));

	System.out.println(conta.getAgencia().getNumero_agencia());
}
}