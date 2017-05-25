package exercicio1;

import javax.swing.JOptionPane;

public class _13 {
	public static void main(String[] args) {

		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero:"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero:"));
		int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero:"));
		int num4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero:"));

		double[] soma = new double[5];

		soma[0] = num2 + num3 + num4;
		soma[1] = num1 + num3 + num4;
		soma[2] = num1 + num2 + num3;
		soma[3] = num1 + num2 + num3;
		soma [4] = num2 + num4;
		double[] res = new double[2];

		res[0] = 0;
		res[1] = 0;

		/* A- */ if ((num1 <= soma[0]) && (soma[0] % 2 == 1) || (soma[0] > 10)) {

			System.out.println("A: " + "True");
			res[0]++;

		} else {

			System.out.println("A: " + "False");
			res[1]++;
		}

		/* B- */ if ((soma[1] % 10 == 0) || (soma[1] % 5 == 1) || (num1 == 5) || (soma[2] > 100.0) && (num1 > 0.0)) {

			System.out.println("B: " + "True");
			res[0]++;

		} else {

			System.out.println("B: " + "False");
			res[1]++;

		}

		/* C- */ if (res[0] == 2 || res[1] == 2) {

			System.out.println("C: " + "True");

		} else {

			System.out.println("C: " + "False");

		}

		/* D- */ if (!(soma[3] > 10)) {

			System.out.println("D: " + "True");

		} else {

			System.out.println("D: " + "False");

		}
		/* E- */ if (!((num1 > 10) || (num3 > 0) || (soma[4] == 0))) {
			
			System.out.println("E: " + "True");
			
		} else {
			
			System.out.println("E: " + "False");

		}
	}
}
/*
 * 13. Escreva no console para digitar um número inteiro, leia o número inteiro
 * digitado. Escreva no console para digitar outro número inteiro, leia o número
 * inteiro digitado. Escreva no console para digitar outro número inteiro, leia
 * o número inteiro digitado. Escreva no console para digitar outro número
 * inteiro, leia o número inteiro digitado.
 * 
 * a. Imprima true se o valor do primeiro número é menor ou igual a soma do
 * segundo número com o terceiro e o quarto número, for impar ou maior que 10,
 * caso contrário false.
 * 
 * b. Imprima true se a soma do primeiro dígito mais o segundo mais o terceiro
 * mais o quarto dígito for múltiplo de 10, ou múltiplo de 5, ou o primeiro
 * dígito for 5, ou a soma do primeiro dígito mais o segundo e o terceiro
 * dígito, for maior que 100.0, e o primeiro dígito maior que 0.
 * 
 * c. Imprima true se o resultado da questão a e o resultado da questão b forem
 * verdadeiras, ou o resultado da questão a e o resultado da questão b forem
 * falsas.
 * 
 * d. Imprima false se o valor do primeiro dígito mais o segundo, terceiro e
 * quarto for maior que 10, caso contrário true.
 * 
 * e. Imprima false se o primeiro número é maior que 10 ou o terceiro número for
 * maior que 0, ou o segundo número mais o quarto número for igual a 0. Caso
 * contrário true.
 */
