package exercicio1;

import java.util.Scanner;

public class _3 {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	
	int num1;
	System.out.println("Digite um numero inteiro:");
	num1 = scanner.nextInt();
	
	int num2;
	System.out.println("Digite outro numero inteiro:");
	num2 = scanner.nextInt();
	
	scanner.close();
	
	
	if (num1 == num2){
		System.out.println("True");
		
	}else{
			
		System.out.println("False");

	}
}
}

/*
 * 3. Escreva no console para digitar um n�mero inteiro, leia o n�mero inteiro
 * digitado. Escreva no console para digitar outro n�mero inteiro, leia o n�mero
 * inteiro digitado. Imprima no console true se os dois n�mero s�o iguais ou
 * false se s�o diferentes.
 */
