package arrays;

import java.util.Arrays;

public class MaiorNumero {
	public static void main(String[] args) {

		int maior = 0;
		int[] numeros = new int[] { 25, 5, 4, 8, 9, 7, 78, 3, 1, 2 };

		Arrays.sort(numeros);
		for (int i = 0; i < numeros.length; i++) {
			if (i == (numeros.length - 1)) {
				maior = numeros[i];

			}
		}
		System.out.println(maior);
	}
}
