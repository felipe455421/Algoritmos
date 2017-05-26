package Exercicios;

import javax.swing.JOptionPane;
public class _3 {
public static void main(String[] args) {
	
	int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero desejado"));
	int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero desejado"));

	int multi = num1 * num2;
	
	if (multi % 5 == 0){
		
		System.out.println("o numero digitado é multiplo de 5");
		
	}else{
		
		System.out.println("o numero digitado não é multiplo de 5");

	}
	System.out.println(multi);
	
}
}
/*3.	Peça para o usuário digitar dois números, pegue os dois números que o usuário digitou.
Multiplique os dois números. Se o resultado da multiplicação for múltiplo de 5 imprima 
“o resultado é múltiplo de 5”, caso contrário, imprima “o resultado não foi o esperado”. 
Após o teste da da condição do if, imprima o resultado da multiplicação.*/