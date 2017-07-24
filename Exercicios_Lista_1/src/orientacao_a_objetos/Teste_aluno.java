
package orientacao_a_objetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Teste_aluno {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "José";
		aluno1.rg = "123456";
		aluno1.data_de_nascimento = sdf.parse("01/01/1996");
		
		Aluno aluno2 = new Aluno();
		aluno2.nome = "Maria";
		aluno2.rg = "654321";
		aluno2.data_de_nascimento = sdf.parse("02/02/1998");
		
		System.out.println(aluno1.nome);
		System.out.println(aluno1.rg);
		System.out.println(sdf.format(aluno1.data_de_nascimento));
		System.out.println(aluno2.nome);
		System.out.println(aluno2.rg);
		System.out.println(sdf.format(aluno2.data_de_nascimento));

	}
}
