package Exercicios;

import javax.swing.JOptionPane;

public class _12 {

	public static void main(String[] args) {

		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
		int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o teceiro numero"));
		int Result1 = 0;
		int Result2 = 0;
		int Result3 = 0;

		if (num1 > num2 && num1 > num3) {

			Result1 = num1;

		} else if (num1 > num2 && num1 < num3) {

			Result2 = num1;

		} else if (num1 < num2 && num1 < num3) {

			Result3 = num1;
		}

		if (num2 > num1 && num2 > num3) {

			Result1 = num2;

		} else if (num2 > num1 && num2 < num3) {

			Result2 = num2;

		} else if (num2 > num3 && num2 < num1) {

			Result2 = num2;

		} else if (num2 < num1 && num2 < num3) {
			Result3 = num2;
		}

		if (num3 > num1 && num3 > num2) {
			Result1 = num3;

		} else if (num3 > num1 && num3 < num2) {

			Result2 = num3;

		} else if (num3 < num1 && num3 < num2) {
			Result3 = num3;

		}

		System.out.println(Result1 + "\n" + Result2 + "\n" + Result3);

	}
}
