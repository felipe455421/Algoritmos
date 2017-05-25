package exercicio1;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;
public class _14 {
public static void main(String[] args) {
	
	String Name = (JOptionPane.showInputDialog("Digite seu nome:"));
	int BornYear = Integer.parseInt(JOptionPane.showInputDialog("Digite seu Ano de nascimento:"));
	String Phone = (JOptionPane.showInputDialog("Digite seu telefone"));
	String City = (JOptionPane.showInputDialog("Digite sua cidade de nascimento"));
	
	Calendar cal = GregorianCalendar.getInstance();
    int anoAtual = cal.get(Calendar.YEAR);

	
	System.out.println("Meu nome é " + Name + ", nasci no ano " + BornYear + ", tenho " + 
	(anoAtual - BornYear) + " anos. \nSe você quiser entrar em contato comigo, pode "
			+ "ligar para o telefone " + Phone + ".\nHá esqueci de te dizer aonde eu nasci, "
					+ "foi na cidade de " + City +".");
	
	
}
}
/*14.	Escreva no console as seguintes questão:
a.	Pergunte para o usuário as seguintes questões, as responta e armazene em variáveis.
i.	Digite seu nome:
ii.	Digite seu ano de nascimento:
iii.	Digite seu telefone:
iv.	Digite a cidade de nascimento
b.	Imprima no console o seguinte texto concatenando as variáveis
i.	Meu nome é <nome>, nasci no ano <ano de nascimento>, tenho <idade> anos.
Se você quiser entrar em contato comigo, pode ligar para o telefone <telefone>. 
Há esqueci de te dizer aonde eu nasci, foi na cidade de <cidade de nascimento>.
*/