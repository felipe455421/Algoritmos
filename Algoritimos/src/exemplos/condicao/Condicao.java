package exemplos.condicao;

public class Condicao {
	
	public static void main(String[] args) {	
		boolean aguaFervendo = true ;
		if(aguaFervendo){
			System.out.println("�gua est� fervida");
		} else {
			System.out.println("�gua n�o est� fervida");
		}

		String _estadoAguaFervendo = "Fervendo";
		String _estadoAguaMorna = "Morna";
		String agua = "Morna";
		if(!_estadoAguaFervendo.equals(agua) || _estadoAguaMorna.equals(agua)){
			System.out.println("�gua pronta para o caf�.");
		} else {
			System.out.println("�gua n�o est� pronta para o caf�");
		}

	}
}
