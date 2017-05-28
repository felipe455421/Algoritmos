package Exercicios;

public class _29 {
public static void main(String[] args) {
	

	
	String s1 = "Felipe";
	String s2 = "21";
	String s3 = "Blumenau";
	String s4 = "Pais";
	String s5 = "Fortaleza";
		
	
	String texto = "Olá, tudo bem? Meu nome é %s, tenho %s anos de idade, e moro em %s desde de que eu nasci. Moro com o(s) meu(s) %s, no bairro da %s.";
	
	System.out.println(String.format(texto, s1,s2,s3,s4,s5));
	
}	
}
/*29.	Utlizando o template abaixo, substitua os locais com “$$$” por valores que fazem sentido, utilizando variáveis. Após imprima o texto convertido com os valores.
a.	“Olá, tudo bem? Meu nome é $$$, tenho $$$ anos de idade, e moro em $$$ desde de que eu nasci. Moro com o(s) meu(s) $$$, no bairro da $$$.”*/
