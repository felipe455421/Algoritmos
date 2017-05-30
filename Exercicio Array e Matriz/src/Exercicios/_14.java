package Exercicios;

public class _14 {
public static void main(String[] args) {
	
	int num1[] = new int[5];
	num1[0] = 10;
	num1[1] = 8;
	num1[2] = 6;
	num1[3] = 4;
	num1[4] = 2;
	int num2[] = new int[5];
	
	
	for (int i = 0; i < num2.length; i++) {

	num2[i] = num1[i];
	
	
	System.out.println(num2[i]);
	
	
	
}
}
}
/*14.	Criar um array com os valores 10, 8, 6, 4, 2 utilizando esta sequencia de inserção.
Criar um outro array de mesmo tamanho. Utilizando for,
pegar todos os valores presentes no primeiro array e inserir no segundo array.
Desta forma os dois arrays terão os mesmo valores nas mesmas posições. 
Imprimir o segundo array para verificar se o algoritmo funcionou.*/