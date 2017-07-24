package arrays;

import java.util.Arrays;

public class OrdenaArray {
public static void main(String[] args) {
	
	int [] numeros = new int []{10,5,4,8,9,7,6,3,1,2};

	Arrays.sort (numeros);

	for(int numero : numeros){
		System.out.println(numero);
		
	}
}
}
