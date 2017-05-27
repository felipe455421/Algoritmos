package Exercicios;

import javax.swing.JOptionPane;

public class _11 {
	public static void main(String[] args) {

		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
		int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o teceiro numero"));
		int Result;

		if (num1 > num2 && num1 > num3) {
			Result = num1;

		} else if (num2 > num1 & num2 > num3) {
			Result = num2;

		} else {
			Result = num3;

		}

		System.out.println("O maior numero é: " + Result);

	}

}
/*
 * 11. Escreve um algoritmo que o usuário entre com três números e imprima o
 * maior número entre eles, utilizando apenas um System.out.println.
 */