
package orientacao_a_objetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Teste_cartaoDeCredito_clientes {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		Cartao_de_Credito cdc1 = new Cartao_de_Credito("123456789");
		Clientes c1 = new Clientes();

		cdc1.cliente = c1;

		cdc1.cliente.nome = "Felipe";
		cdc1.cliente.codigo = 15;

		cdc1.data_de_validade = sdf.parse("01/01/2020");
		
		System.out.println(cdc1.cliente.nome);
		System.out.println(cdc1.cliente.codigo);
		System.out.println(cdc1.numero_do_cartao);
		System.out.println(sdf.format(cdc1.data_de_validade));

		

	}

}
