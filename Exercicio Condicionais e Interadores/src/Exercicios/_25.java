package Exercicios;

public class _25 {
public static void main(String[] args) {
	
	
		
		String texto;
		String texto1;
		
		texto = ("Rua Antônio da Veiga, número 201, Vila Nova, Blumenau - SC ");
		texto1 = ("SC - Blumenau, rua Joiville nº 2011.");
		
		
		int posicao = texto.indexOf("R");
		int posicao1 = texto.lastIndexOf(", nú");
		
		texto = texto.substring(posicao, posicao1);
				
		System.out.println(texto);
		

		int posicao2 = texto1.indexOf("r");
		int posicao3 = texto1.lastIndexOf(" nº");
		
		texto1 = texto1.substring(posicao2, posicao3);
				
		System.out.println(texto1);
		
}
}

/*Do texto abaixo, extraia apenas o nome da rua, utilizando indexOf e substring 
Rua Antônio da Veiga, número 201, Vila Nova, Blumenau - SC 
SC - Blumenau, rua Joiville nº 2011.*/