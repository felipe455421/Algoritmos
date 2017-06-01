package Exercicios;

public class _28 {
public static void main(String[] args) {
	
	
	System.out.println("A: ");

	String[][] txt = new String[4][4];
	
	
	for (int a = 0; a < txt.length; a++) {
		for (int b = 0; b < txt[a].length; b++) {
		

			
			
					txt[a][b] = "x ";
			
		
		if (a == 1 && b == 1){
			
			txt [a][b] = "  ";			
		
		}else if (a == 1 && b == 2){
			
			txt [a][b] = "  ";			

	
		}
		
		
		if (a == 2 && b == 1){
			
			txt [a][b] = "  ";			
		
		}else if (a == 2 && b == 2){
			
			txt [a][b] = "  ";			

	
		}
		
		

				System.out.print(txt[a][b]);
	}
				System.out.println();

			}
	
	
	System.out.println();
	System.out.println("B: ");
	


	
	String[][] txt1 = new String[6][4];
	
	
	for (int a = 0; a < txt1.length; a++) {
		for (int b = 0; b < txt1[a].length; b++) {
		

			
					txt1[a][b] = "x ";
			
		
		if (a == 2 && b == 1){
			
			txt1 [a][b] = "  ";			
		
		}else if (a == 2 && b == 2){
			
			txt1 [a][b] = "  ";			

	
		}
		
		
		if (a == 3 && b == 1){
			
			txt1 [a][b] = "  ";			
		
		}else if (a == 3 && b == 2){
			
			txt1 [a][b] = "  ";			

	
		}
		
		

				System.out.print(txt1[a][b]);
	}
				System.out.println();

			}
	
	
	
	System.out.println();
	System.out.println("C: ");
	


	
	String[][] txt2 = new String[7][5];
	
	
	for (int a = 0; a < txt2.length; a++) {
		for (int b = 0; b < txt2[a].length; b++) {
		
		
			

			
			
			txt2[a][b] = "x ";
			
		
		if (a == 1 && b == 1){
			
			txt2[a][b] = "  ";			
		
		}else if (a == 1 && b == 2){
			
			txt2[a][b] = "  ";		
			
	}else if (a == 1 && b == 3){
			
			txt2[a][b] = "  ";		

	
		}
		
		
		if (a == 2 && b == 1){
			
			txt2[a][b] = "  ";			
		
		}else if (a == 2 && b == 2){
			
			txt2[a][b] = "  ";	
			
	}else if (a == 2 && b == 3){
			
			txt2[a][b] = "  ";		

	
		}
		
	if (a == 4 && b == 1){
			
			txt2[a][b] = "  ";			
		
		}else if (a == 4 && b == 2){
			
			txt2[a][b] = "  ";	
			
	}else if (a == 4 && b == 3){
			
			txt2[a][b] = "  ";		

	
		}
	
	if (a == 5 && b == 1){
		
		txt2[a][b] = "  ";			
	
	}else if (a == 5 && b == 2){
		
		txt2[a][b] = "  ";	
		
}else if (a == 5 && b == 3){
		
		txt2[a][b] = "  ";		


	}
		
		

				System.out.print(txt2[a][b]);
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