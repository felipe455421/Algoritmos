package Exercicios;
import javax.swing.JOptionPane;

public class _20 {
public static void main(String[] args) {
	
	
	int usr;
	int num[] = new int[3];
	
	usr = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
	
	num[0] = usr;
	
	
	usr = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
	
	num[1] = usr;
	
	
	usr = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
	
	num[2] = usr;
	
	
	System.out.println(num[0] + " " + num[1] + " " + num[2]);
	
		
			
	
}
}
/*20.	Crie um array int com 3 posi��es e pe�a para o usu�rio digitar um valor, e 
insira o valor na primeira posi��o do array, pe�a para o usu�rio digitar outro 
valor e insira o valor na segunda posi��o do array, pe�a para 
o usu�rio digitar outro valor e insira o valor terceira prosi��o do array.*/