package orientacao_a_objetos;

public class Teste_turma {
public static void main(String[] args) {
	
	Turma turma1 = new Turma();
	turma1.periodo = "Matutino";
	turma1.serie = 1;
	turma1.sigla = "JAV";
	turma1.tipoEnsino = "Presencial";
	

	Turma turma2 = new Turma();
	turma2.periodo = "Noturno";
	turma2.serie = 3;
	turma2.sigla = "BD";
	turma2.tipoEnsino = "Semi-Presencial";
	
	System.out.println(turma1.periodo);
	System.out.println(turma1.serie);
	System.out.println(turma1.sigla);
	System.out.println(turma1.tipoEnsino);
	System.out.println(turma2.periodo);
	System.out.println(turma2.serie);
	System.out.println(turma2.sigla);
	System.out.println(turma2.tipoEnsino);

	
}
}