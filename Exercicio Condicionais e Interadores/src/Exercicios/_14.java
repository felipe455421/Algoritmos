package Exercicios;

import javax.swing.JOptionPane;

public class _14 {
	public static void main(String[] args) {

		double Pre�o = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do item sem os centavos: "));
		
		double Result = 0;
		
		if (Pre�o < 20) {
			
			Result = Pre�o * 1.5;

		} else {
			
			Result = Pre�o * 1.35;
		
		}

		System.out.println("O seu salario final vai ficar: R$" + Result);
	}
	
}
/*14.	Um comerciante comprou um produto e quer vende-lo com um lucro de 50% se o
valor da compra for menor que R$ 20,00. Caso contr�rio, o lucro ser� 35%.
Entrar com o valor do produto e imprimir o valor de venda.*/