package exercicio1;

import java.util.Scanner;

public class _10 {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	
	int num1;
	System.out.println("Digite um numero inteiro:");
	num1 = scanner.nextInt();
	
	int num2;
	System.out.println("Digite outro numero inteiro:");
	num2 = scanner.nextInt();
	
	scanner.close();
	
	double Res = Math.pow(num1, 2) + Math.pow(num2,  2);
		
	System.out.println(Res);
		
	}
	
	}

/*10.	Escreva no console para digitar um n�mero inteiro,
leia o n�mero inteiro digitado. Escreva no console para digitar 
outro n�mero inteiro, leia o n�mero inteiro digitado. Imprima no 
console o valor do resultado do primeiro n�mero elevado ao
quadrado mais o segundo n�mero elevado ao quadrado.*/