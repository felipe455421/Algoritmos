package exercicio1;

import javax.swing.JOptionPane;

public class _17 {
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		
		int soma1 = num + 5;
		System.out.println("A priemira soma �:" + soma1);
		
		int soma2 = soma1 + 5;
		System.out.println("A segunda soma �:" + soma2);
		
		
	}

}
/*Pe�a para o usu�rio digitar um n�mero. Guarde o n�mero que o usu�rio digitou.
Some o n�mero que o usu�rio digitou com 5. Imprima o resultado da soma.
Pegue o resultado e some com 5 novamente. Imprima o resultado da soma.*/