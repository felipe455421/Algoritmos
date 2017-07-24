package orientacao_a_objetos;

import java.text.DecimalFormat;

public class Teste_funcionario {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat ("0.00");
		Funcionario funcionario1 = new Funcionario();
		funcionario1.nome = "Joaquim";
		funcionario1.salario = 1500d;
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.nome = "Joaquim";
		funcionario2.salario = 1500d;
		
		System.out.println(funcionario1.nome);
		System.out.println(df.format(funcionario1.salario));
		System.out.println(funcionario2.nome);
		System.out.println(df.format(funcionario2.salario));

	}
}