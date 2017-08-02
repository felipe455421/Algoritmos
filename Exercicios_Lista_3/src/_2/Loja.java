package _2;

import java.text.DecimalFormat;

public abstract class Loja {

	private String nome;
	private double preco;
	private String codigoBarras;
	
	DecimalFormat df = new DecimalFormat("#0.00");
	
	public Loja(String nome, double preco,String codigoBarras) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.codigoBarras = codigoBarras;
	}
	
	public String toString(){
		return "Nome: " + this.nome + "\n" + "Preço: R$" + df.format(this.preco);
		
	}
}
