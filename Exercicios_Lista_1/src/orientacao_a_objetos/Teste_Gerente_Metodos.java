package orientacao_a_objetos;

import java.text.DecimalFormat;

public class Teste_Gerente_Metodos {
public static void main(String[] args) {
	
	DecimalFormat df = new DecimalFormat ("0.00");

	Gerente gerente1 = new Gerente();
	gerente1.setNome("Joaquim");
	gerente1.setSalario(1000d);
	
	
	gerente1.aumentoSalarial();
	
	Gerente gerente2 = new Gerente();
	gerente2.setNome("Pedro");
	gerente2.setSalario(1000d);
	
	
	gerente2.aumentoSalarial(55);
	
	System.out.println("Nome: " + gerente1.getNome());
	System.out.println("Salario: R$" + df.format(gerente1.getSalario()));
	
	System.out.println("Nome: " + gerente2.getNome());
	System.out.println("Salario: R$" + df.format(gerente2.getSalario()));
	
}
}
