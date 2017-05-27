package Exercicios;
import javax.swing.JOptionPane;

public class _10 {
public static void main(String[] args) {
	
	double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro numero"));
	double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo numero"));

		double soma1 = num1 + num2;
				
				
	if (soma1 > 20){
		System.out.println("A: " +soma1+ " é maior que 20");
	
	}else{
		
		System.out.println("A:   ");
	}
	
	if (soma1 > 30){
		System.out.println("B: " +soma1+ " é maior que 30");
	
	}else{
		
		System.out.println("B:   ");
		
	}
	
	if (soma1 > 10){
		System.out.println("C: " +soma1+ " é maior que 10");
	
	}else if (soma1 > 20){

		System.out.println("C: " +soma1+ "maior que 20");
		
	}else{

	
		System.out.println("C:   ");

	}
	
	if (soma1 % 5 ==0 && soma1 % 10 == 0){
		System.out.println("D: " +soma1+ " é multiplo de 5");
	
	}else if (soma1 % 10 == 0){
		System.out.println("D: " +soma1+ " é multiplo de 10");
		
		
	}else{
		
		System.out.println("D:   ");
		
	}
	
	if (soma1 % 5 == 0){
		System.out.println("E: " +soma1+ " é multiplo de 5");
		
		
	}else if (soma1 % 10 == 0){
		System.out.println("E: " +soma1+ " é multiplo de 10");
		
	}else if (num1== 5){
		System.out.println("E: " +soma1+ " o primeiro numero digitado é 5");
		
		
	
	}else{
		
		System.out.println("E:   ");
		
	}
	
	
}
}
/*10.	Peça para o usuário digitar dois números double. E efetue as seguintes validações:
	
a.	Se a soma dos números for maior que 20, imprima no console “<resultado da soma> é maior que 20”

b.	Se a soma dos números for maior que 30, imprima no console “<resultado da soma> é maior que 30”

c.	Se a soma dos números for maior que 10 ou maior que 20, imprima no console
“<resultado da soma> é maior que 10 ou <resultado da soma> maior que 20 ”

d.	Se a soma dos número é múltiplo de 5 e múltiplo de 10, imprima no console
“<resultado da soma> é múltiplo de 5 e <resultado da soma> de 10”

e.	Se a soma dos número é múltiplo de 5 e múltiplo de 10, ou o primeiro número digitado é 5,
imprima no console “<resultado da soma> é múltiplo de 5 e <resultado da soma> de 10 ou o
<primeiro número digitado> é 5”
*/