package Exercicios;
import javax.swing.JOptionPane;
public class _1 {
public static void main(String[] args) {
	
	int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero desejado"));
	
	if (num > 10){
		
		System.out.println("o numero digitado é maior que 10");
		
	}else{
		
		System.out.println("o numero digitado é menor que 10");

	}
	
}
}
/*1.	Peça para o usuário digitar um número, pegue o número que o usuário digitou. 
Verifique se o número é maior que 10, caso sim, imprima “o valor digitado é maior que 10”, 
caso contrário imprima “o valor digitado é menor que 10”.*/