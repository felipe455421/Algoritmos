package Exercicios;

import javax.swing.JOptionPane;

public class _27 {
	public static void main(String[] args) {

		String texto;

		texto = JOptionPane.showInputDialog("Digite seu nome completo: ");

			if (texto.toUpperCase().contains("PEREIRA")){
			
				System.out.println("Voc� � da fam�lia pereira");
			
	
			}else if (texto.toUpperCase().contains("SILVA")){
				
				System.out.println("Voc� � da fam�lia Silva");
			
			
			}else if (texto.toUpperCase().contains("SOUZA")){
				
				System.out.println("Voc� � da fam�lia Souza");
				
				
			}else{
				
				System.out.println("Infelizmente voc� n�o tem sobrenome famoso");
						
				
	}
}
}

/*
27.	Pergunte para o usu�rio o nome completo, se verifique as seguintes situa��es ("outrTexto".contains("text")):
a.	Se ele tiver Pereira no nome, diga para o usu�rio �Voc� � da fam�lia pereira�
b.	Se ele tiver Silva no nome, diga para o usu�rio �Voc� � da fam�lia Silva�
c.	Se ele tiver Souza no nome, diga para o usu�rio �Voc� � da fam�lia Souza�
d.	Se ele n�o tiver nenhum dos sobrenomes anteriores, dia para o usu�rio �Infelizmente voc� n�o tem sobrenome famoso�.

 */