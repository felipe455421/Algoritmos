package Exercicios;

public class _10 {
public static void main(String[] args) {
	
	int num[] = new int[6];
	num[0] = 1;
	num[1] = 3;
	num[2] = 5;
	num[3] = 7;
	num[4] = 9;
	num[5] = 11;

	
	 for (int i = 0; i < num.length; i++) {

		if (i != num.length - 1){
			
			 System.out.println(num[i]);
			 
		}else{
		 
		
}
	 }
}
}
/*10.	Criar um array do tipo int de 6 posi��es,
com os valores 1, 3, 5, 7, 9, 11. Imprimir todas as posi��es
menos a �ltima posi��o (verificar se � a �ltima posi��es e n�o verificar se � o de valor 11).*/