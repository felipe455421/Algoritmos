package exercicio1;
import javax.swing.JOptionPane;


public class _18 {
public static void main(String[] args) {
	
	int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
	
	int sub1 = num - 5;
	
	int sub2 = num - 3;

	
	System.out.println("O primeiro resultado �:" + sub1 + "\nO segundo resultado �:" + sub2
			+ "\nO resultado da primeira subtra��o �:" + sub1 + " E o resultado da segunda"
					+ " subtra��o �:" + sub2);

	
	
}
}
/*18.	Pe�a para o usu�rio digitar um n�mero. Guarde o n�mero que o usu�rio digitou.
Subtraia o n�mero por 5 e imprima o resultado. Pegue novamente o n�mero que o
usu�rio digitou e subtraia por 3 e imprima o resultado. Pegue o resultado da subtra��o 
por 5 e o resultado da subtra��o por 3 e imprima os dois resultado.*/