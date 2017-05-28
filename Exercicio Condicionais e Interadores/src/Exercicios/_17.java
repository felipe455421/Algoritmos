package Exercicios;

import javax.swing.JOptionPane;

public class _17 {
	public static void main(String[] args) {

		String nome1 = " ";
		String nome2 = " ";
		String nome3 = " ";
		String troca;
		int age1;
		int age2;
		int age3;

		nome1 = JOptionPane.showInputDialog("Digite o primeiro nome:");
		age1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira idade:"));

		nome2 = JOptionPane.showInputDialog("Digite o segundo nome:");
		age2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda idade:"));

		nome3 = JOptionPane.showInputDialog("Digite o terceiro nome:");
		age3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a terceira idade:"));

		if ((age1 > age2 && age1 > age3) && (age2 > age3)) {

		} else if ((age1 > age2 && age1 > age3) && (age3 > age2)) {

			age2 = age2 + age3;
			age3 = age2 - age3;
			age2 = age2 - age3;
			troca = nome3;
			nome3 = nome2;
			nome2 = nome3;

		} else if ((age2 > age1 && age2 > age3) && (age1 > age3)) {

			age1 = age1 + age2;
			age2 = age1 - age2;
			age1 = age1 - age2;
			troca = nome1;
			nome1 = nome2;
			nome2 = troca;

		} else if ((age2 > age1 && age2 > age3) && (age3 > age1)) {

			age1 = age1 + age2;
			age2 = age1 - age2;
			age1 = age1 - age2;
			age2 = age2 + age3;
			age3 = age2 - age3;
			age2 = age2 - age3;
			troca = nome1;
			nome1 = nome2;
			nome2 = nome3;
			nome3 = troca;

		} else if ((age3 > age1 && age3 > age2) && (age1 > age2)) {

			age1 = age1 + age3;
			age3 = age1 - age3;
			age1 = age1 - age3;
			age2 = age2 + age3;
			age3 = age2 - age3;
			age2 = age2 - age3;
			troca = nome1;
			nome1 = nome3;
			nome3 = nome2;
			nome2 = troca;

		} else if ((age3 > age1 && age3 > age2) && (age2 > age1)) {

			age1 = age1 + age3;
			age3 = age1 - age3;
			age1 = age1 - age3;
			troca = nome1;
			nome1 = nome3;
			nome3 = troca;

		}

		System.out.println(nome1 + " " + age1 + "\n" + nome2 + " " + age2 + "\n" + nome3 + " " + age3);
	}
}

/*
 * Pergunte o nome da pessoa e a sua idade. Pergunte o nome de outra pessoa e
 * sua idade. Pergunte o nome da terceira pessoa e sua idade. Imprima o nome e
 * idade de pessoas mais velha, do meio e a mais nova, utilizando apenas um
 * Sysout. Sendo considerado a idade uma variável int.
 */
