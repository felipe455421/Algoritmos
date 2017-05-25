package exercicio1;

import java.util.Scanner;


public class _19 {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	int primeiroNumero;
	System.out.println("Digite o priemiro numero");
	primeiroNumero = scanner.nextInt();
	scanner.close();
	int segundoNumero = 0;
	segundoNumero += primeiroNumero;
	
	primeiroNumero = 10;
	
	System.out.println("A primeira variavel é: " + primeiroNumero + " E a segunda variavel"
			+ " é: " + segundoNumero);
}
}
/*19.	Peça para o usuário digitar um número. Guarde o número que o usuário 
digitou na variável “primeiroNumero”. Crie outra variável de 
nome “segundoNumero”, atribuindo o valor da variável “primeiroNumero”. 
Altere o valor da variavel “primeiroNumero” para 10. Imprima a variável
“primeiroNumero” e a variável “segundoNumero”.
Verifique os valores das variáveis, como ficaram.*/