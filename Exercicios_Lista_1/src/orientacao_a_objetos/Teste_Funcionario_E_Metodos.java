package orientacao_a_objetos;


public class Teste_Funcionario_E_Metodos {
public static void main(String[] args) {
	
	Funcionario funcionario1 = new Funcionario();
	funcionario1.setNome("Joaquim"); 
	funcionario1.setSalario(1500d);
	
	funcionario1.aumentaSalario(5000d);
	
	System.out.println(funcionario1.consultaFuncionario());
}
}