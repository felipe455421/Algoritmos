package exercicio1;
import javax.swing.JOptionPane;


public class _18 {
public static void main(String[] args) {
	
	int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
	
	int sub1 = num - 5;
	
	int sub2 = num - 3;

	
	System.out.println("O primeiro resultado é:" + sub1 + "\nO segundo resultado é:" + sub2
			+ "\nO resultado da primeira subtração é:" + sub1 + " E o resultado da segunda"
					+ " subtração é:" + sub2);

	
	
}
}
/*18.	Peça para o usuário digitar um número. Guarde o número que o usuário digitou.
Subtraia o número por 5 e imprima o resultado. Pegue novamente o número que o
usuário digitou e subtraia por 3 e imprima o resultado. Pegue o resultado da subtração 
por 5 e o resultado da subtração por 3 e imprima os dois resultado.*/