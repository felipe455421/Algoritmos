package Exercicios;

import javax.swing.JOptionPane;

public class _28 {

	public static void main(String[] args) {

		String texto;
		String t1 = "Voc�";
		String t2 = "Fam�lia";
		String n1 = "Pereira";
		String n2 = "Silva";
		String n3 = "Souza";
		
		
		
		texto = JOptionPane.showInputDialog("Digite seu nome completo: ");

			if (texto.toUpperCase().contains("PEREIRA")){
			
				System.out.println(String.format("%s � da %s %s",t1 ,t2, n1));
			
	
			}else if (texto.toUpperCase().contains("SILVA")){
				
				System.out.println(String.format("%s � da %s %s",t1 ,t2, n2));
			
			
			}else if (texto.toUpperCase().contains("SOUZA")){
				
				System.out.println(String.format("%s � da %s %s",t1 ,t2, n3));
				
				
			}else{
				
				System.out.println("Infelizmente voc� n�o tem sobrenome famoso");
						
		
		
		
		
			}
}
}

/*28.	Converta o exerc�cio anterior utilzando a fun��o String.format ensinada (
String primeiroNome = "Vin�cius";
String templateTexto = "Meu nome � %1$s. E de novo meu nome � %1$s";
System.out.println(String.format(templateTexto, primeiroNome));*/
