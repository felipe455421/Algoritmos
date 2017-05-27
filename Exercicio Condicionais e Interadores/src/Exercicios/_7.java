package Exercicios;
import javax.swing.JOptionPane;

public class _7 {
public static void main(String[] args) {
	
	int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
	int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
	String Operador = JOptionPane.showInputDialog("Digite um operador matematico");

	if (Operador.equals("+")){
		System.out.println("O resultado da soma é "+ (num1 + num2));
		
	}else if (Operador.equals("-")){
		
		System.out.println("O resultado da subtração é " + (num1 - num2));
		
	}else if (Operador.equals("/")){
		
		System.out.println("O resultado da divisão é " + (num1 / num2));
		
	}else if (Operador.equals("*")){
		
		System.out.println("O resultado da multiplicação é " + (num1 * num2));
		
		
	}
}
}
/*7.	Calculadora
a.	Peça para o usuário digitar um número, e armazene o número

b.	Peça para o usuário digitar um operador matemático (+, -, /, x), e armazene o o operador


c.	Peça para o usuário digitar outro número, e armazene o número

d.	Caso o usuário digitou o operador +, some os dois números e imprima o resultado
“Valor da soma: <resultado>”.

e.	Caso o usuário digitou o operador -, subtraia os dois números e imprima o resultado
“Valor da subtração: <resultado>”.

f.	Caso o usuário digitou o operador /, divida os dois números e imprima o resultado
“Valor da divisão: <resultado>”.

g.	Caso o usuário digitou o operador *, multiplique os dois números e imprima o resultado
“Valor da multiplicação: <resultado>”.
*/