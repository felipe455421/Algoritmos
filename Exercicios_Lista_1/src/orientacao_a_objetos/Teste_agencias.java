
package orientacao_a_objetos;


public class Teste_agencias {
	public static void main(String[] args) {

		Agencias agencia1 = new Agencias("1234");
		
		Agencias agencia2 = new Agencias("4321");

		System.out.println(agencia1.getNumero_agencia());
		System.out.println(agencia2.getNumero_agencia());

	}
}