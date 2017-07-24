package orientacao_a_objetos;

import java.text.DecimalFormat;

public class Teste_Gerente_Metodos {
public static void main(String[] args) {
	
	DecimalFormat df = new DecimalFormat ("0.00");

	Gerente gerente1 = new Gerente();
	gerente1.nome = "Joaquim";
	gerente1.salario = 1000d;
	
	
	gerente1.aumentoSalarial();
	
	Gerente gerente2 = new Gerente();
	gerente2.nome = "Pedro";
	gerente2.salario = 1000d;
	
	
	gerente2.aumentoSalarial(55);
	
	System.out.println("Nome: " + gerente1.nome);
	System.out.println("Salario: R$" + df.format(gerente1.salario));
	
	System.out.println("Nome: " + gerente2.nome);
	System.out.println("Salario: R$" + df.format(gerente2.salario));
	
}
}
