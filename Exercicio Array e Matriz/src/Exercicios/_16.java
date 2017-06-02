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
/*16.	Criar um array com 10 posições. Inserir nas posições 2, 4, 5, 7 os respectivos
valores “A”, “B”, “C”, “D”. Com for ou while, inserir a letra “W” nas posições do array no
qual não tem valor (verificar a posição do array com null para validar se possui valor ou não 
na posição do array, array[i] == null).
Imprimir o array para verificar se o algoritmo funcionou. Fazer o exercício utilizando for ou while.*/