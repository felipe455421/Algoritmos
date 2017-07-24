package polimorfismo;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TesteControleDePonto {
public static void main(String[] args) throws ParseException {
	
	SimpleDateFormat sdf = new SimpleDateFormat ("dd/mm/yyyy hh:mm:ss");

	Gerentes func1 = new Gerentes("gegerok", "4151@1");
	func1.setNome("Robertinho");
	Telefonistas func2 = new Telefonistas("41521");
	func2.setNome("Andressa");
	func1.setCodigo(sdf.parse("01/05/1996 12:11:13"));
	
	ControleDePonto.registraEntrada(func1);
	ControleDePonto.registraSaida(func1);
	ControleDePonto.registraEntrada(func2);
	ControleDePonto.registraSaida(func2);

	
	System.out.println(func1.getNome());
	System.out.println(func2.getNome());

	
}
}
