package Exercicios;

public class _15 {
public static void main(String[] args) {
	
	int num1[] = new int[5];
	num1[0] = 10;
	num1[1] = 8;
	num1[2] = 6;
	num1[3] = 4;
	num1[4] = 2;
	int num2[] = new int[5];
	int z = 4;
	
	
	for (int i = 0; i < num2.length; i++) {

	num2[i] = num1[z];
	z--;
	
	System.out.println(num2[i]);
	
	
}
}
}

/*15.	Criar um array com os valores 10, 8, 6, 4, 2 utilizando esta sequencia de inserção.
Criar um outro array de mesmo tamanho. Utilizando for,
pegar todos os valores presentes no primeiro array e inserir no segundo array de
forma decrescente (2, 4, 6, 8, 10). Desta forma os dois arrays terão os mesmo valores só que
nas posições inversas. Imprimir o segundo array para verificar se o algoritmo funcionou. 
*/