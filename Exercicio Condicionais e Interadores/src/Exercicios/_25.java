package Exercicios;

public class _25 {
public static void main(String[] args) {
	
	
		
		String texto;
		String texto1;
		
		texto = ("Rua Ant�nio da Veiga, n�mero 201, Vila Nova, Blumenau - SC ");
		texto1 = ("SC - Blumenau, rua Joiville n� 2011.");
		
		
		int posicao = texto.indexOf("R");
		int posicao1 = texto.lastIndexOf(", n�");
		
		texto = texto.substring(posicao, posicao1);
				
		System.out.println(texto);
		

		int posicao2 = texto1.indexOf("r");
		int posicao3 = texto1.lastIndexOf(" n�");
		
		texto1 = texto1.substring(posicao2, posicao3);
				
		System.out.println(texto1);
		
}
}

/*Do texto abaixo, extraia apenas o nome da rua, utilizando indexOf e substring 
Rua Ant�nio da Veiga, n�mero 201, Vila Nova, Blumenau - SC 
SC - Blumenau, rua Joiville n� 2011.*/