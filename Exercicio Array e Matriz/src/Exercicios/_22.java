package Exercicios;

import javax.swing.JOptionPane;

public class _22 {
	public static void main(String[] args) {

		int num[] = new int[5];
		num[0] = 1;
		num[1] = 3;
		num[2] = 5;
		num[3] = 7;
		num[4] = 9;
		int usr;
		String answerYes = "Achei o numero!";
		String answerNo = "N�o achei o numero!";
		int res = 0;

		usr = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		for (int i = 0; i < num.length; i++) {

			if (usr == num[i]) {

				res = 1;

				
				
			}
			}
		
		
		if (res == 1) {

			System.out.println(answerYes);

		}else if (res == 0){
			
			System.out.println(answerNo);
			
		}

	}
}
/*
 * 13. Crie um array de 5 posi��es com os valores 1, 3, 5, 7, 9. Pe�a para o
 * usu�rio digitar um valor. Se o valor digitado pelo usu�rio estiver no array,
 * imprima �Achei o valor�, caso contr�rio, n�o achei o valor. (o
 * System.out.println deve estar fora do for).
 */