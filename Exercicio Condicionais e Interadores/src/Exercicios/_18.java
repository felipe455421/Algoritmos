package Exercicios;

import javax.swing.JOptionPane;

public class _18 {
	public static void main(String[] args) {

		String name1;
		String name2;
		String troca1;
		int dia1;
		int mes1;
		int ano1;
		int dia2;
		int mes2;
		int ano2;
		int troca;

		name1 = JOptionPane.showInputDialog("Digite o nome da primeira pessoa:");
		dia1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia do seu aniversario:"));
		mes1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês do seu aniversario:"));
		ano1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do seu aniversario:"));
		name2 = JOptionPane.showInputDialog("Digite o nome da segunda pessoa:");
		dia2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia do seu aniversario:"));
		mes2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês do seu aniversario:"));
		ano2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do seu aniversario:"));

		if (ano1 < ano2) {
			
			troca = ano1;
			ano1 = ano2;
			ano2 = troca;
			troca1 = name1;
			name1 = name2;
			name2 = troca1;
			
		} else {

		}

		if (ano1 == ano2 && mes1 < mes2) {
			
			troca = mes1;
			mes1 = mes2;
			mes2 = troca;
			troca1 = name1;
			name1 = name2;
			name2 = troca1;

		} else {

		}
		
			if (ano1 == ano2 && mes1 == mes2 && dia1 < dia2) {

				troca = dia1;
				dia1 = dia2;
				dia2 = troca;
				troca1 = name1;
				name1 = name2;
				name2 = troca1;

			} else {

				
			}
			
			
			System.out.println(name2 + " : " + dia2 + "/" + mes2+ "/" +ano2 + "\n" + name1 + " : " + dia1 + "/" + mes1 + "/" + ano1);

		}
		}


/*
 * Pergunte o nome da pessoa, o dia e mês e ano de aniversário. Pergunte para
 * outra pessoa o nome, o dia, mês e ano de aniversário. Agora verifique qual é
 * a pessoa mais velha, e imprima o nome da mais velha e o nome da mais nova,
 * utilizando apenas um Sysout. Sendo considerado o dia, mês e ano, cada uma
 * sendo uma variável int.
 */