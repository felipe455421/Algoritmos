package exercicio1;
import java.util.Scanner;

public class _16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe os números desejados (separados por espaço):");
		String codigo = scanner.nextLine();
		String[] lista = codigo.split(" ");
		String resultado = "";
		for(int aux = 0; aux < lista.length; aux++){
			switch (lista[aux]) {
			case "1":
				resultado += "A";
				break;
			case "2":
				resultado += "B";
				break;
			case "3":
				resultado += "C";
				break;
			case "4":
				resultado += "D";
				break;
			case "5":
				resultado += "E";
				break;
			case "6":
				resultado += "F";
				break;
			case "7":
				resultado += "G";
				break;
			case "8":
				resultado += "H";
				break;
			case "9":
				resultado += "I";
				break;
			case "10":
				resultado += "J";
				break;
			case "11":
				resultado += "L";
				break;
			case "12":
				resultado += "M";
				break;
			case "13":
				resultado += "N";
				break;
			case "14":
				resultado += "O";
				break;
			case "15":
				resultado += "P";
				break;
			case "16":
				resultado += "Q";
				break;
			case "17":
				resultado += "R";
				break;
			case "18":
				resultado += "S";
				break;
			case "19":
				resultado += "T";
				break;
			case "20":
				resultado += "U";
				break;
			case "21":
				resultado += "V";
				break;
			case "22":
				resultado += "X";
				break;
			case "23":
				resultado += "Z";
				break;
			default:
				break;
			}
			resultado += " ";
		}
		System.out.println("As letras são: "+ resultado);
		scanner.close();
	}
	
}