package Exercicios;

import javax.swing.JOptionPane;

public class _22 {
public static void main(String[] args) {
	
	String texto;
	
	texto = JOptionPane.showInputDialog("Digite seu nome completo: ");

	int posicao = texto.lastIndexOf(" ");
	
	posicao++;
	
	texto = texto.substring(posicao);
	
	
	System.out.println(texto);
	
}
}
/*Pe�a para o usu�rio digitar o nome completo. Busque em qual posi��o est� o �ltimo espa�o � � (texto.lastIndexOf(� �);). Guarde este valor, e agora some mais 1 neste valor utilizando ++.
Agora utilizando o substring, coloque o valor do resultado da soma e imprima o texto (texto = texto.substring(0);). Veja o que acontece. */