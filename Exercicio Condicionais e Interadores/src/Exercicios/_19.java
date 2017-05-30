package Exercicios;
import javax.swing.JOptionPane;

public class _19 {
public static void main(String[] args) {
	
	
	String texto;
	
	texto = JOptionPane.showInputDialog("Digite um texto");
	
	texto = texto.replace("[aeiouAEIOU]", "W");
	
	System.out.println(texto);
	
	
	
}
	
	
}
/*Peça para o usuário digitar um texto e altere todas as vogais do texto, para a letra w,
 *  utilizando o replace. (texto = texto.replace("antigoCaracter", "novoCaracter");)*/
 