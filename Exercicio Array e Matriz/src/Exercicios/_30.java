package Exercicios;

import javax.swing.JOptionPane;

public class _30 {
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
 * 30. Alterar o programa acima para que seja executado uma vez todo o programa,
 * e antes de sair, pergunte para o usu�rio se ele deseja digitar informa��es de
 * outro funcion�rio. Se ele digitar true, o programa deve ser executado
 * novamente, perguntando as informa��es do cargo do funcion�rio e seu sal�rio.
 * Caso digite false, imprima no console �Saindo do programa� e termine o
 * programa.
 */