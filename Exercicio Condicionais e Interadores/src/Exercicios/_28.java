package Exercicios;

import javax.swing.JOptionPane;

public class _28 {

	public static void main(String[] args) {

		String texto;
		String t1 = "Você";
		String t2 = "Família";
		String n1 = "Pereira";
		String n2 = "Silva";
		String n3 = "Souza";
		
		
		
		texto = JOptionPane.showInputDialog("Digite seu nome completo: ");

			if (texto.toUpperCase().contains("PEREIRA")){
			
				System.out.println(String.format("%s é da %s %s",t1 ,t2, n1));
			
	
			}else if (texto.toUpperCase().contains("SILVA")){
				
				System.out.println(String.format("%s é da %s %s",t1 ,t2, n2));
			
			
			}else if (texto.toUpperCase().contains("SOUZA")){
				
				System.out.println(String.format("%s é da %s %s",t1 ,t2, n3));
				
				
			}else{
				
				System.out.println("Infelizmente você não tem sobrenome famoso");
						
		
		
		
		
			}
}
}

/*28.	Converta o exercício anterior utilzando a função String.format ensinada (
String primeiroNome = "Vinícius";
String templateTexto = "Meu nome é %1$s. E de novo meu nome é %1$s";
System.out.println(String.format(templateTexto, primeiroNome));*/
