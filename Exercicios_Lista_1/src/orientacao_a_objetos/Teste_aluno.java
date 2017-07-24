
package orientacao_a_objetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Teste_aluno {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("José");
		aluno1.setRg("123456");
		aluno1.setData_de_nascimento(sdf.parse("01/01/1996"));
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Maria");
		aluno2.setRg("654321");
		aluno2.setData_de_nascimento(sdf.parse("02/02/1998"));
		
		System.out.println(aluno1.getNome());
		System.out.println(aluno1.getRg());
		System.out.println(sdf.format(aluno1.getData_de_nascimento()));
		System.out.println(aluno2.getNome());
		System.out.println(aluno2.getRg());
		System.out.println(sdf.format(aluno2.getData_de_nascimento()));

	}
}
