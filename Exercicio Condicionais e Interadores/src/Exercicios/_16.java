package Exercicios;

import javax.swing.JOptionPane;

public class _16 {
public static void main(String[] args) {
	
	String name1 = " ";
	String name2 = " ";
	String troca = " ";
	int age1;
	int age2;
	
	
	name1 = JOptionPane.showInputDialog("Digite o primeiro nome:");
	age1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira idade:"));
	
	name2 = JOptionPane.showInputDialog("Digite o segundo nome:");
	age2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda idade:"));
	
	
	if (age1 > age2){
		
		 
		
	}else{

		troca = name1;
		name1 = name2;
		name2 = troca;
		age1 = age1 + age2;
		age2 = age1 - age2;
		age1 = age1 - age2;
				
	}
	System.out.println(name1 + " " + age1 + "\n" + name2 + " " + age2);
	
	
}


	
}

/*Pergunte o nome da pessoa e a sua idade. Pergunte o nome de outra pessoa e sua idade. Imprima o nome da pessoa mais velha e a idade dela, e o nome da pessoa mais nova e a idade dela, 
utilizando apenas um Sysout. Sendo considerado a idade uma variável int.*/