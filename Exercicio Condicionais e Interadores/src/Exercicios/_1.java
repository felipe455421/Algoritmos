package Exercicios;
import javax.swing.JOptionPane;
public class _1 {
public static void main(String[] args) {
	
	int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero desejado"));
	
	if (num > 10){
		
		System.out.println("o numero digitado � maior que 10");
		
	}else{
		
		System.out.println("o numero digitado � menor que 10");

	}
	
}
}
/*1.	Pe�a para o usu�rio digitar um n�mero, pegue o n�mero que o usu�rio digitou. 
Verifique se o n�mero � maior que 10, caso sim, imprima �o valor digitado � maior que 10�, 
caso contr�rio imprima �o valor digitado � menor que 10�.*/