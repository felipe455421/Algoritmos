package Exercicios;
import javax.swing.JOptionPane;

public class _7 {
public static void main(String[] args) {
	
	int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
	int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
	String Operador = JOptionPane.showInputDialog("Digite um operador matematico");

	if (Operador.equals("+")){
		System.out.println("O resultado da soma � "+ (num1 + num2));
		
	}else if (Operador.equals("-")){
		
		System.out.println("O resultado da subtra��o � " + (num1 - num2));
		
	}else if (Operador.equals("/")){
		
		System.out.println("O resultado da divis�o � " + (num1 / num2));
		
	}else if (Operador.equals("*")){
		
		System.out.println("O resultado da multiplica��o � " + (num1 * num2));
		
		
	}
}
}
/*7.	Calculadora
a.	Pe�a para o usu�rio digitar um n�mero, e armazene o n�mero

b.	Pe�a para o usu�rio digitar um operador matem�tico (+, -, /, x), e armazene o o operador


c.	Pe�a para o usu�rio digitar outro n�mero, e armazene o n�mero

d.	Caso o usu�rio digitou o operador +, some os dois n�meros e imprima o resultado
�Valor da soma: <resultado>�.

e.	Caso o usu�rio digitou o operador -, subtraia os dois n�meros e imprima o resultado
�Valor da subtra��o: <resultado>�.

f.	Caso o usu�rio digitou o operador /, divida os dois n�meros e imprima o resultado
�Valor da divis�o: <resultado>�.

g.	Caso o usu�rio digitou o operador *, multiplique os dois n�meros e imprima o resultado
�Valor da multiplica��o: <resultado>�.
*/