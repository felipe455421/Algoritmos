package Exercicios;

import javax.swing.JOptionPane;
public class _4 {
public static void main(String[] args) {
	
	int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero desejado"));
	int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero desejado"));

	
	if (num1 % 7 == 0 && num2 % 7 == 0){
		
		System.out.println("os dois n�meros s�o m�ltiplos de 7");
		
	}else{
		
		System.out.println("os dois n�meros n�o s�o m�ltiplos de 7");

	}
}
}

/*4.	Pe�a para o usu�rio digitar dois n�meros, pegue os dois n�meros que o usu�rio digitou.
Se o primeiro n�mero que o usu�rio digitar e o segundo n�mero que o usu�rio digitou forem 
m�ltiplos de 7, imprima �os dois n�meros s�o m�ltiplos de 7�, 
caso contr�rio imprima, �os dois n�meros n�o s�o m�ltiplos de 7�. */