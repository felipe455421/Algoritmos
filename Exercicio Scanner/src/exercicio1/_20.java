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
	text1 = "Ol�";
	
	System.out.println(text1 + " " + outroTexto);
	
	
	
	
	
	
	
}
}
/*20.	Pe�a para o usu�rio digitar um texto. Guarde o texto que o usu�rio 
digitou em uma vari�vel. Crie outra vari�vel de nome �outroTexto�, atribuindo o 
valor da vari�vel que o usu�rio digitou. Altere o valor da vari�vel que o usu�rio 
digitou para �Ol�.Imprima as duas vari�veis, e observe o que foi impresso.
*/