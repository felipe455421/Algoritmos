package Exercicios;
	import javax.swing.JOptionPane;
	
public class _6 {
public static void main(String[] args) {
	
	String city = JOptionPane.showInputDialog("Digite a sua cidade");
	String bairro = JOptionPane.showInputDialog("Digite o seu bairro");
	
	
	
	if (city.equalsIgnoreCase("Blumenau")){
		
		if (bairro.equalsIgnoreCase("Fortaleza")){
			
		JOptionPane.showMessageDialog(null,"Voc� se atrasar� muito mais para o trabalho!");
		
		
		}else if (bairro.equalsIgnoreCase("Garcia")){
			
		JOptionPane.showMessageDialog(null,"Voc� tem que sair de madrugada para n�o pegar tr�nsito!");
			
			
		}else if (bairro.equalsIgnoreCase("Belchior")){
			
		JOptionPane.showMessageDialog(null,"OK, voc� gosta de pegar tr�nsito!");
		
		
		}else if (bairro.equalsIgnoreCase("Bela vista")){
			
		JOptionPane.showMessageDialog(null,"Pegue carona com quem v�em de Gaspar, economiza gasolina!");

		}
		
		
			
		int resul = JOptionPane.showConfirmDialog(null,"Voc� concorda com o que eu disse?");
		
		if(resul == 0){
		
		JOptionPane.showMessageDialog(null,"Show de bola");
				
		}else{
		
		JOptionPane.showMessageDialog(null,"Ok, problema � nosso!");
		
		
		
	}
	}
}
}



/*6.	Pe�a para o usu�rio digitar a cidade onde mora, armazene o valor em vari�vel. 
Pe�a para o usu�rio digitar o bairro onde mora, armazene o valor em vari�vel.
Com tais informa��es efetue as seguintes condi��es:

a.	Verifique se o usu�rio mora em �Blumenau� e no bairro �Velha�, 
caso sim, imprima �Voc� se atrasar� para o trabalho!�.

b.	Verifique se o usu�rio mora em �Blumenau� e no bairro �Fortaleza�,
caso sim, imprima �Voc� se atrasar� muito mais para o trabalho!�.

c.	Verifique se o usu�rio mora em �Blumenau� e no bairro �Garcia�, 
caso sim, imprima �Voc� tem que sair de madrugada para n�o pegar tr�nsito!�.

d.	Verifique se o usu�rio mora em �Gaspar� e no bairro �Belchior�, 
caso sim, imprima �OK, voc� gosta de pegar tr�nsito!�.

e.	Verifique se o usu�rio mora em �Blumenau� e no bairro �Bela vista�,
caso sim, imprima �Pegue carona com quem v�em de Gaspar, economiza gasolina!�.

f.	No final pe�a para o usu�rio responder a pergunta �Voc� concorda com o que eu disse?� 
utilizando System.out.println e pegue o que o usu�rio digitar com Scanner.
Caso o usu�rio digitar true, imprima �Show de bola�, caso contr�rio �Ok, problema � nosso!�.
*/