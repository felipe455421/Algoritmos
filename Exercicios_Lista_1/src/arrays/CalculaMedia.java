package arrays;

import java.util.Arrays;

public class CalculaMedia {
public static void main(String[] args) {
	
	int soma = 0;
	double media;
	int[] numeros = new int[]{10,5,4,8,9,7,6,3,1,2};
	
	Arrays.sort (numeros);

	for(int i = 0; i < numeros.length; i++) {
		
		soma += numeros[i];
		

	
	}
	media = soma / numeros.length;
    System.out.println (media);

}
}