package orientacao_a_objetos;

import java.text.DecimalFormat;

public class Teste_funcionario {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat ("0.00");
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setNome("Joaquim");
		funcionario1.setSalario(15000d);
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setNome("Frederico");
		funcionario2.setSalario(20000d);
		
		try {
		     funcionario1.aumentaSalario(-25);
		} catch (IllegalArgumentException e) {
		     System.out.println ("Houve um erro ao depositar");
		}
		
		
		System.out.println(funcionario1.getNome());
		System.out.println(df.format(funcionario1.getSalario()));
		System.out.println(funcionario2.getNome());
		System.out.println(df.format(funcionario2.getSalario()));

	}
}