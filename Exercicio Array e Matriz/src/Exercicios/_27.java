package Exercicios;

public class _27 {
public static void main(String[] args) {
	
	int num[][] = new int[3][3];
	num[0][0] = 3;
	num[0][1] = 2;
	num[0][2] = 3;
	num[1][0] = 2;
	num[1][1] = 2;
	num[1][2] = 3;
	num[2][0] = 1;
	num[2][1] = 1;
	num[2][2] = 2;
	
	int impar1 = 0;
	int par1 = 0;
	int impar2 = 0;
	int par2 = 0;
	int impar3 = 0;
	int par3 = 0;
	
	for (int i = 0; i < 3; i++) {
		for (int z = 0; z < 3; z++) {

			if (i == 0 && z == 0  && num[i][z] % 2 == 1) {

				impar1 = impar1 + num[i][z];
				

			} else if (i == 0 && z == 1	 && num[i][z] % 2 == 1) {

				impar1 = impar1 + num[i][z];

			} else if (i == 0 && z == 2	 && num[i][z] % 2 == 1) {

				impar1 = impar1 + num[i][z];

			}
			
			if (i == 0 && z == 0  && num[i][z] % 2 == 0) {

				par1 = par1 + num[i][z];

			} else if (i == 0 && z == 1	 && num[i][z] % 2 == 0) {

				par1 = par1 + num[i][z];

			} else if (i == 0 && z == 2	 && num[i][z] % 2 == 0) {

				par1 = par1 + num[i][z];

			}
			
			
			
			if (i == 1 && z == 0 && num[i][z] % 2 == 1	) {

				impar2 = impar2 + num[i][z];

			} else if (i == 1 && z == 1 && num[i][z] % 2 == 1) {

				impar2 = impar2 + num[i][z];

			} else if (i == 1 && z == 2 && num[i][z] % 2 == 1) {

				impar2 = impar2 + num[i][z];

			}
			
			if (i == 1 && z == 0  && num[i][z] % 2 == 0) {

				par2 = par2 + num[i][z];

			} else if (i == 1 && z == 1	 && num[i][z] % 2 == 0) {

				par2 = par2 + num[i][z];

			} else if (i == 1 && z == 2	 && num[i][z] % 2 == 0) {

				par2 = par2 + num[i][z];

			}
			
			
			
			
			if (i == 2 && z == 0 && num[i][z] % 2 == 1) {

				impar3 = impar3 + num[i][z];

			} else if (i == 2 && z == 1 && num[i][z] % 2 == 1) {

				impar3 = impar3 + num[i][z];

			} else if (i == 2 && z == 2 && num[i][z] % 2 == 1) {

				impar3 = impar3 + num[i][z];

			}
		
		
		if (i == 2 && z == 0  && num[i][z] % 2 == 0) {

			par3 = par3 + num[i][z];

		} else if (i == 2 && z == 1	 && num[i][z] % 2 == 0) {

			par3 = par3 + num[i][z];

		} else if (i == 2 && z == 2	 && num[i][z] % 2 == 0) {

			par3 = par3 + num[i][z];

		}

		}
	}

	System.out.println("Soma dos número ímpares da linha 0: " + impar1);
	System.out.println("Soma dos números pares da linha 0: " + par1);
	System.out.println("Soma dos número ímpares da linha 1: " + impar2);
	System.out.println("Soma dos números pares da linha 1: " + par2);
	System.out.println("Soma dos números pares da linha 2: " + impar3);
	System.out.println("Soma dos número ímpares da linha 2: " + par3);
}
}
/*27.	Conforme os moldes do exercício 31 e 32 seguindo os mesmos padrões, só que agora somar
os valores conforme exemplos abaixo:
a.	3 2 3
	2 2 3
	1 1 2

Soma dos número ímpares da linha 0: 6
Soma dos números pares da linha 0: 2
Soma dos número ímpares da linha 1: 3
Soma dos números pares da linha 1: 4
Soma dos número ímpares da linha 2: 2
Soma dos números pares da linha 2: 2
*/