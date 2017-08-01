package _2;

public class DVDs  extends Loja{



	private String duracao;
	
	public DVDs(String nome, double preco, String duracao) {
		super(nome, preco);
	}
	
	public String toString(){
		return super.toString() + "\n" + "Esse filme possui a duração de: " + this.duracao + "Hrs";
	}
}
