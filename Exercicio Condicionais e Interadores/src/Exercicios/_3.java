package Exercicios;

import javax.swing.JOptionPane;
public class _3 {
public static void main(String[] args) {
	
	int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero desejado"));
	int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero desejado"));

	int multi = num1 * num2;
	
	if (multi % 5 == 0){
		
		System.out.println("o numero digitado � multiplo de 5");
		
	}else{
		
		System.out.println("o numero digitado n�o � multiplo de 5");

	}
	System.out.println(multi);
	
}
}
/*3.	Pe�a para o usu�rio digitar dois n�meros, pegue os dois n�meros que o usu�rio digitou.
Multiplique os dois n�meros. Se o resultado da multiplica��o for m�ltiplo de 5 imprima 
�o resultado � m�ltiplo de 5�, caso contr�rio, imprima �o resultado n�o foi o esperado�. 
Ap�s o teste da da condi��o do if, imprima o resultado da multiplica��o.*/