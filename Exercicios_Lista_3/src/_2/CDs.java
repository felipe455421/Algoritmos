package _2;

public class CDs extends Loja{

	

	private String nmrFaixas;
	
	public CDs(String nome, double preco, String nmrFaixas) {
		super(nome, preco);
		this.nmrFaixas = nmrFaixas;
	}
	
	public String toString(){
		return super.toString() + "\n" + "Numero de faixas do CD: " + this.nmrFaixas;
	}
}
