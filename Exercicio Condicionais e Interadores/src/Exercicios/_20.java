package Exercicios;

import javax.swing.JOptionPane;

public class _20 {
public static void main(String[] args) {
	
	
	String texto;
	
	texto = JOptionPane.showInputDialog("Digite seu nome e sobrenome");
	
	texto = texto.toUpperCase();
	
	System.out.println(texto);
	
	texto = texto.toLowerCase();
	
	System.out.println(texto);

	
	
}
}
/*Pe�a para o usu�rio digitar seu nome e sobrenome. Altere todas as letras para ma�usculas, imprima o resultado, e depois altere para min�sculas e altere o resultado.
(texto = texto.toUpperCase();, texto = texto.toLowerCase();)*/