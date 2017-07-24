
package orientacao_a_objetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Teste_AlunoTurma {
public static void main(String[] args)throws ParseException {
	
	Aluno aluno = new Aluno();
	Turma T = new Turma();
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
	
	aluno.setTurma(T);
	
	aluno.setNome("José");
	aluno.setRg("123456");
	aluno.setData_de_nascimento(sdf.parse("01/01/1996"));
	
	aluno.getTurma().setPeriodo("Matutino");
	aluno.getTurma().setSerie(1);
	aluno.getTurma().setSigla("JAV");
	aluno.getTurma().setTipoEnsino("Presencial");
	
	
	System.out.println(aluno.getNome());
	System.out.println(aluno.getRg());
	System.out.println(sdf.format(aluno.getData_de_nascimento()));

	System.out.println(aluno.getTurma().getPeriodo());
	System.out.println(aluno.getTurma().getSerie());
	System.out.println(aluno.getTurma().getSigla());
	System.out.println(aluno.getTurma().getTipoEnsino());

}
}

