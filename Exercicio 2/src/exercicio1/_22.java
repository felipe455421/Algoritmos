package exercicio1;

import java.util.Scanner;

public class _22 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe a quantidade de linhas:");
		int qtdLinhas = scanner.nextInt();
		int num1 = 1;
		for(int linha = 0; linha < qtdLinhas; linha++){
			for(int coluna = 0; coluna <= linha; coluna++){
				if (num1 < 10){
					System.out.print("0" + num1);
				}else{
					System.out.print (num1);
				}
			
			}
			num1++;
			System.out.println("");
		}
		scanner.close();
	}
}