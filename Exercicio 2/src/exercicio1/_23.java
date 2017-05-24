package exercicio1;

import java.util.Scanner;

public class _23 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe a quantidade de linhas:");
		int qtdLinhas = scanner.nextInt();
		int num1 = qtdLinhas;
		for (int linha = 0; linha <= qtdLinhas; linha++) {
			for (int coluna = qtdLinhas; coluna >= linha;coluna--) {
				
			
				if (num1 > 9){
					System.out.print(num1);
				}else if (num1 == 0){
					
				}else{
					System.out.print ("0" + num1);
				}
			
			}
			num1--;
			System.out.println("");
		
		scanner.close();
		}
	}
}

/*	if (qtdLinhas < 10){
System.out.print("0" + qtdLinhas);
}else{
System.out.print (qtdLinhas);
}
}
qtdLinhas--;
	for (int coluna = qtdLinhas; coluna >= linha; coluna--) {
			*/