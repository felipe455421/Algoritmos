package Exercicios;

public class _25 {
	public static void main(String[] args) {

		int num[][] = new int[3][3];
		num[0][0] = 1;
		num[0][1] = 1;
		num[0][2] = 1;
		num[1][0] = 2;
		num[1][1] = 2;
		num[1][2] = 2;
		num[2][0] = 3;
		num[2][1] = 3;
		num[2][2] = 3;
		int soma1 = 0;
		int soma2 = 0;
		int soma3 = 0;
		for (int i = 0; i < 3; i++) {
			for (int z = 0; z < 3; z++) {

				if (i == 0) {

					soma1 = soma1 + num[i][z];

				} else if (i == 1) {

					soma2 = soma2 + num[i][z];

				} else if (i == 2) {

					soma3 = soma3 + num[i][z];

				}

			}
		}

		System.out.println("Soma da linha 0: " + soma1);
		System.out.println("Soma da linha 1: " + soma2);
		System.out.println("Soma da linha 2: " + soma3);

	}

}

/*
 * 25. Criar uma matriz com 3 linhas e 3 colunas. Popular esta matriz da forma
 * tradicional (matriz[0][0] = 1;) com os valores desejados. Utilizando for,
 * efetuar a soma dos valores de cada linha e imprimir apenas os valores somados
 * da linha. Ou seja, conforme matriz abaixo: 3 3 3 2 2 2 1 1 1 Imprimir no
 * console, deve aparecer o seguinte resultado: Soma da linha 0: 9 Soma da linha
 * 1: 6 Soma da linha 2: 3
 * 
 * 
 */