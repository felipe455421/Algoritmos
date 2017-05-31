package Exercicios;

public class _24 {
public static void main(String[] args) {
	
	char let[] = new char[20];
	let[0] = 'e';
	let[1] = 's';
	let[2] = 't';
	let[3] = 'a';
	let[4] = ' ';
	let[5] = 'a';
	let[6] = 'c';
	let[7] = 'a';
	let[8] = 'b';
	let[9] = 'a';
	let[10] = 'n';
	let[11] = 'd';
	let[12] = 'o';
	let[13] = ' ';
	let[14] = 'a';
	let[15] = ' ';
	let[16] = 'a';
	let[17] = 'u';
	let[18] = 'l';
	let[19] = 'a';
	String frase = "";
	for (int i = 0; i < let.length; i++) {
    	frase += let[i];
	

}

System.out.println(frase);
}
}
/*24.	Criar um array de char com os seguintes valores,
‘e’, ‘s’, ‘t’, ‘a’, ‘ ’, ‘a’, ‘c’, ‘a’, ‘b’, ‘a’, ‘n’, ‘d’, ‘o’, ‘ ’, ‘a’, ‘ ’, ‘a’, ‘u’, ‘l’, ‘a’.
Percorrer o array de char, e armazenar em uma String, para formar o seguinte texto,
“esta acabando a aula”. Imprimir este texto no final com o valor da variável String.*/