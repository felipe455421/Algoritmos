package Exercicios;
import javax.swing.JOptionPane;

public class _21 {
public static void main(String[] args) {
	
	int num[] = new int[10];
	
	
	
	for (int i = 0; i < num.length; i++) {

	num[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
	
	
	System.out.println(num[i]);
	
	
	
}
}
}
/*21.	Crie um array com 10 posições e peça para o usuário digitar um número e colocar
este número no array. Enquanto o array não tiver chego no final deverá sempre perguntar
para o usuário um próximo número e inserir no array. Deverá ser utilizar while ou for.*/