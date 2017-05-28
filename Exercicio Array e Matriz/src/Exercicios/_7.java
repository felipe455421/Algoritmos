package Exercicios;

public class _7 {
	public static void main(String[] args) {

		String text[] = new String[6];
		text[0] = "A";
		text[1] = "B";
		text[2] = "C";
		text[3] = "D";
		text[4] = "E";
		text[5] = "F";

		for (String x : text) {

			if (x.contains("C")) {

				System.out.println(" ");
			} else {

				System.out.println(x);
			}
		}

		for (int i = 5; i < text.length && i > -1; i--) {

			if (text[i].contains("C")) {

				System.out.println(" ");
			} else {

				System.out.println(text[i]);

			}
		}
	}
}
/*
 * 7. Criar um array do tipo String, com valor de “A”, “B”, “C”, “D”, “E”, “F”
 * a. Imprimir todos os valores do array b. Imprimir todos os valores do array
 * de forma contrário, ou seja, “F”, “E”, “D”, “C”, “B”, “A” c. Imprimir todos
 * os valores do array menos que tenha o valor “C”
 */
