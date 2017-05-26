package Exercicios;

import javax.swing.JOptionPane;
public class _2 {
public static void main(String[] args) {
	
	int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero desejado"));
	
	if (num % 2 ==1){
		
		System.out.println("o numero digitado é ímpar");
		
	}else{
		
		System.out.println("o numero digitado é par");

	}
	
}
}
/*2.	Peça para o usuário digitar um número, pegue o número que o usuário digitou.
Verifique se o número é ímpar, caso sim, 
imprima “o valor digitado é ímpar”, caso contrário imprima “o valor é par”.*/