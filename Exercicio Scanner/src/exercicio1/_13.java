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
 * 13. Escreva no console para digitar um n�mero inteiro, leia o n�mero inteiro
 * digitado. Escreva no console para digitar outro n�mero inteiro, leia o n�mero
 * inteiro digitado. Escreva no console para digitar outro n�mero inteiro, leia
 * o n�mero inteiro digitado. Escreva no console para digitar outro n�mero
 * inteiro, leia o n�mero inteiro digitado.
 * 
 * a. Imprima true se o valor do primeiro n�mero � menor ou igual a soma do
 * segundo n�mero com o terceiro e o quarto n�mero, for impar ou maior que 10,
 * caso contr�rio false.
 * 
 * b. Imprima true se a soma do primeiro d�gito mais o segundo mais o terceiro
 * mais o quarto d�gito for m�ltiplo de 10, ou m�ltiplo de 5, ou o primeiro
 * d�gito for 5, ou a soma do primeiro d�gito mais o segundo e o terceiro
 * d�gito, for maior que 100.0, e o primeiro d�gito maior que 0.
 * 
 * c. Imprima true se o resultado da quest�o a e o resultado da quest�o b forem
 * verdadeiras, ou o resultado da quest�o a e o resultado da quest�o b forem
 * falsas.
 * 
 * d. Imprima false se o valor do primeiro d�gito mais o segundo, terceiro e
 * quarto for maior que 10, caso contr�rio true.
 * 
 * e. Imprima false se o primeiro n�mero � maior que 10 ou o terceiro n�mero for
 * maior que 0, ou o segundo n�mero mais o quarto n�mero for igual a 0. Caso
 * contr�rio true.
 */
