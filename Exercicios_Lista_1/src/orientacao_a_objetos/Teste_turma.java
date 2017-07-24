package orientacao_a_objetos;

public class Teste_turma {
public static void main(String[] args) {
	
	Turma turma1 = new Turma();
	turma1.setPeriodo("Matutino");
	turma1.setSerie(1);
	turma1.setSigla("JAV");
	turma1.setTipoEnsino("Presencial");
	

	Turma turma2 = new Turma();
	turma2.setPeriodo("Noturno");
	turma2.setSerie(3);
	turma2.setSigla("BD");
	turma2.setTipoEnsino("Semi-Presencial");
	


	
	System.out.println(turma1.getPeriodo());
	System.out.println(turma1.getSerie());
	System.out.println(turma1.getSigla());
	System.out.println(turma1.getTipoEnsino());
	System.out.println(turma2.getPeriodo());
	System.out.println(turma2.getSerie());
	System.out.println(turma2.getSigla());
	System.out.println(turma2.getTipoEnsino());

	
}
}