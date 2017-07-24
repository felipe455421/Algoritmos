package classes_abstratas;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TesteFuncionariosBanco {
public static void main(String[] args) throws ParseException {
	
	DecimalFormat df = new DecimalFormat("#0.00");
	SimpleDateFormat sdf = new SimpleDateFormat ("dd/mm/yyyy hh:mm:ss");

	Gerentes func1 = new Gerentes("asdwe","154a!");
	func1.setNome("Robertinho");
	func1.setSalario(1500d);
	func1.setCodigo(sdf.parse("01/05/1996 12:11:13"));

	System.out.println(func1.getNome());
	System.out.println(sdf.format(func1.getCodigo()));

	func1.bonifica(10);
	System.out.println(df.format(func1.getSalario()));
	
}
}
