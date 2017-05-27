package Exercicios;
import javax.swing.JOptionPane;


public class _9 {
public static void main(String[] args) {
	
	String clima = JOptionPane.showInputDialog("Como está o Clima? (Ensolarado, Nublado ou Chovendo):");
	int Temperatura = Integer.parseInt(JOptionPane.showInputDialog("Como está a Temperatura? (Digite apenas numeros):"));

	/*A-*/ if (clima.equalsIgnoreCase("sol")){
		System.out.println("O dia está ensolarado logo você deverá usar uma Blusa");
		
	/*B-*/ }else if(clima.equalsIgnoreCase("Ensolarado") && Temperatura > 30){
		
		System.out.println("O dia está ensolarado e a temperatura está acima de 30º logo você deverá usar uma Saia");
		
	/*C-*/ }else if (clima.equalsIgnoreCase("Ensolarado") && Temperatura <= 30 && Temperatura >= 23){
			
		System.out.println("O dia está ensolarado e a temperatura está entre 30º e 23º logo você deverá usar um Shorts");
			
	/*D-*/ }else if (clima.equalsIgnoreCase("Ensolarado") && Temperatura < 23 ){
		
		System.out.println("O dia está ensolarado e a temperatura está abaixo de 23º logo você deverá usar uma Calça Jeans");
		
	/*E-*/ }else if (clima.equalsIgnoreCase("nublado") && Temperatura < 25 ){
		
		System.out.println("O dia está nublado e a temperatura está abaixo de 25º logo você deverá usar um Vestido");
			
	/*F-*/ }else if (clima.equalsIgnoreCase("nublado") && Temperatura <= 25 ){
		
		System.out.println("O dia está nublado e a temperatura está abaixo de 25º logo você deverá usar uma Calça de moleton e Sobretudo");
			
	/*G-*/ }else if (clima.equalsIgnoreCase("chovendo")){
		
		System.out.println("O dia está chuvoso logo você deverá usar um Calça Jeans");
		
	/*H-*/ }else if (clima.equalsIgnoreCase("chovendo") && Temperatura <= 10){
		
		System.out.println("O dia está chuvoso e a temperatura está abaixo de 10º logo você deverá usar uma Blusa e Casaco de Lã");
			
	/*I-*/ }else if (clima.equalsIgnoreCase("chovendo") && Temperatura > 10 && Temperatura < 25){
		
		System.out.println("O dia está chuvoso e a temperatura está entre 10º e 25º logo você deverá usar uma Camiseta");
			
	/*J-*/ }else if (clima.equalsIgnoreCase("chovendo") && Temperatura >= 25){
		
		System.out.println("O dia está chuvoso e a temperatura está entre 10º e 25º logo você deverá usar uma Blusa Regata");
		
	/*J-*/ }else{
		System.out.println("Voê não deveria sair de casa hoje");

	}
	
}
	
}
/*9.	Mariazinha quer sair com amigas no domingo a tarde no shopping.
Só que ela não sabe que roupa ela vai usar ainda, por que ela não viu o jornal do clima na tv.
Desta na hora de sair ela vai olhar para fora da janela e ver o tempo para verificar qual roupa
ela usará. Contudo a Mariazinha já nos disse o que ela usará em cada clima e temperatura. 
Desta forma, escreva um algoritmo que verifique as condições do tempo (clima e temperatura) e 
imprima no console qual a roupa que a Mariazinha escolheu para usar.

a.	Se estiver sol ela usuário blusa

b.	Se estiver sol e a temperatura estiver acima de 30° ela usará saia

c.	Se estiver sol e a temperatura estiver abaixo ou igual a 30° 
e maior ou igual a 23° ela usará shorts.

d.	Se estiver sol e a temperatura estiver abaixo de 23ª graus ela usuário calça jeans.

e.	Se estiver nublado e a temperatura estiver mais que 25° graus ela usará vestido.

f.	Se estiver nublado e a temperatura estiver menor ou igual a 25°
ela usará calça de moletom e sobretudo. 

g.	Se estiver chovendo ela usará bota e calça  jean

h.	Se estiver chovendo e a temperatura for menor ou igual a 10° ela usará blusa e um casaco de lã.

i.	Se estiver chovendo e a temperatura for maior que 10° e menor que 25° ela usará camisete. 

j.	Se estiver chovendo e a temperatura for maior ou igual a 25° ela usará uma blusa regata

k.	Caso contrário ela vai ficar em casa
*/