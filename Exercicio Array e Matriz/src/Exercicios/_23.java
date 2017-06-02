package Exercicios;

import javax.swing.JOptionPane;

public class _23 {
public static void main(String[] args) {
	
	
	
	int num[] = new int [6];
	num[0] = 1;
	num[1] = 2;
	num[2] = 3;
	num[3] = 4;
	num[4] = 5;
	num[5] = 6;
	int i = 0;
	
    for (int x : num) {
    	
    	if (x % 2 == 0){
    		
    		num[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor a substitui-lo: "));
    		
        	System.out.println(num[i]);

    	}else{
    	
    	
        	System.out.println(x);
    	}
    	i++;

    	
    }
    
}

}
/*23.	Crie um array de 6 posições com os valores 1, 2, 3, 4, 5, 6.
Percorra o array procurando um valor par, se
encontado deve ser perguntado para o usuário um novo valor para substituir o valor presente no array.*/