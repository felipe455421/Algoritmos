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
/*20.	Crie um array int com 3 posições e peça para o usuário digitar um valor, e 
insira o valor na primeira posição do array, peça para o usuário digitar outro 
valor e insira o valor na segunda posição do array, peça para 
o usuário digitar outro valor e insira o valor terceira prosição do array.*/