package exercicio1;

import java.util.Scanner;

public class _9 {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	
	int num1;
	System.out.println("Digite um numero inteiro:");
	num1 = scanner.nextInt();
	
	int num2;
	System.out.println("Digite outro numero inteiro:");
	num2 = scanner.nextInt();
	
	scanner.close();
	
	if (num1 <= 0 || num2 < 0){
		System.out.println("True");
	}else{
		System.out.println("False");
		
	}
	
	}
}
/*9.	Escreva no console para digitar um número inteiro, 
leia o número inteiro digitado. Escreva no console para 
digitar outro número inteiro, leia o número inteiro digitado. 
Imprima no console true se o primeiro número é menor igual a zero 
ou o segundo número é maior
que 10. Caso contrário imprima false.*/