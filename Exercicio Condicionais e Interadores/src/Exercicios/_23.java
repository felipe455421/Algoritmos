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

/*Peça para o usuário digitar o nome completo. Procure o primeiro espaço “ ” (int posicao = texto.indexOf(" ");). Guarde o valor. 
Procure agora pelo o último espaço “ ” no qual fizemos no exercício anterior.
Agora, utilizando a função substring (texto = texto.substring(0, 10);), insira os dois valores guardados anteriormente, e imprima o texto resultante. */