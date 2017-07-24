
package orientacao_a_objetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Teste_AlunoTurma {
public static void main(String[] args)throws ParseException {
	
	Aluno aluno = new Aluno();
	Turma T = new Turma();
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
	
	aluno.turma = T;
	
	aluno.nome = "José";
	aluno.rg = "123456";
	aluno.data_de_nascimento = sdf.parse("01/01/1996");
	
	aluno.turma.periodo = "Matutino";
	aluno.turma.serie = 1;
	aluno.turma.sigla = "JAV";
	aluno.turma.tipoEnsino = "Presencial";
	
	
	System.out.println(aluno.nome);
	System.out.println(aluno.rg);
	System.out.println(sdf.format(aluno.data_de_nascimento));

	System.out.println(aluno.turma.periodo);
	System.out.println(aluno.turma.serie);
	System.out.println(aluno.turma.sigla);
	System.out.println(aluno.turma.tipoEnsino);

}
}

