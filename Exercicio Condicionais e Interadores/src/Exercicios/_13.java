package Exercicios;

import javax.swing.JOptionPane;

public class _13 {
	public static void main(String[] args) {

		double Salario = Double
				.parseDouble(JOptionPane.showInputDialog("Digite o seu salario liquido sem os centavos: "));

		double Result = 0;

		if (Salario <= 600) {

			Result = Salario;

		} else if (Salario > 600 && Salario <= 2000) {

			Result = Salario * 0.8;

		} else if (Salario > 1200 && Salario <= 2000) {

			Result = Salario * 0.75;

		} else if (Salario > 2000) {

			Result = Salario * 0.70;

		}

		System.out.println("O seu salario final vai ficar: R$" + Result);

	}
}
/*
 * 13. Escreva um algoritmo que o usu�rio entre com o sal�rio da pessoa e
 * imprima o sal�rio l�quido, segundo as informa��es abaixo, utilizando apenas
 * um System.out.println: a. Menor ou igual a R$ 600,00 � isento b. Maior que R$
 * 600 e menor ou igual a R$ 1.200,00 o desconto � de 20% c. Maior que R$
 * 1.200,00 e menor ou igual a R$ 2000,00 o desconto � 25% d. Maior que R$
 * 2000,00 o desconto � 30% Sendo que o sal�rio l�quido � igual ao sal�rio bruno
 * menos os descontos.
 */