package Exercicios;

public class _19 {
	public static void main(String[] args) {

		int num1[] = new int[5];
		num1[0] = 1;
		num1[1] = 2;
		num1[2] = 3;
		num1[3] = 4;
		num1[4] = 5;

		int num2[] = new int[5];
		num2[0] = 5;
		num2[1] = 4;
		num2[2] = 3;
		num2[3] = 2;
		num2[4] = 1;

		int z = 0;

		for (int i = 0; i < num1.length; i++) {

			if (num1[i] == num2[z]) {

				System.out.println(i + " " + z);

			} else {

			}
		}

		z++;

		for (int i = 0; i < num1.length; i++) {

			if (num1[i] == num2[z]) {

				System.out.println(i + " " + z);

			}
		}
		z++;

		for (int i = 0; i < num1.length; i++) {

			if (num1[i] == num2[z]) {

				System.out.println(i + " " + z);
			}
		}
		z++;

		for (int i = 0; i < num1.length; i++) {

			if (num1[i] == num2[z]) {

				System.out.println(i + " " + z);

			}
		}
		z++;

		for (int i = 0; i < num1.length; i++) {

			if (num1[i] == num2[z]) {

				System.out.println(i + " " + z);
			}
		}
	}
}

/*
 * 19. Criar um array com os valores 1, 2, 3, 4, 5. Criar outro array com os
 * valores 5, 4, 3, 2, 1. Utilizando for, imprimir em qual é as posições dos
 * arrays que o valor é são iguais, conforme exemplo abaixo: arrayA posição 0,
 * arrayB posição 4 possuem o valor 1 arrayA posição 1, arrayB posição 3 possuem
 * o valor 2
 */