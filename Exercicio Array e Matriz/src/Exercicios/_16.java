package Exercicios;

import javax.swing.JOptionPane;

public class _16 {
public static void main(String[] args) {
	String num[] = new String[10];
	String alf = "A";
	int z = 0;
	int answer = 0;
	while (answer == 0){
	
	
	for (int i = 0; i < num.length; i++) {
		
		if (num[i]  == null){
			
			num[i] = "W";
			
		
		
		if (i == 1 || i == 3 || i == 4 || i == 6){
				
		
	    alf = String.format("%c", 'A' + z);
	    z++;
	    
	    
	    num[i] = alf;
	    

		
		}
		
		
		}
	System.out.println(num[i]);    
	

	
	
	}
	
	answer = JOptionPane.showConfirmDialog(null, "Deseja continuar");
	
}
}
}
/*16.	Criar um array com 10 posi��es. Inserir nas posi��es 2, 4, 5, 7 os respectivos
valores �A�, �B�, �C�, �D�. Com for ou while, inserir a letra �W� nas posi��es do array no
qual n�o tem valor (verificar a posi��o do array com null para validar se possui valor ou n�o 
na posi��o do array, array[i] == null).
Imprimir o array para verificar se o algoritmo funcionou. Fazer o exerc�cio utilizando for ou while.*/