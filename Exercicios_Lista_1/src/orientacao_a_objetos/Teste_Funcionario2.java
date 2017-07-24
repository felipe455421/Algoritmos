package orientacao_a_objetos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Teste_Funcionario2 {
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("#0.00");
		int loop = 0;
		Funcionario func = new Funcionario();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um nome:");
		
		func.setNome(scanner.nextLine());
		System.out.println("Nome: " + func.getNome());
		while (loop == 0){
			
			System.out.println("Deseja continuar?(Sim ou Não)");
			String validate = scanner.nextLine();
			System.out.println("|--------------------------------------------------------|");;
		if(validate.equalsIgnoreCase("SIM")){
			
			System.out.println("Digite o nome do funcionario:");
			func.setNome(scanner.nextLine());
			System.out.println("Digite o salario do funcionario:");
			func.setSalario(Double.parseDouble(scanner.nextLine()));
			
			System.out.println("Nome: " + func.getNome() +"\n" + 
			"Salario: " + df.format(func.getSalario()));
			
		}else{
			
			System.exit(0);
		}
		
		

		}
		scanner.close();

}

}
