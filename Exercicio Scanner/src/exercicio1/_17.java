package exercicio1;

import javax.swing.JOptionPane;

public class _17 {
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		
		int soma1 = num + 5;
		System.out.println("A priemira soma é:" + soma1);
		
		int soma2 = soma1 + 5;
		System.out.println("A segunda soma é:" + soma2);
		
		
	}

}
/*Peça para o usuário digitar um número. Guarde o número que o usuário digitou.
Some o número que o usuário digitou com 5. Imprima o resultado da soma.
Pegue o resultado e some com 5 novamente. Imprima o resultado da soma.*/