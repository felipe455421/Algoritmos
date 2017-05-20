package exercicio1;
import java.util.Scanner;

public class _8 {
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);

		int Num;
		System.out.println("Digite seu número desejadoo:");
		Num = Scanner.nextInt();

		int aux = 0;
		int num = 0;
		while (aux <= Num) {
			if (num % 2 == 0)

				System.out.println(num);
			aux++;
			num++;
		}
			Scanner.close();
		}
	}
