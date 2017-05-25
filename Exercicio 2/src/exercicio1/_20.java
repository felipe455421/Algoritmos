package exercicio1;

import java.util.Scanner;

public class _20 {
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);

		int start;
		System.out.println("Digite o inicio da lista:");
		start = Scanner.nextInt();

		int end;
		System.out.println("Digite o fim da lista:");
		end = Scanner.nextInt();
		
		while (start <= end) {
			System.out.println(start);
			
			start++;

			Scanner.close();
		}
	}
}