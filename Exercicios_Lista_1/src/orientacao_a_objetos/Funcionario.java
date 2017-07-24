package orientacao_a_objetos;

import java.text.DecimalFormat;

public class Funcionario {

	String nome;
	double salario = 1000d;

	public void aumentaSalario(double valor) {
		this.salario += valor;

	}

	DecimalFormat df = new DecimalFormat("0.00");

	String consultaFuncionario() {
		return ("Funcionario: " + this.nome 
				+ "\n" +
				"Salario: " + df.format(this.salario));

	}
}