package exercicio1;

import java.util.Scanner;

public class _12 {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	
	int num1;
	System.out.println("Digite o primeiro numero inteiro:");
	num1 = scanner.nextInt();
	
	int num2;
	System.out.println("Digite o segundo numero inteiro:");
	num2 = scanner.nextInt();
	
	int num3;
	System.out.println("Digite o terceiro numero inteiro:");
	num3 = scanner.nextInt();
	
	scanner.close();
	
	double Res1 = (num1 * num3) + (Math.pow(num2, 3));
	
	System.out.println("A: " + Res1);
	
	if (Res1 > 0){
		System.out.println("B: " + "True");
	}else{
		System.out.println("B: " + "False");
	
	}
		
		if (Res1 > 10 || Res1 > 1){
			System.out.println("C: " + "True");
		}else{
			System.out.println("C: " + "False");
			
		}
		
		if (Res1 < 10 || Res1 > 100){
			System.out.println("D: " + "True");
		}else{
			System.out.println("D: " + "False");
			
		}
		
		if (Res1 % 10 == 0){
			System.out.println("E: " + "True");
		}else{
			System.out.println("E: " + "False");
		
		}
		
			
		if (Res1 % 2 == 0 && Res1 % 3 == 0){
			System.out.println("F: " + "True");
		}else{
			System.out.println("F: " + "False");
				
			
	}
}
	
}

/*12.	Escreva no console para digitar um número inteiro, leia o número inteiro digitado.
Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
Escreva no console para digitar outro número inteiro, leia o número inteiro digitado. 
a.	Imprima o resultado do seguinte cálculo (primeiro número multiplicado pelo
terceiro número mais, o resultado somando com o segundo número elevado ao cubo). 
b.	Imprima true se o resultado é maior que zero, caso contrário false. 
c.	Imprima true se o resultado é maior que 10 ou maior que 1, caso contrário false. 
d.	Imprima true se o resultado é menor que 10 ou maior que 100, caso contrário false. 
e.	Imprima true se o resultado é múltiplo de 10, caso contrário false. 
f.	Imprima true se o resultado é múltiplo de 2 e múltiplo de 3, caso contrário false.*/
