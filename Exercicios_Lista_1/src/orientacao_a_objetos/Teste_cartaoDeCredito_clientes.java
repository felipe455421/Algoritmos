
package orientacao_a_objetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Teste_cartaoDeCredito_clientes {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		Cartao_de_Credito cdc1 = new Cartao_de_Credito("123456789");
		Clientes c1 = new Clientes();

		cdc1.setCliente(c1);

		cdc1.getCliente().setNome("Felipe");
		cdc1.getCliente().setCodigo(15);

		cdc1.setData_de_validade(sdf.parse("01/01/2020"));
		
		System.out.println(cdc1.getCliente().getNome());
		System.out.println(cdc1.getCliente().getCodigo());
		System.out.println(cdc1.getNumero_do_cartao());
		System.out.println(sdf.format(cdc1.getData_de_validade()));

		

	}

}
