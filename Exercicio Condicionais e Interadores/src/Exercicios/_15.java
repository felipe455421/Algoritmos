package Exercicios;
import javax.swing.JOptionPane;



public class _15 {
public static void main(String[] args) {
	
	
	int mes;
	int dia;
	
	dia = Integer.parseInt(JOptionPane.showInputDialog("Digite um dia do mês:"));
	mes = Integer.parseInt(JOptionPane.showInputDialog("Digite um mês (em numeros):"));
	String Validate = " ";
	
	
	if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia >= 1 && dia <= 31)){
		
		Validate = "O dia e o mês que você digitou estão corretos";
		
	}else if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia >= 1 && dia <= 30) ){
		
		Validate = "O dia e o mês que você digitou estão corretos";
		
	
	}else if ((mes == 2) && (dia >= 29 && dia <= 1)){
		
		Validate = "O dia e o mês que você digitou estão corretos";
		
	}else{
		
		Validate = "O dia ou o mês que você digitou não estão corretos";
		
	}
	
		
		System.out.println(Validate);
		
}
}

/*15.	Pergunte para o usuário um dia do mês e número do mês. Faça um algoritmo que 
valide se o dia e o mês existem no calendário, utilizando apenas um Sysout. 
Sendo considerado duas variáveis int um para dia e outra para mês.*/