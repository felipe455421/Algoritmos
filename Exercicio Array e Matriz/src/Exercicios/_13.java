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
 * 13. Criar um array de 10 posi��es, e popular o array com os valores 1, 2, 3,
 * 4, 5 a partir da posi��o 4 utilizando for. Para colocar os valores 1, 2, 3,
 * 4, 5 utilizando uma vari�vel.
 */