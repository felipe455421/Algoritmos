package Exercicios;

public class _26 {
	public static void main(String[] args) {

		String texto;
		String texto1;
		String texto2;
		String texto3;

		texto = "25/05/2015";

		int posicao = texto.indexOf("2");
		int posicao1 = texto.lastIndexOf("/0");

		texto1 = texto.substring(posicao, posicao1);

		int posicao2 = texto.indexOf("0");
		int posicao3 = texto.lastIndexOf("/");

		texto2 = texto.substring(posicao2, posicao3);

		int posicao4 = texto.indexOf("20");
		int posicao5 = texto.lastIndexOf("");

		texto3 = texto.substring(posicao4, posicao5);

		System.out.println("O dia � " + texto1 + " , do m�s " + texto2 + " , do ano " + texto3);

	}
}

// Da data em texto �25/05/2015�, extraia o dia, m�s e ano e imprima a data da
// seguinte forma (O dia � {dia}, do m�s {m�s}, do ano {ano}).
