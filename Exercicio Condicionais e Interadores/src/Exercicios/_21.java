package Exercicios;

import javax.swing.JOptionPane;

public class _21 {
public static void main(String[] args) {
	
	String texto;
	
	texto = JOptionPane.showInputDialog("Digite sua data de nascimento(dd/mm/aaaa): ");

	int posicao = texto.lastIndexOf("/");
	
	System.out.println(posicao);
	
}
}
//Pe�a para o usu�rio digitar sua data de nascimento em texto �01/02/1990�. Busque a posi��o do �ltima barra �/�contida na data. Imprime a posi��o da barra. (int posicao = texto.lastIndexOf("A");)