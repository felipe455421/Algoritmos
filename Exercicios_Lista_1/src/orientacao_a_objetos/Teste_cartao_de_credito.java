
package orientacao_a_objetos;

import java.text.ParseException;

import java.text.SimpleDateFormat;



public class Teste_cartao_de_credito {
public static void main(String[] args) throws ParseException {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

	Cartao_de_Credito cartaoCredito1 = new Cartao_de_Credito("123456789");
	cartaoCredito1.data_de_validade = sdf.parse("01/01/2020");
	
	Cartao_de_Credito cartaoCredito2 = new Cartao_de_Credito("987654321");
	cartaoCredito2.data_de_validade = sdf.parse("01/01/2021");
	
	
	
	System.out.println("Cartão 1: " + cartaoCredito1.numero_do_cartao + " com validade até " + sdf.format(cartaoCredito1.data_de_validade));
	System.out.println("Cartão 2: " + cartaoCredito2.numero_do_cartao + " com validade até " + sdf.format(cartaoCredito2.data_de_validade));

}
}