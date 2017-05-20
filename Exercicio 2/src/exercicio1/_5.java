package exercicio1;

import java.util.Scanner;

public class _5 {
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);

		int Num;
		System.out.println("Digite seu número desejadoo:");
		Num = Scanner.nextInt();

		int aux = 0;
		int Num2 = 0;
		while (aux <= Num) {
			System.out.println(Num2);

			aux++;
			Num2++;

			Scanner.close();
		}
	}
}