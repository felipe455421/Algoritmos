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
/*Peça para o usuário digitar seu nome e sobrenome. Altere todas as letras para maíusculas, imprima o resultado, e depois altere para minúsculas e altere o resultado.
(texto = texto.toUpperCase();, texto = texto.toLowerCase();)*/