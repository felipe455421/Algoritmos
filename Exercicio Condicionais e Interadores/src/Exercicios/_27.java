package Exercicios;

import javax.swing.JOptionPane;

public class _27 {
	public static void main(String[] args) {

		String texto;

		texto = JOptionPane.showInputDialog("Digite seu nome completo: ");

			if (texto.toUpperCase().contains("PEREIRA")){
			
				System.out.println("Você é da família pereira");
			
	
			}else if (texto.toUpperCase().contains("SILVA")){
				
				System.out.println("Você é da família Silva");
			
			
			}else if (texto.toUpperCase().contains("SOUZA")){
				
				System.out.println("Você é da família Souza");
				
				
			}else{
				
				System.out.println("Infelizmente você não tem sobrenome famoso");
						
				
	}
}
}

/*
27.	Pergunte para o usuário o nome completo, se verifique as seguintes situações ("outrTexto".contains("text")):
a.	Se ele tiver Pereira no nome, diga para o usuário “Você é da família pereira”
b.	Se ele tiver Silva no nome, diga para o usuário “Você é da família Silva”
c.	Se ele tiver Souza no nome, diga para o usuário “Você é da família Souza”
d.	Se ele não tiver nenhum dos sobrenomes anteriores, dia para o usuário “Infelizmente você não tem sobrenome famoso”.

 */