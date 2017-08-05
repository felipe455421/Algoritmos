package _2;

public class DVDs  extends Produto{



	private String duracao;
	
	public DVDs(String nome, double preco,String codigoBarras, String duracao) {
		super(nome, preco, codigoBarras);
		this.duracao = duracao;
	}
	
	public String toString(){
		return super.toString() + "\n" + "Esse filme possui a duração de: " + this.duracao + " Hrs";
	}
}
