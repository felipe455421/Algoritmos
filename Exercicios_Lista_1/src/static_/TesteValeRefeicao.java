package static_;

import orientacao_a_objetos.Funcionario;

public class TesteValeRefeicao {
public static void main(String[] args) {
	
	Funcionario.setValeRefeicao(25d);

	System.out.println(Funcionario.getValeRefeicao());
	
	Funcionario.reajustaValeRefeicaoDiario(20);
	
	System.out.println(Funcionario.getValeRefeicao());

}
}

