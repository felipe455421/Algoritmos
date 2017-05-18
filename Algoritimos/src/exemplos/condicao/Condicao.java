package exemplos.condicao;

public class Condicao {
	
	public static void main(String[] args) {	
		boolean aguaFervendo = true ;
		if(aguaFervendo){
			System.out.println("Água está fervida");
		} else {
			System.out.println("Água não está fervida");
		}

		String _estadoAguaFervendo = "Fervendo";
		String _estadoAguaMorna = "Morna";
		String agua = "Morna";
		if(!_estadoAguaFervendo.equals(agua) || _estadoAguaMorna.equals(agua)){
			System.out.println("Água pronta para o café.");
		} else {
			System.out.println("Água não está pronta para o café");
		}

	}
}
