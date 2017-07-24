package orientacao_a_objetos;

public class Teste_Cliente {
public static void main(String[] args) {

	Clientes cliente1 = new Clientes();
	cliente1.nome = "Felipe";
	cliente1.codigo = 15;
	
	Clientes cliente2 = new Clientes();
	cliente2.nome = "Miraak";
	cliente2.codigo = 51;
	
	System.out.println(cliente1.nome);
	System.out.println(cliente1.codigo);
	System.out.println(cliente2.nome);
	System.out.println(cliente2.codigo);


	}
}
