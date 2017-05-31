package exercicio_1;
import javax.swing.JOptionPane;

public class _1 {
public static void main(String[] args) {
	
	double[] menuP = new double [15];
	
	menuP[0] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da pizza de Calabresa: "));
	menuP[1] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da pizza de 4 Queijos: "));
	menuP[2] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da pizza de Frango: "));
	menuP[3] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da pizza de Lombinho: "));
	menuP[4] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da pizza de Coração: "));
	menuP[5] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da pizza de Carne: "));
	menuP[6] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da pizza de Strogonoff de frango: "));
	menuP[7] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da pizza de Strogonoff de carne: "));
	menuP[8] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da pizza de 5 Queijos: "));
	menuP[9] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da pizza de Banana split: "));
	menuP[10] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da pizza de Sonho de valsa: "));
	menuP[11] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da pizza de Prestígio: "));
	menuP[12] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da pizza de Chocolate preto: "));
	menuP[13] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da pizza de Chocolate branco: "));
	menuP[14] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da pizza de Coco: "));

	System.out.println("Pizza de Calabresa é o item (1) e custa : " + menuP[0]);
	System.out.println("Pizza de 4 Queijos é o item (2) e custa : " + menuP[1]);
	System.out.println("Pizza de Frango é o item (3) e custa: " + menuP[2]);
	System.out.println("Pizza de Lombinho é o item (4) e custa: " + menuP[3]);
	System.out.println("Pizza de Coração é o item (5) e custa: " + menuP[4]);
	System.out.println("Pizza de Carne é o item (6) e custa: " + menuP[5]);
	System.out.println("Pizza de Strogonoff de frango é o item (7) e custa: " + menuP[6]);
	System.out.println("Pizza de Strogonoff de carne é o item (8) e custa: " + menuP[7]);
	System.out.println("Pizza de 5 Queijos é o item (9) e custa: " + menuP[8]);
	System.out.println("Pizza de Banana split é o item (10) e custa: " + menuP[9]);
	System.out.println("Pizza de Sonho de valsa é o item (11) e custa: " + menuP[10]);
	System.out.println("Pizza de Prestígio é o item (12) e custa: " + menuP[11]);
	System.out.println("Pizza de Chocolate preto é o item (13) e custa: " + menuP[12]);
	System.out.println("Pizza de Chocolate branco é o item (14) e custa: " + menuP[13]);
	System.out.println("Pizza de Coco é o item (15) e custa: " + menuP[14]);
	

	String pedidoNumero = JOptionPane.showInputDialog("Digite a seguir o numero da pizza que você deseja: ");
	String codigo = pedidoNumero;
	String[] lista = codigo.split(" ");
	String Resultado = "";
	for(int aux = 0; aux < lista.length; aux++){
		switch (lista[aux]) {
		case "1":
			Resultado += menuP[0];
			break;
		case "2":
			Resultado += menuP[1];
			break;
		case "3":
			Resultado += menuP[2];
			break;
		case "4":
			Resultado += menuP[3];
			break;
		case "5":
			Resultado += menuP[4];
			break;
		case "6":
			Resultado += menuP[5];
			break;
		case "7":
			Resultado += menuP[6];
			break;
		case "8":
			Resultado += menuP[7];
			break;
		case "9":
			Resultado += menuP[8];
			break;
		case "10":
			Resultado += menuP[9];
			break;
		case "11":
			Resultado += menuP[10];
			break;
		case "12":
			Resultado += menuP[1];
			break;
		case "13":
			Resultado += menuP[12];
			break;
		case "14":
			Resultado += menuP[13];
			break;
		case "15":
			Resultado += menuP[14];
			break;
		default:
			break;
		}
		System.out.println("O valor da pizza é R$"+ Resultado);			
}
}
}





