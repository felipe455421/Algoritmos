package orientacao_a_objetos;

import java.text.DecimalFormat;

public class TesteHeranca {
public static void main(String[] args) {
	
	DecimalFormat df = new DecimalFormat("#0.00");
	
	Gerentes funcGerente = new Gerentes("Rafinha123","21256d");
	Secretarias funcSecretaria = new Secretarias("215456");
	Telefonistas funcTelefonista = new Telefonistas("5542");
	
	funcTelefonista.setNome("Pedro");
	funcTelefonista.setSalario(1500d);
	
	funcSecretaria.setNome("Josepha");
	funcSecretaria.setSalario(2000d);

	funcGerente.setNome("Rafael");
	funcGerente.setSalario(1000d);


	System.out.println(funcTelefonista.getCdgTrabalho());
	System.out.println(funcTelefonista.getNome());
	System.out.println(df.format(funcTelefonista.getSalario()));

	System.out.println(funcSecretaria.getNmrRamal());
	System.out.println(funcSecretaria.getNome());
	System.out.println(df.format(funcSecretaria.getSalario()));

	
	System.out.println(funcGerente.getNomeUsr());
	System.out.println(funcGerente.getSenha());
	System.out.println(df.format(funcGerente.getSalario()));

	funcTelefonista.salarioBonifica();
	funcSecretaria.salarioBonifica();
	funcGerente.salarioBonifica();
	
	System.out.println("Salarios alterados");
	System.out.println(df.format(funcTelefonista.getSalario()));
	System.out.println(df.format(funcSecretaria.getSalario()));
	System.out.println(df.format(funcGerente.getSalario()));
	
	System.out.println(funcTelefonista.mostraDados());
	System.out.println("--------------------------------");
	System.out.println(funcSecretaria.mostraDados());
	System.out.println("--------------------------------");
	System.out.println(funcGerente.mostraDados());

	



	

}
}
