package Exercicios;

import javax.swing.JOptionPane;
public class _2 {
public static void main(String[] args) {
	
	int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero desejado"));
	
	if (num % 2 ==1){
		
		System.out.println("o numero digitado � �mpar");
		
	}else{
		
		System.out.println("o numero digitado � par");

	}
	
}
}
/*2.	Pe�a para o usu�rio digitar um n�mero, pegue o n�mero que o usu�rio digitou.
Verifique se o n�mero � �mpar, caso sim, 
imprima �o valor digitado � �mpar�, caso contr�rio imprima �o valor � par�.*/