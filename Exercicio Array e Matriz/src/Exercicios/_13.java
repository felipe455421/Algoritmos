package Exercicios;

public class _13 {
	public static void main(String[] args) {

		int num[] = new int[10];
		int soma = 0;

		for (int i = 0; i < num.length; i++) {

			if (i >= 3) {

				num[i] = soma;
				soma++;

			} else {

			}
			System.out.println(num[i]);
		}

	}
}
/*
 * 13. Criar um array de 10 posições, e popular o array com os valores 1, 2, 3,
 * 4, 5 a partir da posição 4 utilizando for. Para colocar os valores 1, 2, 3,
 * 4, 5 utilizando uma variável.
 */