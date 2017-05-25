package exercicio1;

import java.util.Scanner;

public class _20 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	String text1;
	System.out.println("Digite o texto");
	text1 = scanner.next();
	scanner.close();
	
	String outroTexto = "0";
	outroTexto = text1;
	text1 = "Olá";
	
	System.out.println(text1 + " " + outroTexto);
	
	
	
	
	
	
	
}
}
/*20.	Peça para o usuário digitar um texto. Guarde o texto que o usuário 
digitou em uma variável. Crie outra variável de nome “outroTexto”, atribuindo o 
valor da variável que o usuário digitou. Altere o valor da variável que o usuário 
digitou para “Olá”.Imprima as duas variáveis, e observe o que foi impresso.
*/