package Exercicios;

import javax.swing.JOptionPane;

public class _24 {
	public static void main(String[] args) {
		
		
	String texto;
	
	texto = JOptionPane.showInputDialog("Digite sua data de nacimento(dd/mm/aaaa): ");

	int posicao = texto.indexOf("/");
	posicao++;
	int posicao1 = texto.lastIndexOf("/");
	
	texto = texto.substring(posicao, posicao1);
	
	
	System.out.println(texto);
	
	
}
}


//Utilizando o exerc�cio 21 como exemplo, tente extrair o m�s da data, utilizando as fun��es indexOf e substring. 