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
/*21.	Crie um array com 10 posi��es e pe�a para o usu�rio digitar um n�mero e colocar
este n�mero no array. Enquanto o array n�o tiver chego no final dever� sempre perguntar
para o usu�rio um pr�ximo n�mero e inserir no array. Dever� ser utilizar while ou for.*/