package Exercicios;

import javax.swing.JOptionPane;

public class _32 {
public static void main(String[] args) {
	
	int answer = 0;
	while (answer == 0){
		
	
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
	double gastoAnual = 0;
	double gastoAnualAjustado = 0;
	double salarioImposto = 0;
	double anualImposto = 0;
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
		
		gastoAnual = usrSalario * 12;
		salarioAjustado = usrSalario * tempoEmpresa[0];
		salarioAjustado = salarioAjustado * tempoEmpresa[1];
		gastoAnualAjustado = salarioAjustado * 12;
		gastoAnualAjustado = gastoAnualAjustado - gastoAnual;

	} else if (usrTempo <= 3 && usrIngles == 1) {

		salarioAjustado = usrSalario * tempoEmpresa[1];

	}

	if (usrTempo > 3 && usrTempo <= 9 && usrIngles == 0) {// 2
		
		gastoAnual = usrSalario * 12;
		salarioAjustado = usrSalario * tempoEmpresa[0];
		salarioAjustado = salarioAjustado * tempoEmpresa[2];
		gastoAnualAjustado = salarioAjustado * 12;
		gastoAnualAjustado = gastoAnualAjustado - gastoAnual;
		
	} else if (usrTempo > 3 && usrTempo <= 9 && usrIngles == 1) {
		
		gastoAnual = usrSalario * 12;
		salarioAjustado = usrSalario * tempoEmpresa[2];
		gastoAnualAjustado = salarioAjustado * 12;
		gastoAnualAjustado = gastoAnualAjustado - gastoAnual;
		

	}

	if (usrTempo > 9 && usrTempo <= 12 && usrIngles == 0) {// 3
		
		gastoAnual = usrSalario * 12;
		salarioAjustado = usrSalario * tempoEmpresa[0];
		salarioAjustado = salarioAjustado * tempoEmpresa[3];
		gastoAnualAjustado = salarioAjustado * 12;
		gastoAnualAjustado = gastoAnualAjustado - gastoAnual;
		
	} else if (usrTempo > 9 && usrTempo <= 12 && usrIngles == 1) {
		
		gastoAnual = usrSalario * 12;
		salarioAjustado = usrSalario * tempoEmpresa[3];
		gastoAnualAjustado = salarioAjustado * 12;
		gastoAnualAjustado = gastoAnualAjustado - gastoAnual;
		
	}

	if (usrTempo > 12 && usrTempo <= 24 && usrIngles == 0) {// 4
		
		gastoAnual = usrSalario * 12;
		salarioAjustado = usrSalario * tempoEmpresa[0];
		salarioAjustado = salarioAjustado * tempoEmpresa[4];
		gastoAnualAjustado = salarioAjustado * 12;
		gastoAnualAjustado = gastoAnualAjustado - gastoAnual;
		
	} else if (usrTempo > 12 && usrTempo <= 24 && usrIngles == 1) {
		
		gastoAnual = usrSalario * 12;
		salarioAjustado = usrSalario * tempoEmpresa[4];
		gastoAnualAjustado = salarioAjustado * 12;
		gastoAnualAjustado = gastoAnualAjustado - gastoAnual;
		
	}

	if (usrTempo > 24 && usrTempo <= 36 && usrIngles == 0) {// 5
		
		gastoAnual = usrSalario * 12;
		salarioAjustado = usrSalario * tempoEmpresa[0];
		salarioAjustado = salarioAjustado * tempoEmpresa[5];
		gastoAnualAjustado = salarioAjustado * 12;
		gastoAnualAjustado = gastoAnualAjustado - gastoAnual;
		
	} else if (usrTempo > 24 && usrTempo <= 36 && usrIngles == 1) {
		
		gastoAnual = usrSalario * 12;
		salarioAjustado = usrSalario * tempoEmpresa[5];
		gastoAnualAjustado = salarioAjustado * 12;
		gastoAnualAjustado = gastoAnualAjustado - gastoAnual;
		
	}

	if (usrTempo > 36 && usrIngles == 0) {// 6
		
		gastoAnual = usrSalario * 12;
		salarioAjustado = usrSalario * tempoEmpresa[0];
		salarioAjustado = salarioAjustado * tempoEmpresa[6];
		gastoAnualAjustado = salarioAjustado * 12;
		gastoAnualAjustado = gastoAnualAjustado - gastoAnual;
		
	} else if (usrTempo > 36 && usrIngles == 1) {
		
		gastoAnual = usrSalario * 12;
		salarioAjustado = usrSalario * tempoEmpresa[6];
		gastoAnualAjustado = salarioAjustado * 12;
		gastoAnualAjustado = gastoAnualAjustado - gastoAnual;
		
	}
	
	salarioImposto = salarioAjustado * 1.3387;
	anualImposto = salarioImposto * 12;
	anualImposto = anualImposto - gastoAnual;

	System.out.println("Cargo: " + cargo[usrCargo] + "\n" + "Sal�rio: R$" + usrSalario + "\n" + "Tempo: " + usrTempo
			+ " meses" + "\n" + "Ingl�s: " + answerIngles + "\n" + "----------------------------------" + "\n"
			+ "Novo sal�rio: R$" + salarioAjustado + "\n" + "Sal�rio reajustado com imposto (33,87%): "
			+ salarioImposto + "\n" + "Cargo: " + cargo[usrCargo] + "\n" + "Gasto anual a mais ap�s reajuste: " + gastoAnualAjustado
			+ "\n" + "Gasto anual a mais ap�s reajuste com imposto (33,87%): " + anualImposto);

	
	answer = JOptionPane.showConfirmDialog(null, "Deseja repetir o programa?");

}
JOptionPane.showMessageDialog(null, "  Saindo do programa.");

}
}
	

/*32.	Alterar o programa acima para que imprime ap�s o sal�rio reajustado do funcion�rio exiba o
sal�rio reajustado com imposto de 33,87%. Alterar tamb�m para que exiba tamb�m o valor do gasto
anual a mais ap�s reajuste considerando o imposto de 33, 87%. Ou seja, a vis�o da impress�o do 
programa deve ser a seguinte:
Cargo anterior: 0 - Estagi�rio
Sal�rio anterior: 900
Meses: 13
Ingl�s: false
Sal�rio reajustado: 1000,00
Sal�rio reajustado com imposto (33,87%): 1338,70
Cargo: J�nior
Gasto anual a mais ap�s reajuste: 1200,00
Gasto anual a mais ap�s reajuste com imposto (33,87): 1606,44
*/