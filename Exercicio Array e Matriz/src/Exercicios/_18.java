package Exercicios;

public class _18 {
	public static void main(String[] args) {

		int num[] = new int[10];
		int soma = 10;
		for (int i = 0; i < num.length; i++) {

			num[i] = soma;
			
			
		
		soma = soma + 10;
		System.out.println(num[i]);
		
		}
	}

}
/*
 * 18. Criar um array de 10 posições, e popular este array apenas com múltiplos
 * de 10, ou seja, na posição 0 deverá ter o valor 10, na posição 1 o valor 20,
 * e assim por diante.
 */