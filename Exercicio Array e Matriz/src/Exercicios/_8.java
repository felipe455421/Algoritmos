package Exercicios;

public class _8 {
public static void main(String[] args) {
	
	int text[] = new int[5];
	text[0] = 1;
	text[1] = 2;
	text[2] = 3;
	text[3] = 4;
	text[4] = 5;
	
	 for (int i = 0; i < text[2]; i++) {

		System.out.println(text[i]);
		
	 }
	 text[0] = 10;
	 text[4] = 10;
	 
	 for (int i = 0; i < text.length; i++) {
		 
			System.out.println(text[i]);

	
}
}
}

/*8.	Criar um array do tipo int, com os seguintes valores 1, 2, 3, 4, 5.
a.	Imprimir todos os valores do array até chegar a metade do array.
b.	Alterar o valor do início do array para 10.
c.	Alterar o valor da última posição do array para 10. 
d.	Imprimir todos os valores do array.*/
