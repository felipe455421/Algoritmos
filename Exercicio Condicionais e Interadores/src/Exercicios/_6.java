package Exercicios;
	import javax.swing.JOptionPane;
	
public class _6 {
public static void main(String[] args) {
	
	String city = JOptionPane.showInputDialog("Digite a sua cidade");
	String bairro = JOptionPane.showInputDialog("Digite o seu bairro");
	
	
	
	if (city.equalsIgnoreCase("Blumenau")){
		
		if (bairro.equalsIgnoreCase("Fortaleza")){
			
		JOptionPane.showMessageDialog(null,"Você se atrasará muito mais para o trabalho!");
		
		
		}else if (bairro.equalsIgnoreCase("Garcia")){
			
		JOptionPane.showMessageDialog(null,"Você tem que sair de madrugada para não pegar trânsito!");
			
			
		}else if (bairro.equalsIgnoreCase("Belchior")){
			
		JOptionPane.showMessageDialog(null,"OK, você gosta de pegar trânsito!");
		
		
		}else if (bairro.equalsIgnoreCase("Bela vista")){
			
		JOptionPane.showMessageDialog(null,"Pegue carona com quem vêem de Gaspar, economiza gasolina!");

		}
		
		
			
		int resul = JOptionPane.showConfirmDialog(null,"Você concorda com o que eu disse?");
		
		if(resul == 0){
		
		JOptionPane.showMessageDialog(null,"Show de bola");
				
		}else{
		
		JOptionPane.showMessageDialog(null,"Ok, problema é nosso!");
		
		
		
	}
	}
}
}



/*6.	Peça para o usuário digitar a cidade onde mora, armazene o valor em variável. 
Peça para o usuário digitar o bairro onde mora, armazene o valor em variável.
Com tais informações efetue as seguintes condições:

a.	Verifique se o usuário mora em “Blumenau” e no bairro “Velha”, 
caso sim, imprima “Você se atrasará para o trabalho!”.

b.	Verifique se o usuário mora em “Blumenau” e no bairro “Fortaleza”,
caso sim, imprima “Você se atrasará muito mais para o trabalho!”.

c.	Verifique se o usuário mora em “Blumenau” e no bairro “Garcia”, 
caso sim, imprima “Você tem que sair de madrugada para não pegar trânsito!”.

d.	Verifique se o usuário mora em “Gaspar” e no bairro “Belchior”, 
caso sim, imprima “OK, você gosta de pegar trânsito!”.

e.	Verifique se o usuário mora em “Blumenau” e no bairro “Bela vista”,
caso sim, imprima “Pegue carona com quem vêem de Gaspar, economiza gasolina!”.

f.	No final peça para o usuário responder a pergunta “Você concorda com o que eu disse?” 
utilizando System.out.println e pegue o que o usuário digitar com Scanner.
Caso o usuário digitar true, imprima “Show de bola”, caso contrário “Ok, problema é nosso!”.
*/