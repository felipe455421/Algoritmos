package _2;

import java.text.DecimalFormat;

public abstract class Loja {

	private String nome;
	private double preco;
	
	DecimalFormat df = new DecimalFormat("#0.00");
	
	public Loja(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	
	public String toString(){
		return "Nome: " + this.nome + "\n" + "Preço: R$" + df.format(this.preco);
		
	}
}
