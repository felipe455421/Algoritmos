package exercicio1;

import javax.swing.JOptionPane;

public class _15 {
public static void main(String[] args) {
	
	String texto = JOptionPane.showInputDialog("Digite o texto a ser validado");
	
	if((texto.length() <= 50)){
	System.out.println("True");
	}else{
	System.out.println("False");
	
	
}
}
}




/*
 * 15. Vamos considerar que temos que validar um campo texto de uma tela de
 * cadastro de pessoa, no qual � um campo de observa��o. Caso a quantidade de
 * caracteres que o usu�rio digitou for maior que 50, imprima false, caso
 * contr�rio imprima true.
 */
