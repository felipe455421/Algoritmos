package Exercicios;
import javax.swing.JOptionPane;



public class _15 {
public static void main(String[] args) {
	
	
	int mes;
	int dia;
	
	dia = Integer.parseInt(JOptionPane.showInputDialog("Digite um dia do m�s:"));
	mes = Integer.parseInt(JOptionPane.showInputDialog("Digite um m�s (em numeros):"));
	String Validate = " ";
	
	
	if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia >= 1 && dia <= 31)){
		
		Validate = "O dia e o m�s que voc� digitou est�o corretos";
		
	}else if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia >= 1 && dia <= 30) ){
		
		Validate = "O dia e o m�s que voc� digitou est�o corretos";
		
	
	}else if ((mes == 2) && (dia >= 29 && dia <= 1)){
		
		Validate = "O dia e o m�s que voc� digitou est�o corretos";
		
	}else{
		
		Validate = "O dia ou o m�s que voc� digitou n�o est�o corretos";
		
	}
	
		
		System.out.println(Validate);
		
}
}

/*15.	Pergunte para o usu�rio um dia do m�s e n�mero do m�s. Fa�a um algoritmo que 
valide se o dia e o m�s existem no calend�rio, utilizando apenas um Sysout. 
Sendo considerado duas vari�veis int um para dia e outra para m�s.*/