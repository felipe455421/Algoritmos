package Exercicios;
import javax.swing.JOptionPane;


public class _9 {
public static void main(String[] args) {
	
	String clima = JOptionPane.showInputDialog("Como est� o Clima? (Ensolarado, Nublado ou Chovendo):");
	int Temperatura = Integer.parseInt(JOptionPane.showInputDialog("Como est� a Temperatura? (Digite apenas numeros):"));

	/*A-*/ if (clima.equalsIgnoreCase("sol")){
		System.out.println("O dia est� ensolarado logo voc� dever� usar uma Blusa");
		
	/*B-*/ }else if(clima.equalsIgnoreCase("Ensolarado") && Temperatura > 30){
		
		System.out.println("O dia est� ensolarado e a temperatura est� acima de 30� logo voc� dever� usar uma Saia");
		
	/*C-*/ }else if (clima.equalsIgnoreCase("Ensolarado") && Temperatura <= 30 && Temperatura >= 23){
			
		System.out.println("O dia est� ensolarado e a temperatura est� entre 30� e 23� logo voc� dever� usar um Shorts");
			
	/*D-*/ }else if (clima.equalsIgnoreCase("Ensolarado") && Temperatura < 23 ){
		
		System.out.println("O dia est� ensolarado e a temperatura est� abaixo de 23� logo voc� dever� usar uma Cal�a Jeans");
		
	/*E-*/ }else if (clima.equalsIgnoreCase("nublado") && Temperatura < 25 ){
		
		System.out.println("O dia est� nublado e a temperatura est� abaixo de 25� logo voc� dever� usar um Vestido");
			
	/*F-*/ }else if (clima.equalsIgnoreCase("nublado") && Temperatura <= 25 ){
		
		System.out.println("O dia est� nublado e a temperatura est� abaixo de 25� logo voc� dever� usar uma Cal�a de moleton e Sobretudo");
			
	/*G-*/ }else if (clima.equalsIgnoreCase("chovendo")){
		
		System.out.println("O dia est� chuvoso logo voc� dever� usar um Cal�a Jeans");
		
	/*H-*/ }else if (clima.equalsIgnoreCase("chovendo") && Temperatura <= 10){
		
		System.out.println("O dia est� chuvoso e a temperatura est� abaixo de 10� logo voc� dever� usar uma Blusa e Casaco de L�");
			
	/*I-*/ }else if (clima.equalsIgnoreCase("chovendo") && Temperatura > 10 && Temperatura < 25){
		
		System.out.println("O dia est� chuvoso e a temperatura est� entre 10� e 25� logo voc� dever� usar uma Camiseta");
			
	/*J-*/ }else if (clima.equalsIgnoreCase("chovendo") && Temperatura >= 25){
		
		System.out.println("O dia est� chuvoso e a temperatura est� entre 10� e 25� logo voc� dever� usar uma Blusa Regata");
		
	/*J-*/ }else{
		System.out.println("Vo� n�o deveria sair de casa hoje");

	}
	
}
	
}
/*9.	Mariazinha quer sair com amigas no domingo a tarde no shopping.
S� que ela n�o sabe que roupa ela vai usar ainda, por que ela n�o viu o jornal do clima na tv.
Desta na hora de sair ela vai olhar para fora da janela e ver o tempo para verificar qual roupa
ela usar�. Contudo a Mariazinha j� nos disse o que ela usar� em cada clima e temperatura. 
Desta forma, escreva um algoritmo que verifique as condi��es do tempo (clima e temperatura) e 
imprima no console qual a roupa que a Mariazinha escolheu para usar.

a.	Se estiver sol ela usu�rio blusa

b.	Se estiver sol e a temperatura estiver acima de 30� ela usar� saia

c.	Se estiver sol e a temperatura estiver abaixo ou igual a 30� 
e maior ou igual a 23� ela usar� shorts.

d.	Se estiver sol e a temperatura estiver abaixo de 23� graus ela usu�rio cal�a jeans.

e.	Se estiver nublado e a temperatura estiver mais que 25� graus ela usar� vestido.

f.	Se estiver nublado e a temperatura estiver menor ou igual a 25�
ela usar� cal�a de moletom e sobretudo. 

g.	Se estiver chovendo ela usar� bota e cal�a  jean

h.	Se estiver chovendo e a temperatura for menor ou igual a 10� ela usar� blusa e um casaco de l�.

i.	Se estiver chovendo e a temperatura for maior que 10� e menor que 25� ela usar� camisete. 

j.	Se estiver chovendo e a temperatura for maior ou igual a 25� ela usar� uma blusa regata

k.	Caso contr�rio ela vai ficar em casa
*/