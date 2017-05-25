package exercicio1;

public class _22 {
public static void main(String[] args) {
	
	boolean teste = true;
	boolean outroTeste = false;
	System.out.println(teste + "  " + outroTeste);
	outroTeste = teste ^ outroTeste;	
	System.out.println(teste + "  " + outroTeste);
	teste = false;
	System.out.println(teste + "  " + outroTeste);


			
	
	
}
}
/*22.	Crie uma variável de nome “teste” do tipo boolean com o valor true.
Crie outra variável de nome “outroTeste” do tipo boolean com o valor false.
Imprima os valores das duas variáveis. Coloque o valor da variável “teste” na 
variável “outroTeste”. Imprima novamente ambas as variáveis. Agora coloque o 
valor false na variável “teste”, e imprima ambas as variáveis novamente.
Verifique o que aconteceu.*/