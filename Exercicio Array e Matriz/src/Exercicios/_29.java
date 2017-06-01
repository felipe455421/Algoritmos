package Exercicios;

import javax.swing.JOptionPane;

public class _29 {
	public static void main(String[] args) {

		int salario[] = new int[5];

		salario[0] = 500; // Estagi�rio
		salario[1] = 1000; // J�nior
		salario[2] = 1500; // Pleno
		salario[3] = 2500; // S�nior
		salario[4] = 3000; // S�nior plus plus

		double tempoEmpresa[] = new double[7];
		tempoEmpresa[0] = 1.035; // ingl�s 3,5%
		tempoEmpresa[1] = 1; // tempo <= 3 0%
		tempoEmpresa[2] = 1.038; // 3 < tempo <= 9 3,8%
		tempoEmpresa[3] = 1.05; // 9 < tempo <=12 5,0%
		tempoEmpresa[4] = 1.155; // 12 < tempo <=24 15,5%
		tempoEmpresa[5] = 1.206; // 24 < tempo <=36 20,6%
		tempoEmpresa[6] = 1.3; // 36 < tempo 30%

		String cargo[] = new String[5];
		cargo[0] = "Estagi�rio";// para Estagi�rio
		cargo[1] = "J�nior";// para J�nior
		cargo[2] = "Pleno";// para Pleno
		cargo[3] = "S�nior";// para S�nior
		cargo[4] = "S�nior plus plus";// para S�nior plus plus

		int usrCargo;
		int usrTempo;
		double usrSalario;
		int usrIngles;
		String answerIngles;
		double salarioAjustado = 0;
		/*
		 * 0 para Estagi�rio 1 para J�nior 2 para Pleno 3 para S�nior 4 para
		 * S�nior plus plus
		 */

		usrCargo = Integer.parseInt(JOptionPane.showInputDialog(
				"Digite qual o cargo do funcion�rio: " + "\n" + "0 para Estagi�rio;" + "\n" + "1 para J�nior;" + "\n"
						+ "2 para Pleno;" + "\n" + "3 para S�nior;" + "\n" + "4 para S�nior plus plus;"));
		usrTempo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo de empresa em meses do funcionario: "));
		usrSalario = Integer.parseInt(JOptionPane.showInputDialog("Digite qual o sal�rio atual do funcion�rio: "));
		usrIngles = JOptionPane.showConfirmDialog(null, "O funcionario possui Ingl�s?:");

		if (usrIngles == 0) {

			answerIngles = "Sim";

		} else {

			answerIngles = "N�o";

		}

		if (usrTempo <= 3 && usrIngles == 0) {// 1

			salarioAjustado = usrSalario * tempoEmpresa[0];
			salarioAjustado = salarioAjustado * tempoEmpresa[1];

		} else if (usrTempo <= 3 && usrIngles == 1) {

			salarioAjustado = usrSalario * tempoEmpresa[1];

		}

		if (usrTempo > 3 && usrTempo <= 9 && usrIngles == 0) {// 2

			salarioAjustado = usrSalario * tempoEmpresa[0];
			salarioAjustado = salarioAjustado * tempoEmpresa[2];

		} else if (usrTempo > 3 && usrTempo <= 9 && usrIngles == 1) {

			salarioAjustado = usrSalario * tempoEmpresa[2];

		}

		if (usrTempo > 9 && usrTempo <= 12 && usrIngles == 0) {// 3

			salarioAjustado = usrSalario * tempoEmpresa[0];
			salarioAjustado = salarioAjustado * tempoEmpresa[3];

		} else if (usrTempo > 9 && usrTempo <= 12 && usrIngles == 1) {

			salarioAjustado = usrSalario * tempoEmpresa[3];

		}

		if (usrTempo > 12 && usrTempo <= 24 && usrIngles == 0) {// 4

			salarioAjustado = usrSalario * tempoEmpresa[0];
			salarioAjustado = salarioAjustado * tempoEmpresa[4];

		} else if (usrTempo > 12 && usrTempo <= 24 && usrIngles == 1) {

			salarioAjustado = usrSalario * tempoEmpresa[4];

		}

		if (usrTempo > 24 && usrTempo <= 36 && usrIngles == 0) {// 5

			salarioAjustado = usrSalario * tempoEmpresa[0];
			salarioAjustado = salarioAjustado * tempoEmpresa[5];

		} else if (usrTempo > 24 && usrTempo <= 36 && usrIngles == 1) {

			salarioAjustado = usrSalario * tempoEmpresa[5];

		}

		if (usrTempo > 36 && usrIngles == 0) {// 6

			salarioAjustado = usrSalario * tempoEmpresa[0];
			salarioAjustado = salarioAjustado * tempoEmpresa[6];

		} else if (usrTempo > 36 && usrIngles == 1) {

			salarioAjustado = usrSalario * tempoEmpresa[6];

		}

		System.out.println("Cargo: " + cargo[usrCargo] + "\n" + "Sal�rio: R$" + usrSalario + "\n" + "Tempo: " + usrTempo
				+ " meses" + "\n" + "Ingl�s: " + answerIngles + "\n" + "----------------------------------" + "\n"
				+ "Novo sal�rio: R$" + salarioAjustado + "\n" + "Cargo: " + cargo[usrCargo]);

	}

}
/*
 * 29. Programa cargos e sal�rios 0 - Estagi�rio R$ 500 1- J�nior R$ 1000 2 -
 * Pleno R$ 1500 3 - S�nior R$ 2500 4 - S�nior plus plus R$ 3000
 * 
 * Tempo de empresa (meses) versus aumento: ingl�s 3,5% tempo <= 3 0% 3 < tempo
 * <= 9 3,8% 9 < tempo <=12 5,0% 12 < tempo <=24 15,5% 24 < tempo <=36 20,6% 36
 * < tempo 30%
 * 
 * Perguntar para o usu�rio qual o cargo do funcion�rio: 0 para Estagi�rio 1
 * para J�nior 2 para Pleno 3 para S�nior 4 para S�nior plus plus
 * 
 * Perguntar para o usu�rio qual o tempo de empresa em meses do funcion�rio.
 * Perguntar para o usu�rio qual o sal�rio atual do funcion�rio. Perguntar para
 * o usu�rio se o funcion�rio possui ingl�s, sim ou n�o.
 * 
 * Responder para o usu�rio qual ser� o sal�rio reajustado do funcion�rio e seu
 * carga.
 * 
 * Informa��es para teste: 1 - Caso Cargo: Estagi�rio Sal�rio: 550,00 Tempo: 3
 * meses Ingl�s: sim ---------------------------------- Novo sal�rio: 569,25
 * Cargo: Estagi�rio
 * 
 * 2 - Caso Cargo: Pleno Sal�rio: 2009,00 Tempo: 7 meses Ingl�s: n�o
 * ---------------------------------- Novo sal�rio: 2085,342 Cargo: Pleno
 * 
 * 3 - Caso Cargo: S�nior Sal�rio: 2999,00 Tempo: 14 meses Ingl�s: sim
 * ---------------------------------- Novo sal�rio: 3000,00 Cargo: S�nior plus
 * plus
 * 
 * 4 - Caso Cargo: Pleno Sal�rio: 2000,00 Tempo: 4 meses Ingl�s: sim
 * ---------------------------------- Novo sal�rio: 2146,00 Cargo: Pleno
 */