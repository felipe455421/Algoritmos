package Exercicios;

public class _28 {
public static void main(String[] args) {
	
	String[][] txt = new String[4][4];
	
	
	for (int a = 0; a < txt.length; a++) {
		for (int b = 0; b < txt[a].length; b++) {
		
		
			
	/*		if (linhas == 0 && colunas == 0) {

				impar1 = impar1 + num[i][z];
				*/

			
			
					txt[a][b] = "x";
			
		
		if (a == 2 && b == 4){
			
			txt [a][b] = " ";			
		
		}else if (a == 2 && b == 3){
			
			txt [a][b] = " ";			

	
		}
		
		
				
				System.out.print(txt[a][b]);
	}
				System.out.println();

			}
		
	
}
}
/*28.	Popular uma matriz da forma de que se impressa gere o códigos seguintes. 
Para imprimir a matriz utilizar o código abaixo:
	for (int linhas = 0; linhas < matriz.length; linhas++) {
			for (int colunas = 0; colunas < matriz[linhas].length; colunas++) {
				System.out.print(matriz[linhas][colunas]);
			}
			System.out.println();
		}

a.	x x x x
	x     x
	x     x
	x x x x

b.	x x x x
	x x x x 
	x     x
	x     x
	x x x x 
	x x x x

c.	x x x x x
	x       x 
	x       x
	x x x x x
	x       x
	x       x
	x x x x x
*/