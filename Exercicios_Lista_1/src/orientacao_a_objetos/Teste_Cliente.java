package orientacao_a_objetos;

public class Teste_Cliente {
public static void main(String[] args) {

	Clientes cliente1 = new Clientes();
	cliente1.setNome("Felipe");
	cliente1.setCodigo(15);
	
	Clientes cliente2 = new Clientes();
	cliente2.setNome("Miraak");
	cliente2.setCodigo(51);
	
	System.out.println(cliente1.getNome());
	System.out.println(cliente1.getCodigo());
	System.out.println(cliente2.getNome());
	System.out.println(cliente2.getCodigo());


	}
}
