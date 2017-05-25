package exercicio1;

import java.math.BigDecimal;

public class _23 {
	public static void main(String[] args) {

		/* a. */ String texto = "Vinícius";
		String outroTexto = texto + "Ferneda";
		texto = outroTexto + "Ferneda";
		// System.out.println(outroTexto);
		System.out.println(texto);
		/*
		 * Console: ViniciusFernedaFerneda
		 */

		/* b. */ int numero = 1;
		int outroNumero = 2 + 1;
		System.out.println(numero + 2);
		outroNumero = numero + 1;
		outroNumero = outroNumero + numero;
		System.out.println(outroNumero);

		/*
		 * Console: 3 3
		 */

		/* c. */int numero1 = 10;
		int outroNumero1 = numero1;
		outroNumero1 = outroNumero1 + 10;
		// outroNumero += 3;
		numero1 = outroNumero1;
		numero1 = outroNumero1 + 1;
		System.out.println(numero1);
		outroNumero1 = numero1 + 1;
		System.out.println(numero1 + 1);

		/*
		 * Console: 21 22
		 */

		/* d. */// double numero2 = 0.1 + 0.2;
		// numero2 = 0.1 + 0.2;
		// double outroNumero2 = numero2 - 0.1;
		// numero2 = outroNumero2;
		// outroNumero2 = numero2 - 1;
		// System.out.println(numero2);
		BigDecimal big1 = new BigDecimal("0.1");
		BigDecimal big2 = new BigDecimal("0.2");
		BigDecimal bigResult = big1.add(big2);
		System.out.println(bigResult.toString());
		;

		/*
		 * Console: 0.3
		 */

		/* e. */// String numero3 = "A";
		// int texto3 = 1;
		int numero3 = 1;
		System.out.println(numero3);
		// numero3 = numero3 + numero3;
		// texto3 = texto3;
		numero3 = 2;
		System.out.println(numero3);

		/*
		 * Console: 1 2
		 */

		/* f. */ boolean numero4 = true;
		String booleano4 = "false";
		// numero4 = false | true;
		// booleano4 = "false | false";
		// numero4 = false | numero4;
		System.out.println(booleano4);
		System.out.println(numero4);

		/*
		 * Console: false true
		 */

	}
}
/*
 * 23. Diga se o código abaixo esta condizente com o que será impresso no
 * console, se não, o por que e diga o resultado correto.
 */