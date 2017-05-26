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
		
		System.out.println("Você não mentiu para mim.");
		
	}else{
		
		System.out.println("Você mentiu para mim, você não é mais meu amigo.");

	}
}
}

/*5.	Peça para o usuário digitar a idade e ano de nascimento.
Pegue os valores que o usuário digitou.
Verifique se a idade digitada condiz com o ano de nascimento do usuário, ou seja, se realmente 
ele tem a idade que disse ter. Caso sim imprima “Você não mentiu para mim”, 
caso contrário, imprima “Você mentiu para mim, você não é mais meu amigo”.*/