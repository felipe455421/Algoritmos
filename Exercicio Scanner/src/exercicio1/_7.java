package exercicio1;

import java.util.Scanner;

public class _7 {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	
	int num1;
	System.out.println("Digite um numero inteiro:");
	num1 = scanner.nextInt();
	
	int num2;
	System.out.println("Digite outro numero inteiro:");
	num2 = scanner.nextInt();
	
	scanner.close();
	int Res = num1 / num2;
	
	if (Res % 2 == 0){
		System.out.println("True");
	}else{
		System.out.println("False");
		
	}
	
	}
}

/*7.	Escreva no console para digitar um número inteiro,
leia o número inteiro digitado. Escreva no console para 
digitar outro número inteiro, leia o número inteiro digitado. 
Imprima no console true se o resultado da divisão dos dois número é par, 
e false caso o resultado da divisão seja ímpar.*/