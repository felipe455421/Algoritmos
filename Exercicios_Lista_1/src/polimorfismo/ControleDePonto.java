package polimorfismo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ControleDePonto extends FuncionariosBanco {

	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/ yyyy HH:mm:ss");

	public static void registraEntrada(FuncionariosBanco f) {
		Date agora = new Date();
		System.out.println("ENTRADA : " + f.getCodigo());
		System.out.println("DATA : " + sdf.format(agora));
	}

	public static void registraSaida(FuncionariosBanco f) {
		Date agora = new Date();
		System.out.println("SAÍDA : " + f.getCodigo());
		System.out.println("DATA : " + sdf.format(agora));
	}
}
