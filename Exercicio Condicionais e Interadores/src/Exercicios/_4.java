package Exercicios;

import javax.swing.JOptionPane;
public class _4 {
public static void main(String[] args) {
	
	int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero desejado"));
	int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero desejado"));

	
	if (num1 % 7 == 0 && num2 % 7 == 0){
		
		System.out.println("os dois números são múltiplos de 7");
		
	}else{
		
		System.out.println("os dois números não são múltiplos de 7");

	}
}
}

/*4.	Peça para o usuário digitar dois números, pegue os dois números que o usuário digitou.
Se o primeiro número que o usuário digitar e o segundo número que o usuário digitou forem 
múltiplos de 7, imprima “os dois números são múltiplos de 7”, 
caso contrário imprima, “os dois números não são múltiplos de 7”. */