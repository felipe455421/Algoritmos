package Exercicios;

public class _12 {
	public static void main(String[] args) {

		boolean txt[] = new boolean[3];
		txt[0] = true;
		txt[1] = false;
		txt[2] = true;
		
		if (txt[0] || txt[1] || txt[2]){
			System.out.println(1);
			
		}else{
			System.out.println(2);

		}
		
	}
}
/*
 * 12. Criar um array do tipo boolean com 3 posições, com os valores true,
 * false, true. Utilizando for, verifique se comparado todos os valores boleanos
 * do array com o operador ou (||) é verdadeiro, caso sim imprima “1”, caso
 * contrário “2”.
 */