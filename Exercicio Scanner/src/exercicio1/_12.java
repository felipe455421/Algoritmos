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

/*12.	Escreva no console para digitar um n�mero inteiro, leia o n�mero inteiro digitado.
Escreva no console para digitar outro n�mero inteiro, leia o n�mero inteiro digitado. 
Escreva no console para digitar outro n�mero inteiro, leia o n�mero inteiro digitado. 
a.	Imprima o resultado do seguinte c�lculo (primeiro n�mero multiplicado pelo
terceiro n�mero mais, o resultado somando com o segundo n�mero elevado ao cubo). 
b.	Imprima true se o resultado � maior que zero, caso contr�rio false. 
c.	Imprima true se o resultado � maior que 10 ou maior que 1, caso contr�rio false. 
d.	Imprima true se o resultado � menor que 10 ou maior que 100, caso contr�rio false. 
e.	Imprima true se o resultado � m�ltiplo de 10, caso contr�rio false. 
f.	Imprima true se o resultado � m�ltiplo de 2 e m�ltiplo de 3, caso contr�rio false.*/
