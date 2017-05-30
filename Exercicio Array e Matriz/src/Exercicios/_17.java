package Exercicios;

public class _17 {
public static void main(String[] args) {
	
	int num1[] = new int[10];
	num1[0] = 1;
	num1[1] = 2;
	num1[2] = 3;
	num1[3] = 4;
	num1[4] = 5;
	num1[5] = 6;
	num1[6] = 7;
	num1[7] = 8;
	num1[8] = 9;
	num1[9] = 10;

	int num2[] = new int[5];
	int z = 0;
	

	for (int i = 0; i < num1.length; i++) {
		
		if (num1[i] % 2 == 1){
			

			num2[z] = num1[i];
			System.out.println(num2[z]);
			z++;

		}

	}

	
}
}
/*17.	Criar um array com 10 posições, com valores de 1 a 10 sequenciais.
Criar um array de 5 posições. Popular o segundo array somente com os valores ímpares
do primeiro array utilizando for. Imprimir o segundo array para verificar se o algoritmo funcionou.*/