package Exercicios;

import javax.swing.JOptionPane;

public class _23 {
	
	public static void main(String[] args) {
		
				
	String texto;
	
	texto = JOptionPane.showInputDialog("Digite seu nome completo: ");

	int posicao = texto.indexOf(" ");
	posicao++;
	int posicao1 = texto.lastIndexOf(" ");
	
	texto = texto.substring(posicao, posicao1);
	
	
	System.out.println(texto);
}

}

/*Pe�a para o usu�rio digitar o nome completo. Procure o primeiro espa�o � � (int posicao = texto.indexOf(" ");). Guarde o valor. 
Procure agora pelo o �ltimo espa�o � � no qual fizemos no exerc�cio anterior.
Agora, utilizando a fun��o substring (texto = texto.substring(0, 10);), insira os dois valores guardados anteriormente, e imprima o texto resultante. */