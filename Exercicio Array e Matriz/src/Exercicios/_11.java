package Exercicios;

public class _11 {
public static void main(String[] args) {
	
	boolean txt[] = new boolean[6];
	
	 for (int i = 0; i < txt.length; i++) {

	if (i % 2 == 0){
		txt[i] = true;
		
	}else{
		txt[i] = false;
		
		
	}
		System.out.println(txt[i]);
		
	}
}
}
/*11.	Criar um array do tipo boolean de 6 posi��es. Utilizando um for, popular o array aonde as 
posi��es forem pares colocar o valor true, e nas posi��es �mpares o valor false.*/