package Exercicios;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
public class _5 {
public static void main(String[] args) {
	
	int Age = Integer.parseInt(JOptionPane.showInputDialog("Digite o a sua idade:"));
	int BornYear = Integer.parseInt(JOptionPane.showInputDialog("Digite o o ano de nascimento:"));

	Calendar cal = GregorianCalendar.getInstance();
    int anoAtual = cal.get(Calendar.YEAR);
    
	if (Age == (anoAtual - BornYear)){
		
		System.out.println("Voc� n�o mentiu para mim.");
		
	}else{
		
		System.out.println("Voc� mentiu para mim, voc� n�o � mais meu amigo.");

	}
}
}

/*5.	Pe�a para o usu�rio digitar a idade e ano de nascimento.
Pegue os valores que o usu�rio digitou.
Verifique se a idade digitada condiz com o ano de nascimento do usu�rio, ou seja, se realmente 
ele tem a idade que disse ter. Caso sim imprima �Voc� n�o mentiu para mim�, 
caso contr�rio, imprima �Voc� mentiu para mim, voc� n�o � mais meu amigo�.*/