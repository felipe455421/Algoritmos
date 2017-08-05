package _2;

public class CDs extends Produto{

	

	private String nmrFaixas;
	
	public CDs(String nome, double preco,String codigoBarras, String nmrFaixas) {
		super(nome, preco, codigoBarras);
		this.nmrFaixas = nmrFaixas;
	}
	
	public String toString(){
		return super.toString() + "\n" + "Numero de faixas do CD: " + this.nmrFaixas;
	}

}
