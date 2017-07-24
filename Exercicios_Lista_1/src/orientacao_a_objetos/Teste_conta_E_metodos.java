package orientacao_a_objetos;

public class Teste_conta_E_metodos {
public static void main(String[] args) {
	
	Contas conta = new Contas("1324");
	
	conta.deposita(1000);
	conta.saque(100);
	Double saldoDisponivel = conta.consultaSaldo();
	
	Contas conta2 = new Contas(conta, 500d);
	
	System.out.println("Saldo da conta 2: " + conta2.saldo + "\n");
	System.out.println(conta.extrato());
	System.out.println(saldoDisponivel);

}
}